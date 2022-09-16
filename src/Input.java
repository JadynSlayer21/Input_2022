import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Input
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int intOne, intTwo;
        //add more variables, at least 2 of each type:
        //double, float, short, String
       double pi = 3.14159;
       double e = 2.71828;


        System.out.println("What school do you go to?");
        String schoolName = keyboard.nextLine();

        System.out.println("What types of transport do you use to go to school?");
        String vehicle = keyboard.nextLine();

        System.out.println("What grade are you in?");
        short grade = keyboard.nextShort();

        System.out.println("When is your graduation year?");
        short gradYear = keyboard.nextShort();

        System.out.println("How much money do you have in your bank account?");
        float bankMoney = keyboard.nextFloat();

        System.out.println("How far is the farthest place you traveled?");
        float miles = keyboard.nextFloat();

        System.out.println("You go to "+schoolName+" and you are in "+grade+ "th grade with $" +bankMoney);
        System.out.println("You go to school in a "+vehicle+" and you are graduating from "+schoolName+" in "+gradYear);
        System.out.println("The farthest place you have traveled is "+miles+" miles away from Lubbock.");





        System.out.println("Try to name all the numbers of pi");
        double piNumbers =keyboard.nextDouble();

        System.out.println("pi is "+ pi);

        System.out.println("Try to name all the numbers of euler's number");
        double eulerRule = keyboard.nextDouble();

        System.out.println("euler's number is "+ e);


        System.out.print("Enter an integer :: ");
        intOne = keyboard.nextInt();

        System.out.print("Enter an integer :: ");
        intTwo = keyboard.nextInt();

        //add in input for all variables

        System.out.println();
        System.out.println("integer one = " + intOne );
        System.out.println("integer two = " + intTwo );

        //add output for all variables


    }
}