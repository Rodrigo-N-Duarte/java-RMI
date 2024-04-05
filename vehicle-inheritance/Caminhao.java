public class Caminhao extends Veiculo {
    private Integer eixos;

    Caminhao (String placa, Integer ano, Integer eixos) {
        super(placa, ano);
        this.setEixos(eixos);
    }

    public void setEixos(Integer eixos) {
        this.eixos = eixos;
    }

    public Integer getEixos() {
        return this.eixos;
    }

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Eixos: " + this.eixos);
    }
}
