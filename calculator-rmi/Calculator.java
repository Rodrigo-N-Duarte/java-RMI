import java.rmi.RemoteException;
import java.rmi.Remote;

public interface Calculator extends Remote{
    Long add(Long firstValue, Long secondValue) throws RemoteException;   
}