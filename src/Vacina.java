public class Vacina {

    private String substancia;
    private double quantidade;

    public Vacina() {

    }

    public Vacina(String substancia, double quantidade) {
        this.substancia = substancia;
        this.quantidade = quantidade;
    }

    public String getSubstancia() {
        return substancia;
    }

    public void setSubstancia(String substancia) {
        this.substancia = substancia;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Esta vacina possui a substânica: " + this.substancia + " e a quantidade: " + this.quantidade;
    }
}
