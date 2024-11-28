import java.rmi.registry.Registry;

public class ServidorRMI {
    public static void main(String[] args) {
        try {
            // Create a BMI remote object
            BMIRemoteImple bmiRemote = new BMIRemoteImple();
            // Register the remote object with the RMI Registry
            Registry registry = java.rmi.registry.LocateRegistry.createRegistry(1099);
            registry.rebind("BMIService", bmiRemote);
            System.out.println("Server is ready.");
        } catch (Exception e) {
            System.out.println("Server failed: " + e);
        }
    }
}