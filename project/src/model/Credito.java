/*
    Crie uma classe "Barco" essa classe deve herdar a classe “Veiculo” e possuir os seguintes
        atributos: número da cabine e os seguintes métodos:
    • Getters e Setters;
    • ToString;
*/
package model;
import java.time.LocalTime;



// Herança
public class Credito extends Conta{

// Construtor        
    public Barco(int numPassagem, float valorPassagem, LocalTime horaPartida, LocalTime horaRetorno) {
            super(numPassagem, valorPassagem, horaPartida, horaRetorno);
            //TODO Auto-generated constructor stub
        }

// Geters e Setters
    public int getNumCabine() {
            return numCabine;
        }

    public void setNumCabine(int numCabine) {
            this.numCabine = numCabine;
        }

// ToString
    @Override
    public String toString() {
        return "Barco [numCabine=" + numCabine + "]";
    }
}

