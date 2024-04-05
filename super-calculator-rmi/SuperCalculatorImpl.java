import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SuperCalculatorImpl extends UnicastRemoteObject implements SuperCalculator{
    protected SuperCalculatorImpl() throws RemoteException {
        super();
    }

    @Override
    public Double soma(Double firstValue, Double secondValue) throws RemoteException {
        return firstValue + secondValue;
    }

    @Override
    public Double subtracao(Double firstValue, Double secondValue) throws RemoteException {
        return firstValue - secondValue;
    }

    @Override
    public Double multiplicacao(Double firstValue, Double secondValue) throws RemoteException {
        return firstValue * secondValue;
    }

    @Override
    public Double divisao(Double firstValue, Double secondValue) throws RemoteException {
        return firstValue / secondValue;
    }

    @Override
    public Double potencia(Double firstValue, Double secondValue) throws RemoteException {
        return Math.pow(firstValue, secondValue);
    }

    @Override
    public Double raiz(Double firstValue, Double secondValue) throws RemoteException {
        return Math.pow(firstValue, 1 / secondValue);
    }

    @Override
    public Double modulo(Double firstValue, Double secondValue) throws RemoteException {
        return firstValue % secondValue;
    }

    @Override
    public Double logaritmo(Double firstValue, Double secondValue) throws RemoteException {
        return Math.log(firstValue) / Math.log(secondValue);
    }

    
}
