public class BMICalculator {
    public static double calculateBMI(Person person) {
        double weight = person.getWeight();
        double height = person.getHeight();
        return weight / (height * height);
    }

    public static String getWeightCategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else if (bmi < 35) {
            return "Obesity class I";
        } else if (bmi < 40) {
            return "Obesity class II";
        }
        else {
            return "Obesity class III";
        }
    }
}
