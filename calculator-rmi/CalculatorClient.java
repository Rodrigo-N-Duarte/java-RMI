import java.rmi.Naming;

public class CalculatorClient {
    public static void main(String[] args) {
        try {
            Calculator obj = (Calculator) Naming.lookup(LocalConfig.connectionUrl);
            System.out.println("Response: " + obj.add(1L, 2L));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
