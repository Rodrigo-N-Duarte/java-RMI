public class Veiculo {
    private String placa;
    private Integer ano;

    Veiculo () {}

    Veiculo (String placa, Integer ano) {
        this.setPlaca(placa);
        this.setAno(ano);
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public void setAno(String ano) {
        this.ano = Integer.parseInt(ano);
    }

    public String getPlaca() {
        return this.placa;
    }

    public Integer getAno() {
        return this.ano;
    }

    public void exibirDados() {
        System.out.println("------- Informações de Veiculo -------");
        System.out.println("Placa: " + this.placa);
        System.out.println("Ano: " + this.ano);
    }
}
