/*  Crie uma classe abstrata "Veiculo" essa classe deve possuir os seguintes atributos: número
        da Passagem, Valor da Passagem, Hora da Partida e Hora do Retorno e os seguintes
        métodos:
    • Construtor – deve receber todos os valores;
    • Getters e Setters;  
*/

package model;

import java.time.LocalTime;

public abstract class Conta {

    private int numPassagem;
    private float valorPassagem;
    private LocalTime horaPartida;
    private LocalTime horaRetorno;

    
// Construtor da class Veiculo
    public Conta(int numPassagem, float valorPassagem, LocalTime horaPartida, LocalTime horaRetorno) {
        this.numPassagem = numPassagem;
        this.valorPassagem = valorPassagem;
        this.horaPartida = horaPartida;
        this.horaRetorno = horaRetorno;
    }
    
// Geters e Seters    
    public int getNumPassagem() {
        return numPassagem;
    }

    public void setNumPassagem(int numPassagem) {
        this.numPassagem = numPassagem;
    }

    public float getValorPassagem() {
        return valorPassagem;
    }

    public void setValorPassagem(float valorPassagem) {
        this.valorPassagem = valorPassagem;
    }

    public LocalTime getHoraPartida() {
        return horaPartida;
    }

    public void setHoraPartida(LocalTime horaPartida) {
        this.horaPartida = horaPartida;
    }

    public LocalTime getHoraRetorno() {
        return horaRetorno;
    }

    public void setHoraRetorno(LocalTime horaRetorno) {
        this.horaRetorno = horaRetorno;
    }

// ToString 
    @Override
    public String toString() {
        return "Veiculo [numPassagem=" + numPassagem + ", valorPassagem=" + valorPassagem + ", horaPartida="
                + horaPartida + ", horaRetorno=" + horaRetorno + "]";
    }

}
