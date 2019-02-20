package zad9;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class StashMain
{
    Deque<String> messages;
    public StashMain()
    {
        messages = new ArrayDeque<>();
    }

    public void setMessages(String message)
    {
        messages.add(message);
    }

    public String getMessage()
    {
        return messages.getLast();
    }

    public String deleteMessage()
    {
        return messages.removeLast();
    }

    public static void main(String[] args)
    {
        /**
         * To jest moje rozwiązanie
         * Queue<String> message = new ArrayDeque<>();
         *         message.add("Pierwsza wiadomość!!!");
         *         message.add("Druga wiadomość!!!");
         *         message.add("Trzecia wiadomość!!!");
         *         message.add("Czwarta wiadomość!!!");
         *         message.add("Piąta wiadomość!!!");
         *         message.add("Szósta wiadomość!!!");
         *         message.add("Siódma wiadomość!!!");
         *
         *         System.out.println(((ArrayDeque<String>) message).getLast());
         *         System.out.println("Odczytano i usunięto: " + ((ArrayDeque<String>) message).removeLast());
         */
        StashMain mc = new StashMain();
        mc.setMessages("Wiadomość 1");
        mc.setMessages("Wiadomość 2");
        mc.setMessages("Wiadomość 3");
        System.out.println(mc.messages);
        System.out.println("Odczyt: " + mc.getMessage());
        System.out.println("Usuwam: " + mc.deleteMessage());
        System.out.println("Odczyt: " + mc.getMessage());
        System.out.println(mc.messages);


    }
}
