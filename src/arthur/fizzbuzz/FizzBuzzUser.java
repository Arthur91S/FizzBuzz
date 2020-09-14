package arthur.fizzbuzz;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FizzBuzzUser {

    public void fizzbuzz(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Well hello there \n" +
                            "Please enter maximum number");

        int max = scan.nextInt();
        System.out.println("Thanks, you selected number " + max);

        System.out.println("Please select a number for the  rule to be added \n" +
                            "1: Module ");

        while(scan.hasNext()){

        }

        scan.close();


    }

}
