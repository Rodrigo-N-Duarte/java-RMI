import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImpl extends UnicastRemoteObject implements Calculator{
    protected CalculatorImpl() throws RemoteException {
        super();
    }

    @Override
    public Long add(Long firstValue, Long secondValue) throws RemoteException {
        return firstValue + secondValue;
    }

    
}
