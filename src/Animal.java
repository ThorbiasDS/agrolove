public abstract class Animal {
    protected int identificacao;
    protected float peso;
    protected int idade;
    protected String porte;
    protected boolean vacinado;

    public Animal(){
        this.vacinado = false;
    }

    public abstract void comer();
}
