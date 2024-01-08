import java.util.Calendar;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the year you were born in: ");
        int yearOfBirth = scanner.nextInt();

        System.out.println("Please enter the month you were born in: ");
        int monthOfBirth = scanner.nextInt();

        System.out.println("Please enter the day you were born in: ");
        int dayOfBirth = scanner.nextInt();

        Calendar today = Calendar.getInstance();
        Calendar dateOfBirth = Calendar.getInstance();

        dateOfBirth.set(yearOfBirth, monthOfBirth - 1, dayOfBirth);

        int age = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);

        System.out.println("Your age is " + age);

        scanner.close();
    }
}
