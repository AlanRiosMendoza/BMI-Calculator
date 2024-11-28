import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BMIRemote extends Remote {
    double getBMI(double weight, double height) throws RemoteException;
    String getBMICategory(double bmi) throws RemoteException;
}