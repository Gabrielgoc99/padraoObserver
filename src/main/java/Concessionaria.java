
import java.util.Observable;

public class Concessionaria extends Observable {

    private Integer unidade;
    private String cidade;
    private String nomeConcessionaria;

    public Concessionaria(Integer unidade, String cidade, String nomeConcessionaria) {
        this.unidade = unidade;
        this.cidade = cidade;
        this.nomeConcessionaria = nomeConcessionaria;
    }

    public void cadastrarCarro() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Concessionaria{" +
                "unidade=" + unidade +
                ", cidade='" + cidade + '\'' +
                ", concessionaria='" + nomeConcessionaria + '\'' +
                '}';
    }
}