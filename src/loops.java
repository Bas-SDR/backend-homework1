import java.util.ArrayList;
import java.util.stream.IntStream;

public class loops {
    public static void main(String[] args) {
        oneToHundred();
        timesTwo();
        fortyFive();
        sumArray();
        emptyString();
        primeNo();
        numberList();
        counterToZero();
        fibonacci();
        starTriangle();
    }

    //Bonus Assignment 1
    private static void oneToHundred() {
        int totalEven = 0;
        for (int evenHundred = 0; evenHundred < 100; evenHundred++) {
            if (evenHundred % 2 == 0) {
                totalEven += evenHundred;
            }
        }
        System.out.println("B1. The total of all even numbers between 0 and 100 equals " + totalEven);
    }

    //Bonus Assignment 2
    private static void timesTwo() {
        ArrayList<Integer> twoTime = new ArrayList<>();
        for (int tTwo = 2; tTwo < 1000; tTwo *= 2) {
            twoTime.add(tTwo);
        }
        System.out.println("B2. The following numbers are in times 2 list: " + twoTime);
    }

    // Bonus Assignment 3
    private static void fortyFive() {
        String present = "not present";
        int[] fortyFiveList = {17, 92, 3, 89, 55, 86, 24, 34, 67, 76, 81, 50, 59, 30, 14, 33, 83, 87, 38, 70, 9, 78, 91, 46, 53, 64, 25, 69, 29, 84, 22, 16, 79, 40, 21, 18, 68, 75, 2, 26, 39, 8, 31, 35, 1, 63, 77, 95, 15, 58, 61, 10, 85, 93, 96, 72, 98, 5, 73, 6, 23, 56, 49, 99, 43, 41, 20, 11, 12, 74, 57, 66, 94, 36, 7, 60, 88, 4, 65, 27, 28, 82, 32, 97, 48, 62, 80, 37, 13, 54, 19, 71, 42, 44, 90, 52, 51};
        for (int a : fortyFiveList) { // for each loop
            if (a == 45) {
                present = "present";
                break;
            }
        }
        System.out.println("B3. The number 45 is " + present);
    }

    //Bonus Assignment 4
    private static void sumArray() {
        int[] sumList = {12, 5, 7, 2, 18, 3, 9, 12};
        int sumTotal = 0;
        for (int b : sumList) {
            sumTotal += b;
        }
        System.out.println("B4. The total is " + sumTotal);
    }

    //Bonus Assignment 5
    private static void emptyString() {
        String[] sentence = {"Er", "was", "eens", "een", "student", "die", "graag", "wilde", "leren", "", "Deze", "student", "haalde", "goede", "cijfers"};
        System.out.print("B5. ");
        for (String emptyStr : sentence) {
            if (!emptyStr.isEmpty()) { //Without the "!" (not operator) you need to switch print and break. Having break in "if" looks bad.
                System.out.print(emptyStr + " ");
            } else {
                break;
            }
        }
        System.out.println(" ");
    }

    //Bonus Assignment 6
    private static void primeNo() {
        ArrayList<Integer> prime = new ArrayList<>();
        for (int prime1 = 1; prime1 < 100; prime1++) {
            if (isPrime(prime1)) {
                prime.add(prime1);
            }
        }
        System.out.println("B6. " + prime);
    }

    //https://www.baeldung.com/java-prime-numbers used. Not sure how else to do.
    public static boolean isPrime(int number) {
        return number > 1
                && IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(n -> (number % n == 0));
    }

    //Bonus assignment 7
    private static void numberList() {
        ArrayList<Integer> noList = new ArrayList<>();
        System.out.print("B7. ");
        int[] listedNo = {17, 92, 3, 89, 55, 86, 24, 34, 67, 76, 81, 50, 59, 30, 14, 33, 83, 87, 38, 70, 9, 78, 91, 46, 53, 64, 25, 69, 29, 84, 22, 16, 79, 40, 21, 18, 68, 75, 2, 26, 39, 8, 31, 35, 1, 63, 77, 95, 15, 58, 61, 10, 85, 93, 96, 72, 98, 5, 73, 6, 23, 56, 49, 99, 43, 41, 20, 11, 12, 74, 57, 66, 94, 36, 7, 60, 88, 4, 65, 27, 28, 82, 32, 97, 48, 62, 80, 37, 13, 54, 19, 71, 42, 44, 90, 52, 51};
        for (int fortyFive : listedNo) {
            if (fortyFive > 45) {
                noList.add(fortyFive);
            }
        }
        System.out.println("The following numbers are above 45: " + noList);
    }

    //Bonus assignment 8
    private static void counterToZero() {
        ArrayList<Integer> countToZero = new ArrayList<>();
        for (int z = 10; z >= 0; z-- ) { //Don't forget the =, otherwise counts to one.
            countToZero.add(z);
        } System.out.println("Counting down: " + countToZero);
    }

    //Bonus assignment 9
    private static void fibonacci() {
        ArrayList<Integer> fiboList = new ArrayList<>();
        int noOne = 0;
        int noTwo = 1;
        int endNo = 9; //Note: keep at 9, because ArrayList starts at 0.
        fiboList.add(noOne);
        fiboList.add(noTwo);
        for (int x = 1; x < endNo; ++x) {
            int nextNo = noOne + noTwo;
            noOne = noTwo;
            noTwo = nextNo;
            fiboList.add(nextNo);
        }
        System.out.println("The first " + endNo + " digits of the Fibonacci sequence are " + fiboList);
    }

    //Bonus assignment 10
    private static void starTriangle() {
        for (int i=1; i<10; i += 2)
        {
            for (int k=0; k < (4 - i / 2); k++)
            {
                System.out.print(" ");
            }
            for (int j=0; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
