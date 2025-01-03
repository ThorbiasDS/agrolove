import java.sql.Date;

public class Vacinacao {
    private Date data;
    private Vacina vacina;
    private Animal animal;
    
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
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
}
