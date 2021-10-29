
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dogaa
 */
public class Order {
    String orderID;
    Date orderDate;
    double orderAmount;
    int paymentMethod;
    Boolean paymentStatus;

    public Order() {
    }

    public Order(String orderID, Date orderDate, double orderAmount) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public String getOrderID() {
        return orderID;
    }

    public int getPaymentMethod() {
        return paymentMethod;
    }

    public Boolean getPaymentStatus() {
        return paymentStatus;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public void setPaymentMethod(int paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setPaymentStatus(Boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
    
    
    
    
    
    
}
