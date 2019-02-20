package zad2.controller;

import java.util.Scanner;


public class UserPanel
{
     public static String UserMenu()
     {
         Scanner in = new Scanner(System.in);
         System.out.println("\n     --- USER MENU ---");
         System.out.println("1) Pokaż dostępne szkolenia");
         System.out.println("2) Zapisz się na szkolenie");
         System.out.println("3) Zrezygnuj ze szkolenia");
         System.out.println("Aby zakończyć wpisz \"exit\"");
         System.out.print("Wybierz opcje: ");
         return in.nextLine();
     }

}
