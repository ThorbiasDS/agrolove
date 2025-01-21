public class Veterinario extends Usuario {

    private int animaisParaCuidar;
    private Vacinacao vacinacao;

    public Veterinario(){
        super();
    }

    public Veterinario(String nome, String login, String senha, int animaisParaCuidar){
        super(nome, login, senha);
        this.animaisParaCuidar = animaisParaCuidar;
    }

    public void aplicarVacina(Animal animal, Vacina vacina) {
        Vacinacao vac = new Vacinacao();
        vac.setVacina(vacina);
        vac.setAnimal(animal);
        animal.setVacinado(true);
        System.out.println("O animal " + animal.getIdentificacao() + " foi vacinado!");
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

    @Override
    public String toString(){
        return super.toString() + ", animais para cuidar: " + this.animaisParaCuidar;
    }
}
