/*
    Crie uma classe "Hospedagem" essa classe deve possuir os seguintes atributos: nome do
        hotel, números de quartos reservados, quantidade de pessoas, valor por pessoa e os
        seguintes métodos:
    • Construtor – deve receber todos os valores;
    • Getters e Setters;
    • ToString;
*/

package model;

public class Hospedagem {
    private String nomeHotel;
    private int qntdQuartosReservados;
    private int qntdPessoas;
    private float valorPessoa;  // Lembrar de por o "00,00f" no final do numero

// Construtor
    public Hospedagem(String nomeHotel, int qntdQuartosReservados, int qntdPessoas, float valorPessoa) {
        this.nomeHotel = nomeHotel;
        this.qntdQuartosReservados = qntdQuartosReservados;
        this.qntdPessoas = qntdPessoas;
        this.valorPessoa = valorPessoa;
    }

// Getters e Setters
    public String getNomeHotel() {
        return nomeHotel;
    }

    public void setNomeHotel(String nomeHotel) {
        this.nomeHotel = nomeHotel;
    }

    public int getQntdQuartosReservados() {
        return qntdQuartosReservados;
    }

    public void setQntdQuartosReservados(int qntdQuartosReservados) {
        this.qntdQuartosReservados = qntdQuartosReservados;
    }

    public int getQntdPessoas() {
        return qntdPessoas;
    }

    public void setQntdPessoas(int qntdPessoas) {
        this.qntdPessoas = qntdPessoas;
    }

    public float getValorPessoa() {
        return valorPessoa;
    }

    public void setValorPessoa(float valorPessoa) {
        this.valorPessoa = valorPessoa;
    }

    @Override
    public String toString() {
        return "Hospedagem [nomeHotel=" + nomeHotel + ", qntdQuartosReservados=" + qntdQuartosReservados
                + ", qntdPessoas=" + qntdPessoas + ", valorPessoa=" + valorPessoa + "]";
    }
    
}
