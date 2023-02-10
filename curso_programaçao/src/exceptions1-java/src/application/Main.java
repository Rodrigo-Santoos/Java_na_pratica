package application;

import model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        Scanner entrada = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {

            //leitura dos dados
            System.out.print("Room number: ");
            int roomNumber = entrada.nextInt();

            System.out.print("Check-in date (dd/mm/yyyy): ");
            Date checkIn = sdf.parse(entrada.next());

            System.out.print("Check-out date (dd/mm/yyyy): ");
            Date checkOut = sdf.parse(entrada.next());

    //========================================================================================================
            //instanciando a Reserva com os dados ja escritos
            Reservation reservation = new Reservation(roomNumber,checkIn,checkOut);
            //mostrando os dados
            System.out.println(reservation);

            //==========================================================================
            //ler dados de atualizaçao de Reserva
            System.out.println();
            System.out.println("Enter data to update the reservation:");

            System.out.print("Check-in date (dd/mm/yyyy): ");
            checkIn = sdf.parse(entrada.next());

            System.out.print("Check-out date (dd/mm/yyyy): ");
            checkOut = sdf.parse(entrada.next());

            //atualizaçao da reserva
            reservation.updateDates(checkIn,checkOut);

            //mostrando os dados ja atualizados da reserva
            System.out.println(reservation);
        }
        catch (ParseException parseException){
            System.out.println("Invalid Date Format");
        }
        catch (IllegalArgumentException illegalArgumentException){
            System.out.println("Error in reservation: " + illegalArgumentException.getMessage());
        }
        entrada.close();
    }
}
