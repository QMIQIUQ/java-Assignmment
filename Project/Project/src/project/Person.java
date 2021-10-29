/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Asus
 */
public class Person {
    private String DepartureDate = null;
    private String Route = null;
    private String Status = null;
    private String Seat = null;
    
    public Person() {
    }

    public Person(String DepartureDate, String Route, String Status, String Seat) {
        this.DepartureDate = DepartureDate;
        this.Route = Route;
        this.Status = Status;
        this.Seat = Seat;
    }

    public String getDepartureDate() {
        return DepartureDate;
    }

    public void setDepartureDate(String DepartureDate) {
        this.DepartureDate = DepartureDate;
    }

    public String getRoute() {
        return Route;
    }

    public void setRoute(String Route) {
        this.Route = Route;
    }
    
    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    public String getSeat() {
        return Seat;
    }

    public void setSeat(String Seat) {
        this.Seat = Seat;
    }
}
