
import java.util.Observable;
import java.util.Observer;

public class Carro implements Observer {

    private String model;
    private String notify;

    public Carro(String model) {
        this.model = model;
    }

    public String getNotify() {
        return this.notify;
    }

    public void cadastrar(Concessionaria concessionaria) {
        concessionaria.addObserver(this);
    }

    public void update(Observable concessionaria, Object arg1) {
        this.notify = this.model + ", carro cadastrado na " + concessionaria.toString();

    }
}