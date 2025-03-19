import java.util.Objects;
import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        evenOdd();
        grader();
        biggestNumber();
        posNegInputChecker();
        ageClassification();
        textLength();
        yearChecker();
        biggestNoCheck();
        triangleSide();
        calculator();
    }

    //Bonus Assignment 1
    private static void evenOdd() {
        Scanner scEvenOdd = new Scanner(System.in);
        System.out.print("B1. Please fill in a number to check if it is even or odd:");
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
        System.out.print("B2. Please fill in your grade:");
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
        System.out.print("B3. Please fill in number 1 to identify the bigger number:");
        int firstNoInput = scFirstNo.nextInt();
        //Input for number 2
        System.out.print("B3. Please fill in number 2 to identify the bigger number:");
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
        System.out.print("B4. Please fill in a number positive or negative:");
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
        System.out.print("B5. Please fill in your age:");
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
        System.out.print("B6. Please fill in a text:");
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
        System.out.print("B7. Please fill in a year:");
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
        System.out.print("B8. Fill in number 1:");
        int bigNo1 = scBigNo.nextInt();

        System.out.print("B8. Fill in number 2:");
        int bigNo2 = scBigNo.nextInt();

        System.out.print("B8. Fill in number 3:");
        int bigNo3 = scBigNo.nextInt();

        if (bigNo1 > bigNo2 && bigNo1 > bigNo3) {
            System.out.println(bigNo1 + " is the biggest number out of the 3");
        } else if (bigNo1 < bigNo2 && bigNo2 > bigNo3) {
            System.out.println(bigNo2 + " is the biggest number out of the 3");
        } else System.out.println(bigNo3 + " is the biggest number out of the 3");
    }


    //Bonus Assignment 9
    private static void triangleSide() {
        Scanner scBigNo = new Scanner(System.in);
        System.out.print("B9. Fill in side 1 of the triangle:");
        int triangle1 = scBigNo.nextInt();

        System.out.print("B9. Fill in side 2 of the triangle:");
        int triangle2 = scBigNo.nextInt();

        System.out.print("B9. Fill in side 3 of the triangle:");
        int triangle3 = scBigNo.nextInt();

        if (triangle1 == triangle2 && triangle1 == triangle3) {
            System.out.println("This triangle is equilateral"); //Gelijkzijdig
        } else if (triangle1 == triangle2 || triangle2 == triangle3 || triangle1 == triangle3) {
            System.out.println("This triangle is isosceles"); //Gelijkbenig
        } else System.out.println("This triangle is scalene"); //Ongelijkzijdig
    }

    //Bonus Assignment 10
    private static void calculator() {
        Scanner scCalc = new Scanner(System.in);
        Scanner scCalcStr = new Scanner(System.in);
        //IntelliJ suggests switch statements, does feel easier to use in order to add the incorrect operator message
        System.out.print("B10. Fill in number 1 for the calculator:");
        double calc1 = scCalc.nextInt();

        System.out.print("B10. Fill in number 2 for the calculator:");
        double calc2 = scCalc.nextInt();

        System.out.print("B10. Fill in your operator (+, -, /, or *) for the calculator:");
        String calc3 = scCalcStr.nextLine();
        //Below was suggested by IntelliJ to add Objects equals instead of "==".
        if (Objects.equals(calc3, "+")) {
            System.out.println(calc1 + " + " + calc2 + " = " + (calc1 + calc2));
        } else if (Objects.equals(calc3, "-")) {
            System.out.println(calc1 + " - " + calc2 + " = " + (calc1 - calc2));
        } else if (Objects.equals(calc3, "/")) {
            System.out.println(calc1 + " / " + calc2 + " = " + (calc1 / calc2));
        } else if (Objects.equals(calc3, "*")) {
            System.out.println(calc1 + " * " + calc2 + " = " + (calc1 * calc2));
        } else System.out.println("You did not enter the correct operator");
    }
}
