package zad4.controller;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LoginController
{
    public LoginController()
    {
        scannerService();
    }

    private Set<String> logins = new HashSet<String>();
    public void scannerService()
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            //System.out.println("Dostępne loginy w bazie: " + logins);

            // wyrażenie lambda
            logins.forEach(login-> System.out.println(login));

            System.out.print("Podaj login: ");
            String login = sc.nextLine();
            if(login.equals("exit"))
            {
                break;
            }
            if(setLogin(login))
            {
                System.out.println("Zarejestrowano użytkownika: " + login);
            }else
            {
                System.out.println("Login: " + login + " już istnieje w bazie");
            }

        }
    }

    public boolean setLogin(String login)
    {
        return logins.add(login);
    }

    public static void main(String[] args)
    {
        LoginController lc = new LoginController();
    }
}
