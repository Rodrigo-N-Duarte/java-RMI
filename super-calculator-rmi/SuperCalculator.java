import java.rmi.RemoteException;
import java.rmi.Remote;

public interface SuperCalculator extends Remote{
    Double soma(Double firstValue, Double secondValue) throws RemoteException;
    Double subtracao(Double firstValue, Double secondValue) throws RemoteException;   
    Double multiplicacao(Double firstValue, Double secondValue) throws RemoteException;   
    Double divisao(Double firstValue, Double secondValue) throws RemoteException;   
    Double potencia(Double firstValue, Double secondValue) throws RemoteException;   
    Double raiz(Double firstValue, Double secondValue) throws RemoteException;   
    Double modulo(Double firstValue, Double secondValue) throws RemoteException;   
    Double logaritmo(Double firstValue, Double secondValue) throws RemoteException;   
}