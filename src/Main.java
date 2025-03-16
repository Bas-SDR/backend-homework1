import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Variables
        int number = 0;
        int input1 = 4;
        int input2 = 20;
        String name = "Henk"; //Daan, Thijs, Gijs, Bas, Henk are valid options.
        int evenOddNumber = 221;
        double gradeNumber = 4;
        int bigNumber1 = 2222222;
        int bigNumber2 = 3123123;

        //Methods
        hello();
        positiveOrNegative(number); //Zero gives negative due to > 0.
        positiveOrZeroOrNegative(number);
        bartender(name);
        sum(input1, input2);
        evenOdd(evenOddNumber);
        grader(gradeNumber);
        biggestNumber(bigNumber1, bigNumber2);
        posNegInputChecker();
    }

    //Assignment 1
    private static void hello() {
        System.out.println("Hello, world!");
    }

    //Assignment 2
    private static void positiveOrNegative(int number) {
        if (number > 0) { //Can make it >= to instead give a result of positive @ zero.
            System.out.println("This number is positive!");
        } else {
            System.out.println("This number is negative!");
        }
    }

    //Assignment 3
    private static void positiveOrZeroOrNegative(int number) {
        if (number > 0) {
            System.out.println("This number is positive!");
        } else {
            if (number == 0) {
                System.out.println("This number is zero!");
            } else {
                System.out.println("This number is negative!");
            }
        }
    }

    //Assignment 4
    private static void bartender(String name) {
        switch (name) {
            case "Daan":
                System.out.println(name + " ordered a Coke");
                break;
            case "Thijs":
                System.out.println(name + " ordered a Beer");
                break;
            case "Gijs":
                System.out.println(name + " ordered a Wine");
                break;
            case "Bas":
                System.out.println(name + " ordered a Whiskey");
                break;
            case "Henk":
                System.out.println(name + " ordered a Cocktail");
                break;
            default:
                System.out.println("Nobody ordered anything");
        }
    }

    //Assignment 5
    private static void sum(int input1, int input2) {
        System.out.println(input1 + " + " + input2 + " = " + (input1 + input2)); //Care of brackets. First result gave back 420 due to no brackets
    }

    //Bonus assignments
    //Bonus Assignment 1
    private static void evenOdd(int evenOddNumber) {
        if (evenOddNumber % 2 == 0) {
            System.out.println("This number is even!");
        } else {
            System.out.println("This number is odd!");
        }
    }

    //Bonus Assignment 2
    //Grade A = 10 + 9
    //Grade B = 8
    //Grade C = 7
    //Grade D = 6
    //Grade F = 1 through 5
    private static void grader(double gradeNumber) {
        if (gradeNumber < 6.0) {
            String gradeLetter = "F";
            System.out.println("The grade " + gradeNumber + " is equivalent to an " + gradeLetter);
        } else if (gradeNumber < 7.0) {
            String gradeLetter = "D";
            System.out.println("The grade " + gradeNumber + " is equivalent to an " + gradeLetter);
        } else if (gradeNumber < 8.0) {
            String gradeLetter = "C";
            System.out.println("The grade " + gradeNumber + " is equivalent to an " + gradeLetter);
        } else if (gradeNumber < 9.0) {
            String gradeLetter = "B";
            System.out.println("The grade " + gradeNumber + " is equivalent to an " + gradeLetter);
        } else {
            String gradeLetter = "A";
            System.out.println("The grade " + gradeNumber + " is equivalent to an " + gradeLetter);
        }
    }

    //Bonus Assignment 3
    //Max is 2.147 billion. Change int to long if bigger numbers
    private static void biggestNumber(int bigNumber1, int bigNumber2) {
        if (bigNumber1 > bigNumber2) {
            System.out.println(bigNumber1 + " is bigger than " + bigNumber2);
        } else if (bigNumber1 == bigNumber2) {
            System.out.println(bigNumber1 + " is identical to " + bigNumber2);
        } else {
            System.out.println(bigNumber1 + " is smaller than " + bigNumber2);
        }
    }

    //Bonus Assignment 4
    private static void posNegInputChecker() {
        System.out.print("Please fill in a number:");
        Scanner sc = new Scanner(System.in);
        int numberInputCheck = sc.nextInt();

        if (numberInputCheck > 0) {
            System.out.println("The number " + numberInputCheck + " is positive!");
        } else if (numberInputCheck == 0) {
            System.out.println("The number " + numberInputCheck + " is zero!");
        } else {
            System.out.println("The number " + numberInputCheck + " is negative!");
        }
    }

    //Bonus Assignment 5
    //Bonus Assignment 6
    //Bonus Assignment 7
    //Bonus Assignment 8
    //Bonus Assignment 9
    //Bonus Assignment 10

}