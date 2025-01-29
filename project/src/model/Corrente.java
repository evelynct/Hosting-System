/*
    Crie uma classe "Aviao" essa classe deve herdar a classe “Veiculo” e possuir o seguinte
        atributo: Peso da Bagagem e os seguintes métodos:
    • Getters e Setters;
    • ToString;
*/
package model;

import java.time.LocalTime;

// Herança
public class Aviao extends Conta {
    private int pesoBagagem;

// Construtor
    public Aviao(int numPassagem, float valorPassagem, LocalTime horaPartida, LocalTime horaRetorno) {
        super(numPassagem, valorPassagem, horaPartida, horaRetorno);
        //TODO Auto-generated constructor stub
    }

// Getters e Setters
    public int getPesoBagagem() {
        return pesoBagagem;
    }

    public void setPesoBagagem(int pesoBagagem) {
        this.pesoBagagem = pesoBagagem;
    }

// ToString
    @Override
    public String toString() {
        return "Aviao [pesoBagagem=" + pesoBagagem + "]";
    }
    
}
