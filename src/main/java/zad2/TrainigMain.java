package zad2;

import zad2.controller.AdminPanel;
import zad2.controller.TrainingFactory;
import zad2.controller.UserPanel;

import java.util.Scanner;

public class TrainigMain {
    public static void main(String[] args) {
        TrainingFactory kr1 = new TrainingFactory();

        kr1.addTraining("Programowanie C", "IT", 10, "Jan Kowalski", " 12-12-2019r");
        kr1.addTraining("Programowanie JAVA", "IT", 18, "Sebastian Kalisz", " 01-01-2019r");
        kr1.addTraining("Kurs Prawa Jazdy", "Podniesienie kwalifikacji", 10, "Adam Zapierała", " 01-12-2019r");
        kr1.addTraining("Jeżdziectwo", "Wypoczynek", 8, "Michał Konopka", " 2-10-2019r");
        kr1.addTraining("Łowienie białej ryby", "Wypoczynek", 10, "Wacław Malinowski", " 10-03-2019r");
        kr1.addTraining("Kurs tańca towarzyskiego", "Rozrywka", 26, "Katarzyna Górska", " 01-11-2019r");

        Scanner in = new Scanner(System.in);
        //boolean up=true;
        boolean end = true;
        do {
            System.out.println("\n----------------------------------------------");
            System.out.println("--- MENU ---");
            System.out.println("1) User");
            System.out.println("2) Admin");
            System.out.println("Aby zakończyć wpisz \"exit\"");
            System.out.print("Wybierz opcje: ");
            String chose = in.nextLine();
            System.out.println("\n----------------------------------------------");

//            boolean end;
            if (chose.equals("1")) {
                do {
                    end = kr1.UserSelected(UserPanel.UserMenu());
                } while (!end);

            } else if (chose.equals("2")) {
                boolean access = AdminPanel.access();
                do {
                    if (access)
                    {
                        end = kr1.adminSelected(AdminPanel.AdminMenu());

                    } else
                        {
                        System.out.println("ZŁY Login lub Hasło!!!!");
                        end = true;
                    }
                } while (!end);
            } else if (chose.equals("exit")) {
                end = false;
            } else {
                System.out.println("Zła wartość papa");
            }
        } while (end);

    }
}
