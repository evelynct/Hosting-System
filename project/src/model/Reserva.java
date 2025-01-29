/*
    Crie uma classe "Reserva" essa classe deve possuir os seguintes atributos: id, origem,
        destino, data de Início, data de fim, valor, Hospedagem e Veículo e os seguintes métodos:
    • Construtor – deve receber todos os valores;
    • Getters e Setters;
    • ToString;
*/

package model;

import java.time.LocalDate;

public class Reserva {
    private int id = 0;
    private String localOrigem;
    private String localDestino;
    private LocalDate dataInicio; // LocalDate.parse(“2023-05-29”)
    private LocalDate dataFim;  // LocalDate.parse(“2023-05-29”)
    private float valor;
    private Hospedagem hospedagemAlugada;
    private Conta veiculoAlugado;


// Construtor
    public Reserva(String localOrigem, String localDestino, LocalDate dataInicio, LocalDate dataFim, 
        Hospedagem hospedagemAlugada, Conta veiculoAlugado) {

// Calculando o ID aqui no construtor
        this.id = id++;
        this.localOrigem = localOrigem;
        this.localDestino = localDestino;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;

// Estou calculando o valor da reserva aqui mesmo 
        this.valor = hospedagemAlugada.getValorPessoa() + veiculoAlugado.getValorPassagem();
        
        this.hospedagemAlugada = hospedagemAlugada;
        this.veiculoAlugado = veiculoAlugado;
    }

// Getters e Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLocalOrigem() {
        return localOrigem;
    }
    public void setLocalOrigem(String localOrigem) {
        this.localOrigem = localOrigem;
    }
    public String getLocalDestino() {
        return localDestino;
    }
    public void setLocalDestino(String localDestino) {
        this.localDestino = localDestino;
    }
    public LocalDate getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }
    public LocalDate getDataFim() {
        return dataFim;
    }
    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public Hospedagem getHospedagemAlugada() {
        return hospedagemAlugada;
    }
    public void setHospedagemAlugada(Hospedagem hospedagemAlugada) {
        this.hospedagemAlugada = hospedagemAlugada;
    }
    public Conta getVeiculoAlugado() {
        return veiculoAlugado;
    }
    public void setVeiculoAlugado(Conta veiculoAlugado) {
        this.veiculoAlugado = veiculoAlugado;
    }

// ToString
    @Override
    public String toString() {
        return "Reserva [id=" + id + ", localOrigem=" + localOrigem + ", localDestino=" + localDestino + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim + ", valor=" + valor + ", hospedagemAlugada=" + hospedagemAlugada + ", veiculoAlugado=" + veiculoAlugado + "]";
    }

}
