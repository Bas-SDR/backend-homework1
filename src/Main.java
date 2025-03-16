public class Main {
    public static void main(String[] args) {
        int number = 0;
        int input1 = 4;
        int input2 = 20;
        String name = "Henk";

        hello();
        positiveOrNegative(number);
        positiveOrZeroOrNegative(number);
        bartender(name);
        sum(input1, input2);

    }

    public static void hello() {
        System.out.println("Hello, world!");
    }

    public static void positiveOrNegative(int number) {
        if (number > 0) {
            System.out.println("This number is positive!");
        } else {
            System.out.println("This number is negative!");
        }
    }

    public static void positiveOrZeroOrNegative(int number) {
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

    public static void bartender(String name) {
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

    public static void sum(int input1, int input2) {
        System.out.println(input1 + " + " + input2 + " = " + (input1 + input2));
    }
}