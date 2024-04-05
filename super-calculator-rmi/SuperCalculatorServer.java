import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class SuperCalculatorServer {
    public SuperCalculatorServer() {
        try {
            System.setProperty(LocalConfig.localHostname, LocalConfig.localNetworkIpv4);
            LocateRegistry.createRegistry(LocalConfig.rmiDefaultPort);
            SuperCalculator calcImplementation = new SuperCalculatorImpl();
            Naming.rebind(LocalConfig.localServiceName, calcImplementation);
            System.out.println("Server Listening on port: " + LocalConfig.rmiDefaultPort);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SuperCalculatorServer();
    }
}
