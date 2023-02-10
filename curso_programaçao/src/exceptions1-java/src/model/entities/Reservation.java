package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    //=====================================================================
    //construct
    public Reservation(){

    }

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    //=====================================================================
    //Getters e setters

    public static SimpleDateFormat getSdf() {
        return sdf;
    }

    public static void setSdf(SimpleDateFormat sdf) {
        Reservation.sdf = sdf;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

   /* public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }*/

    public Date getCheckOut() {
        return checkOut;
    }

   /* public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }*/


    //=====================================================================
    //metodos

    public long duration(){
        //pegando o milisegundos da data
        long milise = checkOut.getTime() - checkIn.getTime();
        //convertendo o milisegundos para dias
        return TimeUnit.DAYS.convert(milise,TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkin, Date checkout){

        //==========================================================================
        //verificando se a data é posterior
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)){
           throw new IllegalArgumentException("Reservation dates for update must be future dates") ;

        } if (!checkOut.after(checkIn)) {
            throw new IllegalArgumentException("Error in reservation: Check-out date must be after check-in date");
        }

        this.checkIn = checkin;
        this.checkOut = checkout;

    }

    @Override
    public String toString() {
        return "Reservation: Room "
                + roomNumber
                + ", check-in: "
                + sdf.format(checkIn)
                + ", check-out: "
                + sdf.format(checkOut)
                + ", "
                + duration() + " Nights";
    }
}
