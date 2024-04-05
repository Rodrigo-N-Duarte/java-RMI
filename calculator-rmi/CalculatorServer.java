import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class CalculatorServer {
    public CalculatorServer() {
        try {
            System.setProperty(LocalConfig.localHostname, LocalConfig.localNetworkIpv4);
            LocateRegistry.createRegistry(LocalConfig.rmiDefaultPort);
            Calculator calcImplementation = new CalculatorImpl();
            Naming.rebind(LocalConfig.localServiceName, calcImplementation);
            System.out.println("Server Listening on port: " + LocalConfig.rmiDefaultPort);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new CalculatorServer();
    }
}
