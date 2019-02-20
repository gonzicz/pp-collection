package zad2.controller;

import java.util.Scanner;

public class AdminPanel
{
    public static boolean access()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("LOGIN: ");
        String login = in.nextLine();
        System.out.print("PASSWORD: ");
        String password = in.nextLine();
        if(login.equals("admin") && password.equals("admin"))
        {
            System.out.println("ACCESS GRANTED ");
            return true;
        }
        else
        {
            System.out.println("ACCESS DENIED");
            return false;
        }
    }

    public static String AdminMenu()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("\n     --- ADMIN PANEL ---");
        System.out.println("1) Pokaż listę dostępnych kursów");
        System.out.println("2) Dodaj nowe szkolenie");
        System.out.println("3) Znajdz szkolenie");
        System.out.println("4) Zapisz uczestnika na szkolenie");
        System.out.println("5) KONIEC");
        System.out.print("Wybierz opcje: ");
        return in.nextLine();
    }
}
