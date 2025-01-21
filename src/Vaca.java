public class Vaca extends Animal{

    private boolean leiteProduzido;

    public Vaca(){
        super();
        this.leiteProduzido = false;
    }

    public Vaca(int identificacao, float peso, int idade, String porte, boolean vacinado, boolean leiteProduzido){
        super(identificacao, peso, idade, porte, vacinado);
        this.leiteProduzido = leiteProduzido;
    }

    public void parir(){
        System.out.println("Um novo bezerro chegou à fazenda!");
        this.leiteProduzido = true;
    }

    public void comer(){
        System.out.println("Alimantando a vaquinha");
        super.setPeso((float) (super.getPeso() + 0.50));
    }

    public boolean isLeiteProduzido() {
        return leiteProduzido;
    }

    public void setLeiteProduzido(boolean leiteProduzido) {
        this.leiteProduzido = leiteProduzido;
    }

    @Override
    public String toString(){
        return super.toString() +
        ", leite produzido: " + this.leiteProduzido;
    }
}
