import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("введи три числа:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        if (((a+b)>c) && ((a+c)>b) &&((b+c)>a)) {
            System.out.println("да");
        }
        else {
            System.out.println("нет");
        }
    }
}