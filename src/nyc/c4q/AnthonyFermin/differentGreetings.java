package nyc.c4q.AnthonyFermin;

/**
 * Created by c4q-anthonyf on 3/7/15.
 */
import java.util.Scanner;

public class differentGreetings {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String resHello = "Hi! Nice to meet you!";
        String resGoodbye = "Sad to see you go!";
        String resWhoAreYou = "I am a stupid computer";
        String resWhere = "I think I'm in the matrix";
        String resHowOld = "I am 10101010111 years old... just kidding.";
        String greeting;

        System.out.println("Enter a Greeting: ");

        do {
            greeting = keyboard.nextLine();

            if (greeting.equals("Hello") || greeting.equals("Hi") || greeting.equals("Hey")) {
                System.out.println(resHello);
            }
            if (greeting.equals("Goodbye")) {
                System.out.println(resGoodbye);
            } else if (greeting.equals("Bye")) {
                System.out.println(resGoodbye);
            }
            if (greeting.equals("Who are you?")) {
                System.out.println(resWhoAreYou);
            }
            if (greeting.equals("Where are you?")) {
                System.out.println(resWhere);
            }
            if (greeting.equals("How old are you?")) {
                System.out.println(resHowOld);
            }

        }while(!(greeting.equals("Goodbye")) && !(greeting.equals("Bye")));
    }

}
