/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kmitltheatre;

/**
 *
 * @author pisit
 */
public abstract class Seat {
    protected int seatID;
    protected String seatType;
    protected double seatPrice;
    
    abstract public double getSeatPrice();
    abstract void setSeatPrice(double seatPrice);
    abstract String getSeatType();
}
