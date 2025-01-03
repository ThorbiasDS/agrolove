public class Veterinario extends Usuario{
    private int animaisParaCuidar;
    private Vacinacao vacinacao;

    public void aplicarVacina(){

    }

    public int getAnimaisParaCuidar() {
        return animaisParaCuidar;
    }

    public void setAnimaisParaCuidar(int animaisParaCuidar) {
        this.animaisParaCuidar = animaisParaCuidar;
    }

    public Vacinacao getVacinacao() {
        return vacinacao;
    }

    public void setVacinacao(Vacinacao vacinacao) {
        this.vacinacao = vacinacao;
    }
}
