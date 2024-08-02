import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        Person person = new Person(weight, height);
        double bmi = BMICalculator.calculateBMI(person);
        String category = BMICalculator.getWeightCategory(bmi);

        System.out.printf("Your BMI is %.2f. You are %s.", bmi, category);
    }
}
