import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;

public class HelloServer {
    public HelloServer() {
        try {
            System.setProperty(LocalConfig.localHostname, LocalConfig.localNetworkIpv4);
            LocateRegistry.createRegistry(LocalConfig.rmiDefaultPort);
            Hello helloImpl = new HelloImpl();
            Naming.rebind("HelloServer", helloImpl);
            System.out.println("Server Listening on port: " + LocalConfig.rmiDefaultPort);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new HelloServer();
    }
}
