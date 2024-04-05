public abstract class LocalConfig {
    static String localNetworkIpv4 = "10.0.2.15";
    static String localHostname = "java.rmi.server.hostname";
    static String localServiceName = "CalculatorServer";
    static Integer rmiDefaultPort = 1099;

    static String connectionUrl = "rmi://" + localNetworkIpv4 + ":" + rmiDefaultPort + "/" + localServiceName;
}
