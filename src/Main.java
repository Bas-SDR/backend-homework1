import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Variables
        int number = 0;
        int input1 = 4;
        int input2 = 20;
        String name = "Henk"; //Daan, Thijs, Gijs, Bas, Henk are valid options.

        //Methods
        hello();
        positiveOrNegative(number); //Zero gives negative due to > 0.
        positiveOrZeroOrNegative(number);
        bartender(name);
        sum(input1, input2);
        evenOdd();
        grader();
        biggestNumber();
        posNegInputChecker();
        ageClassification();
        textLength();
        yearChecker();
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
    private static void evenOdd() {
        Scanner scEvenOdd = new Scanner(System.in);
        System.out.print("Please fill in a number to check if it is even or odd:");
        int evenOddNumber = scEvenOdd.nextInt();

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
    private static void grader() {
        Scanner scGrade = new Scanner(System.in);
        System.out.print("Please fill in your grade:");
        double gradeInput = scGrade.nextInt();

        if (gradeInput < 6.0) {
            String gradeLetter = "F";
            System.out.println("The grade " + gradeInput + " is equivalent to an " + gradeLetter);
        } else if (gradeInput < 7.0) {
            String gradeLetter = "D";
            System.out.println("The grade " + gradeInput + " is equivalent to an " + gradeLetter);
        } else if (gradeInput < 8.0) {
            String gradeLetter = "C";
            System.out.println("The grade " + gradeInput + " is equivalent to an " + gradeLetter);
        } else if (gradeInput < 9.0) {
            String gradeLetter = "B";
            System.out.println("The grade " + gradeInput + " is equivalent to an " + gradeLetter);
        } else {
            String gradeLetter = "A";
            System.out.println("The grade " + gradeInput + " is equivalent to an " + gradeLetter);
        }
    }

    //Bonus Assignment 3
    //Max is 2.147 billion. Change int to long if bigger numbers
    private static void biggestNumber() {
        //Input for number 1
        Scanner scFirstNo = new Scanner(System.in);
        System.out.print("Please fill in number 1 to identify the bigger number:");
        int firstNoInput = scFirstNo.nextInt();
        //Input for number 2
        System.out.print("Please fill in number 2 to identify the bigger number:");
        Scanner scSecondNo = new Scanner(System.in);
        int secondNoInput = scFirstNo.nextInt();

        if (firstNoInput > secondNoInput) {
            System.out.println(firstNoInput + " is bigger than " + secondNoInput);
        } else if (firstNoInput == secondNoInput) {
            System.out.println(firstNoInput + " is identical to " + secondNoInput);
        } else {
            System.out.println(firstNoInput + " is smaller than " + secondNoInput);
        }
    }

    //Bonus Assignment 4
    private static void posNegInputChecker() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please fill in a number positive or negative:");
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
    // kind between 0 and 10
    // puber between 11 and 18
    // volwassene between 19 and 65
    // senior 65+
    private static void ageClassification() {
        Scanner scAge = new Scanner(System.in);
        System.out.print("Please fill in your age:");
        int ageInput = scAge.nextInt();

        if (ageInput < 11) {
            System.out.println("With your age of " + ageInput + " you are considered a child");
        } else if (ageInput < 19) {
            System.out.println("With your age of " + ageInput + " you are considered an adolescent");
        } else if (ageInput < 66) {
            System.out.println("With your age of " + ageInput + " you are considered an adult");
        } else {
            System.out.println("With your age of " + ageInput + " you are considered a senior");
        }
    }

    //Bonus Assignment 6
    private static void textLength() {
        Scanner scText = new Scanner(System.in);
        System.out.print("Please fill in a text:");
        String textInputLength = scText.nextLine();

        if (textInputLength.length() < 10) {
            System.out.println("The provided text is less than 10 characters long"); //Includes spaces
        } else if (textInputLength.length() < 21) {
            System.out.println("The provided text is between 10 and 20 characters long");
        } else {
            System.out.println("The provided text is more than 20 characters long");
        }
    }

    //Bonus Assignment 7
    private static void yearChecker() {
        Scanner scYear = new Scanner(System.in);
        System.out.print("Please fill in a year:");
        int yearInput = scYear.nextInt();

        if (yearInput % 400 == 0) {
            System.out.println("The year " + yearInput + " is a leap year");
        } else if (yearInput % 100 == 0) {
            System.out.println("The year " + yearInput + " is not a leap year");
        } else if (yearInput % 4 == 0) {
            System.out.println("The year " + yearInput + " is a leap year");
        } else {
            System.out.println("The year " + yearInput + " is not a leap year");
        }
    }

    //Bonus Assignment 8
    private static void biggestNoCheck() {
        Scanner scBigNo = new Scanner(System.in);
        System.out.print("Fill in number 1:");
        int bigNo1 = scBigNo.nextInt();

        System.out.print("Fill in number 2:");
        int bigNo2 = scBigNo.nextInt();

        System.out.print("Fill in number 3:");
        int bigNo3 = scBigNo.nextInt();

        if (bigNo1 > bigNo2) ;
        System.out.println();
    }
    //Bonus Assignment 9
    //Bonus Assignment 10

}