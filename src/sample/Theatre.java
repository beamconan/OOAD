package sample;

import sample.Showtime;

import java.util.Vector;

public class Theatre {
    private Vector<Showtime> theShowList;
    private int theatreID;
    private String theatreSize = "small";
    private double basicSeatPrice;
    
    public void addTheShow(Showtime show) {
        theShowList.addElement(show);
    }
    
    public void delTheShow(Showtime show) {
        theShowList.removeElement(show);
    }
    
    public int getTheatreID() {
        return theatreID;
    }
    
    public String getSize() {
        return size;
    }
    
    public void updateTheatreDetials(int id, String size, double p) {
        if (id != none) {
            theatreID = id;
        }
        if (size != null) {
            theatreSize = size;
        }
        if (p != none) {
            basicSeatPrice = p;
        }
    }
    
    public boolean checkShowtime(int id, String period){
        return theShowList.get(id).getTime().equalsIgnoreCase(period);
    }
    
    
}
