package nyc.c4q.AnthonyFermin;

/**
 * Created by c4q-anthonyf on 3/7/15.
 */
import java.util.Scanner;

public class madLibs {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String favColor, favAnimal, favFood, favSport, favSubject;
        int favNum;

        System.out.print("What's your favorite color: ");
        favColor = input.next();

        System.out.print("What's your favorite animal: ");
        favAnimal = input.next();

        System.out.print("What's your favorite food: ");
        favFood = input.next();

        System.out.print("What's your favorite sport: ");
        favSport = input.next();

        System.out.print("What's your favorite Subject: ");
        favSubject = input.next();

        System.out.print("What's your favorite number: ");
        favNum = input.nextInt();

        System.out.println();
        System.out.println("The " + favColor + " " + favAnimal + " was just finishing it's " + favSport + " session when it saw " + favNum + " plates of " + favFood + " on the table.");
        System.out.println("The " + favAnimal + " ate all the " + favFood + " then spent the rest of the night learning " + favSubject + ".");


    }

}
