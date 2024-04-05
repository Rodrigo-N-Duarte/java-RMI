public class Onibus extends Veiculo {
    private Integer assentos;

    Onibus (String placa, Integer ano, Integer assentos) {
        super(placa, ano);
        this.setAssentos(assentos);
    }

    public Integer getAssentos() {
        return this.assentos;
    }

    public void setAssentos(Integer assentos) {
        this.assentos = assentos;
    }

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Assentos: " + this.assentos);
    }
}
