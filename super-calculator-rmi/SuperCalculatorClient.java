import java.rmi.Naming;

public class SuperCalculatorClient {
    public static void main(String[] args) {
        String parametro1 = args[0], parametro2 = args[1];
        Double double1 = Double.parseDouble(parametro1), double2 = Double.parseDouble(parametro2);
        System.out.println("Parâmetro 1: " + double1);
        System.out.println("Parâmetro 2: " + double2);
        System.out.println("--------------------------");
        try {
            SuperCalculator obj = (SuperCalculator) Naming.lookup(LocalConfig.connectionUrl);
            System.out.println("Soma: " + obj.soma(double1, double2));
            System.out.println("Subtração: " + obj.subtracao(double1, double2));
            System.out.println("Multiplicação: " + obj.multiplicacao(double1, double2));
            System.out.println("Divisão: " + obj.divisao(double1, double2));
            System.out.println("Potência: " + obj.potencia(double1, double2));
            System.out.println("Raíz: " + obj.raiz(double1, double2));
            System.out.println("Módulo: " + obj.modulo(double1, double2));
            System.out.println("Logaritmo: " + obj.logaritmo(double1, double2));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
