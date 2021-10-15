
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {


    @Test
    void returnNotify() {
        Concessionaria concessionaria = new Concessionaria(3, "Juiz de Fora", "Carros & Cia");
        Carro carroA = new Carro("Ford Ecosport");
        Carro carroB = new Carro("Chevrolet Tracker");
        carroA.cadastrar(concessionaria);
        carroB.cadastrar(concessionaria);
        concessionaria.cadastrarCarro();
        assertEquals("Ford Ecosport, carro cadastrado na Concessionaria{unidade=3, cidade='Juiz de Fora', concessionaria='Carros & Cia'}", carroA.getNotify());
        assertEquals("Chevrolet Tracker, carro cadastrado na Concessionaria{unidade=3, cidade='Juiz de Fora', concessionaria='Carros & Cia'}", carroB.getNotify());
    }

    @Test
    void notReturnNotify() {
        Concessionaria concessionaria = new Concessionaria(2, "Cabo Frio", "Jupiter Automoveis");
        Carro carro = new Carro("Toyota Camry");
        concessionaria.cadastrarCarro();
        assertEquals(null, carro.getNotify());
    }
}

