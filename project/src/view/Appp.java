/*
    Na classe main você precisa criar pelo menos 1 barco, 1 avião e 2 hotéis, a Reserva deve
        ser criada dentro da ReservaController e adiciona na lista desta classe., lembre-se que o seu
        projeto precisa estar no padrão MVC todos os métodos do controller precisam ser utilizados, e
        devem ser criadas no mínimo 4 reservas. A exclusão precisa ser do id 2 logo após a inclusão da
        terceira reserva, e só então deve ser feita a quarta reserva.
*/
package view;
import java.time.LocalDate;
import java.time.LocalTime;

import controller.ReservaController;
import model.Aviao;
import model.Barco;
import model.Hospedagem;
import model.Reserva;


public class Appp {
    public static void main(String[] args) throws Exception {
        System.out.println("Prova de Java!\n Aluna: Evelyn");

// Criando o Barco
        Barco barco = new Barco(90, 50.00f, LocalTime.parse(“12:30”), LocalTime.parse(“20:30”));
    
// Criando o Avião
        Aviao aviao = new Aviao(10, 50.00f, LocalTime.parse(“00:30”), LocalTime.parse(“20:30”));
    
// Criando o Hotel
        Hospedagem hospedagem1 = new Hospedagem("Madaloso", 100, 70, 100.00f);
        Hospedagem hospedagem2 = new Hospedagem("Recanto", 70, 50, 100.00f);

// Criando as Reservas
        Reserva reserva1 = new Reserva("Curitiba", "Rio de Janeiro", LocalDate.parse(“2024-05-10”), LocalDate.parse(“2024-05-20”), hospedagem2, aviao);

        Reserva reserva2 = new Reserva("Curitiba", "Praia", LocalDate.parse(“2024-05-20”), LocalDate.parse(“2023-05-30”), hospedagem2, aviao);

        Reserva reserva3 = new Reserva("Curitiba", "EUA", LocalDate.parse(“2024-06-01”), LocalDate.parse(“2024-06-10”), hospedagem1, barco);

// Excluindo a reserva
        ReservaController.ExcluirReserva(2);

        Reserva reserva4 = new Reserva("Curitiba", "Praia Rosa", LocalDate.parse(“2024-07-01”), LocalDate.parse(“2024-07-10”), hospedagem1, barco);

// Buscando a Reserva
        ReservaController.BuscarReserva(4);

// Listando as Reservas 
        ReservaController.ListarReserva();

// Ordenando Reserva
        ReservaController.OrdenandoReserva;

    }
}