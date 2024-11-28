import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class BMIRemoteImple extends UnicastRemoteObject implements BMIRemote {
    
    public BMIRemoteImple() throws RemoteException {
        super();
    }

    public double getBMI(double weight, double height) throws RemoteException {
        return weight / (height * height);
    }

    public String getBMICategory(double bmi) throws RemoteException {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}