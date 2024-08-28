import java.util.Scanner;

public class Problems {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("qstn 2");
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        System.out.println("qstn 3");
        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a valid day of the week.");
        }
        System.out.println("qstn 4");
        int i = 1;
        while (i <= number) {
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        System.out.println("qstn 5");
        while (number > 0) {
            System.out.print(number+ " ");
            number--;
        }
        System.out.println();
        System.out.println("qstn 6");
        int j = 1;
        System.out.println("Numbers from 1 to 3 using do-while loop:");
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= 3);

        scanner.close();
    }
}
