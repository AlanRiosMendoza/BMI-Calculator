import java.rmi.registry.Registry;
import java.util.Scanner;

public class ClienteRMI {
    public static void main(String[] args) {
        try {
            // Get the RMI registry
            Registry registry = java.rmi.registry.LocateRegistry.getRegistry("localhost", 1099);
            // Look up the remote object
            BMIRemote bmiRemote = (BMIRemote) registry.lookup("BMIService");
            // Get the user input
            Scanner input = new Scanner(System.in);
            System.out.print("Ingresa tu peso en kg: ");
            double weight = input.nextDouble();
            System.out.print("Ingresa tu altura en m: ");
            double height = input.nextDouble();
            // Invoke the remote method
            double bmi = bmiRemote.getBMI(weight, height);
            bmi = Math.round(bmi * 100.0) / 100.0;
            String category = bmiRemote.getBMICategory(bmi);
            // Display the result
            System.out.println("Tu BMI es " + bmi);
            System.out.println("Tu categoría de BMI es " + category);
            
            input.close();
        } catch (Exception e) {
            System.out.println("Client failed: " + e);
        }
    }
}