import java.rmi.Naming;

public class HelloClient {
    public static void main(String[] args) {
        try {
            Hello helloObj = (Hello) Naming.lookup(LocalConfig.connectionUrl);
            System.out.println("Response: " + helloObj.returnHello());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
