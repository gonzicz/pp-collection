package zad2.controller;

import zad2.Training;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrainingFactory
{
    private static List<Training> trainings = new ArrayList<Training>();

    public void addTraining(String trainingName, String trainingCategory, int numberOfParticipants, String trener, String term)
    {
        Training k = new Training(trainingName, trainingCategory,numberOfParticipants, trener, term);
        trainings.add(k);
    }

    public static void showTrainigNames()
    {
        for (Training training :  trainings)
        {
            System.out.print("[ " + training.getTrainingName() + " ] ");
        }
    }
    public static void showAllTraining()
    {
        trainings.forEach(training -> System.out.println(training));
        System.out.println();
    }

    public void addToTrainig()
    {
        Scanner in = new Scanner(System.in);
        boolean added = false;
        System.out.println("Dostępne kursy: ");
        showTrainigNames();
        System.out.print("\nNa jaki kurs  zapisać? ");
        String myTraining = in.nextLine();
        for (Training kurs : trainings)
        {
            if(kurs.getTrainingName().equals(myTraining))
            {
                kurs.addNumberOfParticipants();
                added = true;
                System.out.println("Dodano nowego uczestnika do kursu :) Gratulacje");
                System.out.println(kurs);
            }
        }
        if (!added)
        {
            System.out.println("Podany przez Ciepie kurs nie istnieje");
        }
    }

    public void removeAtTraining()
    {
        Scanner in = new Scanner(System.in);
        boolean removed = false;
        System.out.println("Dostępne kursy: ");
        showTrainigNames();
        System.out.print("\nZ jakiego kursu Cię usunąć?: ");
        String myTraining = in.nextLine();
        for (Training kurs : trainings)
        {
            if(kurs.getTrainingName().equals(myTraining))
            {
                kurs.subtractNumberOfPants();
                removed = true;
                System.out.println("Zrezygnowałeś z kursu.");
                System.out.println(kurs);
            }
        }
        if (!removed)
        {
            System.out.println("Podany przez Ciepie kurs nie istnieje");
        }

    }

    public boolean UserSelected(String chose)
    {
           if(chose.equals("1"))
           {
               System.out.println("Dostępne kursy: ");
               showTrainigNames();
           }
           else if(chose.equals("2"))
           {
              // System.out.println("Dostępne kursy: ");
              // showTrainigNames();
               addToTrainig();
           }
           else if(chose.equals("3"))
           {
              // System.out.println("Dostępne kursy: ");
               //showTrainigNames();
               removeAtTraining();

           }
           else if(chose.equals("exit"))
           {
               return true;
           }
           else
           {
               System.out.println("Zła wartość !!!");
           }
           return false;
    }

    public boolean adminSelected(String chose)
    {
        Scanner in = new Scanner(System.in);

        if(chose.equals("1"))
        {
            showTrainigNames();
        }
        else if(chose.equals("2"))
        {
            System.out.print("Podaj nazwę nowego szkolenia: ");
            String tName = in.nextLine();

            System.out.print("Podaj kategorię szkolenia: ");
            String kName = in.nextLine();

            System.out.print("Imię i Nazwisko trenera: ");
            String tNameAndSurname = in.nextLine();

            System.out.print("Podaj termin startu szkolenia: ");
            String termin = in.nextLine();

            System.out.print("Ilu uczestników: ");
            int liczba = in.nextInt();

            addTraining(tName,kName,liczba,tNameAndSurname,termin);
            System.out.println("Dodano nowy kurs!!!");
            showAllTraining();

        }
        else if (chose.equals("3"))
        {
            System.out.print("Podaj nazwę szukanego kursu: ");
            String kName = in.nextLine();
            for(Training kurs : trainings)
            {
                if(kurs.getTrainingName().equals(kName))
                {
                    System.out.println(kurs);
                    break;
                } else
                {
                    System.out.println("Kursu nie znaleziono");
                }
            }

        }
        else if(chose.equals("4"))
        {
            addToTrainig();
        }
        else if(chose.equals("5"))
        {
            return true;
        }

        else
        {
            System.out.println("Zła wartość !!!");
        }
        return false;
    }


}
