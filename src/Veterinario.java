public class Veterinario extends Usuario{
    private int animaisParaCuidar;
    private Vacinacao vacinacao;

    public void aplicarVacina(Animal animal, Vacina vacina){
        Vacinacao vac = new Vacinacao();
        vac.setVacina(vacina);
        vac.setAnimal(animal);
        vac.getAnimal().vacinado = true;
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
