/*
    Crie uma classe controller "ReservaController" essa classe possuir o seguinte atributo: Lista
        de reservas e os seguintes métodos:
    • SalvarReserva – Deve receber todos os dados necessários, exceto o id e o valor da
            reserva, estes dois atributos devem ser calculados da seguinte forma:
        // Para calcular o valor deve ser levado em consideração o valor da hospedagem
            e do veículo, e só então passar para a classe Reserva o valor já calculado;
        //Para calcular o id deve verificar se qual é o maior valor de id da lista, o menor
            id possível deve ser 1.
    • buscarReserva() – Deve buscar uma reserva pelo id;
    • excluirReserva() – Deve excluir uma reserva pelo id.
    • listarReservas() – deve listar todas as reservas feitas.
    • Ordenar******* () – Deve ordenar por um dos atributos a sua escolha.
*/

package controller;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import model.Hospedagem;
import model.Reserva;
import model.Conta;

public class ContaController {
    private List<Conta> reservas;


// Construtor
    public ContaController(List<Conta> contas) {
        this.contas = contas;
    }

// Salavando a Reserva
    public void SalvarReserva(String localOrigem, String localDestino, LocalDate dataInicio, LocalDate dataFim,Hospedagem hospedagemAlugada, Conta veiculoAlugado){

        ContaController salvo = new ContaController(reservas);
    }

// Buscando Reserva usando o ID 
    public Reserva BuscarReserva(int idReserva){
        for (Reserva reserva : reservas) {
            if (reserva.getId() == idReserva)   return reserva;
        }
        return null;
    }

// Excluindo Reserva usando o ID 
    public void ExcluirReserva(int idReserva){
        for (Reserva reserva : reservas) {
            if (reserva.getId() == idReserva) {
        // Não lembrei da palavra deste comando
        //        exclude(reserva);
            }            
        }
    }

// Listando todas as reservas feitas
    public void ListarReserva(){
        for (Reserva reserva : reservas) {
            System.out.println("\n====RESERVA: " + reserva.getId() + "====\n" +
                                "Local de Embarque: " + reserva.getLocalOrigem() +
                                "Local de Desembarque: " + reserva.getLocalDestino() +
                                "Data de Embarque: " + reserva.getDataInicio() +
                                "Data de Desembarque: " + reserva.getDataFim() +
                                "Total a ser pago: " + reserva.getValor() +
                                "Hospedagem Alugada: " + reserva.getHospedagemAlugada() +
                                "Veiculo Alugado: " + reserva.getVeiculoAlugado()           );
        }
    }

// Ordenando por nome 
    public void OrdenandoReserva(){
        //  Erro falso
        //  Collections.sort(reservas.getVeiculoAlugado);
    }


}