import java.util.Scanner;
public class BMI_calculator {

    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
        System.out.print("Enter Weight in Pounds : ");
        double weight = input.nextDouble();
        System.out.print("Enter Height in Inches : ");
        double height = input.nextDouble();
        final double kilo_per_pound = 0.4535;
        final double meters_per_inch = 0.025;
        double weight_in_kilo = weight * kilo_per_pound;
        double height_in_meters = height * meters_per_inch;
        double bmi = weight_in_kilo / (height_in_meters * height_in_meters);
        System.out.println("BMI is : " + bmi);
        if(bmi < 18.5){
            System.out.println("Underweight");
        }
        else if (bmi < 25){
            System.out.println("Normal");
        }
        else if(bmi < 30){
            System.out.println("Overweight");
        }
        else{
            System.out.println("Obesity");
        }

    }
}
