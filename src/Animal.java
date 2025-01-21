public abstract class Animal {
    private int identificacao;
    private float peso;
    private int idade;
    private String porte;
    private boolean vacinado;

    public Animal() {
        this.vacinado = false;
    }

    public Animal(int identificacao, float peso, int idade, String porte, boolean vacinado) {
        this.identificacao = identificacao;
        this.peso = peso;
        this.idade = idade;
        this.porte = porte;
        this.vacinado = vacinado;
    }

    public abstract void comer();

    public int getIdentificacao() {
        return this.identificacao;
    }

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public boolean isVacinado() {
        return vacinado;
    }

    public void setVacinado(boolean vacinado) {
        this.vacinado = vacinado;
    }

    @Override
    public String toString() {
        return "Este animal tem: \n" +
                "Identificação: " + this.identificacao +
                ", peso: " + this.peso +
                ", idade: " + this.idade +
                ", porte: " + this.porte +
                ", vacinação: " + this.vacinado;
    }
}
