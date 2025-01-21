import java.time.LocalDate;

public class Vacinacao {
    private LocalDate data;
    private Vacina vacina;
    private Animal animal;

    public Vacinacao(){

    }

    public Vacinacao(LocalDate data, Vacina vacina, Animal animal){
        this.data = data;
        this.vacina = vacina;
        this.animal = animal;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Vacina getVacina() {
        return vacina;
    }

    public void setVacina(Vacina vacina) {
        this.vacina = vacina;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString(){
        return "Vacinação com data: " + this.data + ", vacina: " + this.vacina + ", animal" + this.animal;
    }
}
