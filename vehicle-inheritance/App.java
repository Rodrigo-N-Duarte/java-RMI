public class App {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("12345678", 2000);
        Veiculo caminhao = new Caminhao("91011121", 2012, 6);
        Veiculo onibus = new Onibus("13141516", 2025, 20);

        veiculo.exibirDados();
        caminhao.exibirDados();
        onibus.exibirDados();
    }
}