/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kmitltheatre;

import Seat.HoneymoonSeat;
import Seat.NormalSeat;
import Seat.PairedSeat;
import Seat.Seat;
import java.util.List;

/**
 *
 * @author pisit
 */

/* ยังไม่ได้เขียน updateShowtime() */
public class Theatre {
    private int id;
    private int theatreNumber;
    private String theatreSize = "Medium";
    private List<Showtime> showtimeIDList; // Display updated showtime when booking
    
    private Seat[][] seatLayout = new Seat[6][20];
    
    public Theatre(int theatreNumber) {
        this.theatreNumber = theatreNumber;
        createSeatLayout();
    }
   
    public Theatre(int theatreNumber, String theatreSize) {
        this.theatreNumber = theatreNumber;
        this.theatreSize = theatreSize;
        createSeatLayout();
    }
    
    public final void createSeatLayout() {
        /* Create Seat Layout */
        // Create Paired Seat for 1 rows, each row contains 20 seats
        for(int i = 0; i < 1; i++) {
            for(int j = 0; j < 20; j++) {
                seatLayout[i][j] = new PairedSeat();
            }
        }
        
        // Create Honeymoon Seat for 2 rows, each row contains 20 seats
        for(int i = 1; i < 3; i++) {
            for(int j = 0; j < 20; j++) {
                seatLayout[i][j] = new HoneymoonSeat();
            }
        }
        
        // Create Normal Seat for 3 rows, each row contains 20 seats
        for(int i = 3; i < 6; i++) {
            for(int j = 0; j < 20; j++) {
                seatLayout[i][j] = new NormalSeat();
            }
        }
    }
    
    public int convertSeatNameToRow(String seat) {
        String[] layout = new String[3];
        if(seat.length() == 2) {
            layout[0] = seat.substring(0, 1); // layout[0] is row
            layout[1] = seat.substring(1, 2); // layout[1] is column
        }
        else if(seat.length() == 3) {
            layout[0] = seat.substring(0, 1); // layout[0] is row
            layout[1] = seat.substring(1, 3); // layout[1] is column
        }

        int row = 99;
        
        // To get row from input seat
        switch(layout[0]) {
            case "A" :
                row = 0;
                break;
            case "B" :
                row = 1;
                break;
            case "C" :
                row = 2;
                break;
            case "D" :
                row = 3;
                break;
            case "E" :
                row = 4;
                break;
            case "F" :
                row = 5;
                break;
        }
        return row;
    }
    
    public int convertSeatNameToColumn(String seat) {
        String[] layout = new String[3];
        if(seat.length() == 2) {
            layout[0] = seat.substring(0, 1); // layout[0] is row
            layout[1] = seat.substring(1, 2); // layout[1] is column
        }
        else if(seat.length() == 3) {
            layout[0] = seat.substring(0, 1); // layout[0] is row
            layout[1] = seat.substring(1, 3); // layout[1] is column
        }

        // Change string number to integer
        int column = Integer.parseInt(layout[1]) - 1;

        return column;
    }
    
    public double getSeatPrice(String seat) {
        int row = convertSeatNameToRow(seat);
        int column = convertSeatNameToColumn(seat);
        return seatLayout[row][column].getSeatPrice();
        
    }
    
    public void updateShowtime() {
        // showtimeIDList = ID of showtime in database.
    }
    
    public void editTheatre(int theatreNumber) {
        this.theatreNumber = theatreNumber;
    }
    
    public void editTheatre(int theatreNumber, String theatreSize) {
        this.theatreNumber = theatreNumber;
        this.theatreSize = theatreSize;
    }

    public int getTheatreNumber() {
        return theatreNumber;
    }

    public void setTheatreNumber(int theatreNumber) {
        this.theatreNumber = theatreNumber;
    }

    public String getTheatreSize() {
        return theatreSize;
    }

    public void setTheatreSize(String theatreSize) {
        this.theatreSize = theatreSize;
    }

    public List<Showtime> getShowtimeIDList() {
        return showtimeIDList;
    }

    public void getSeatLayout() {
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 20; j++) {
                String s = "[" + i + "]" + "[" + j + "] ";
                System.out.print(s);
            }
            System.out.println();
        }
    }
    
    @Override
    public String toString() {
        return "Theatre number : " + this.theatreNumber + ", Theatre size : " + this.theatreSize;
    }
}
