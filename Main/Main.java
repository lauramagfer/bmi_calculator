
import java.util.Scanner;
import java.util.Locale;

public class Main{
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        
        double bmi;
        double weight; 
        double height;
        String classification = "";
        char confirmation = ' ';


        do { 

            System.out.println("\nWelcome to the BMI calculator! ");
            System.out.println("----------------------------------");

            System.out.println("Please, enter your weight: ");
            weight = sc.nextDouble();
            System.out.println("Now enter your  height: ");
            height = sc.nextDouble();

            bmi = weight / (Math.pow(height, 2));

            if (bmi <= 18.5){
                classification = "Below Normal\n";
            } else if (bmi >= 18.6 && bmi <= 24.9){
                classification = "Normal. You are at your ideal weight!\n";
            } else if (bmi >= 25.0 && bmi <= 29.9){
                classification = "Overweight\n";
            } else if (bmi >= 30.0 && bmi <= 34.9 ){
                classification = "Class I Obesity\n";
            } else if (bmi >= 35.0 && bmi <= 39.9 ){
                classification = "Class II Obesity\n";
            } else if (bmi >= 40 ){
                classification = "Class III Obesity\n";
            }

            System.out.printf("\nYour BMI is: %.2f\nYour classification is: %s\n", bmi, classification);
            System.out.println("Would you like to perform another calculation? (y/n)");
            confirmation = sc.next().charAt(0);

        } while(confirmation != 'n');

        sc.close();
    }
}