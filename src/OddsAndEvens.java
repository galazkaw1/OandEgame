import java.util.Random;
import java.util.Scanner;

public class OddsAndEvens {


    public static void main(String[] args) {


        System.out.println("Let`s play a game called \"Odds or Evans\"");
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("Hi "+ name +" which do you choose? (O)dds or (E)vens?");
        String oe = scan.nextLine();
                if (oe.equals("O")) {
            System.out.println(name + " has picked odds! The computer will be evens.");
        } else {
            System.out.println(name + " has picked evens! The computer will be odds.");
        }

        System.out.println("How many \"fingers\" do you put out?");

        int fingers = scan.nextInt();
        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The computer plays number " + computer);
        System.out.println("----------------------");
        int sum = computer + fingers;
        System.out.println("computer:" + computer + "+ user" + fingers + "=" + sum);
        boolean oddOrEven = sum%2 == 0;
        if (oddOrEven) {
            System.out.println("Sum was even");

            if (oe.equals("E")) {
                System.out.println("You win!");
            } else {
                System.out.println("Comupter win!");
            }
        } else {
            System.out.println("Sum was odd");
            if (oe.equals("O")) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer win!");
            }
        }
    }
}










