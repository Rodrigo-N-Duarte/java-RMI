import java.rmi.RemoteException;
import java.rmi.Remote;

public interface Hello extends Remote{
    String returnHello() throws RemoteException;   
}