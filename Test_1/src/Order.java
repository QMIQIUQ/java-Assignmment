
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
    int orderID=1;
    String customerName;
    int quantity;
    Date date = new Date();
    
    Order(){
    
    }

    
    public Order(String customerName, int quantity) {

        setCustomerName(customerName);
        setQuantity(quantity);

    }

    
    public String getCustomerName() {
        return customerName;
    }

    public int getOrderID() {
        return orderID;
    }

    public int getQuantity() {
        return quantity;
    }

    public Date getDate() {
        return date;
    }

    public void setId(int orderID) {
        this.orderID = orderID;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    private double getPrice(){
        double price =0;
        if(quantity<=4&&quantity>=1){
            price =10;
        }else if(quantity>=5){
            price = 9;
        }
        
        
        return price;
    }
    
    double calculatePrice(){
        return getPrice()*quantity;
    }
    
    @Override
    public String toString(){
        String msg = "Order Id: "+orderID+"\nCustomer Name:"+customerName+"\nOrder Date:"+date+"\nQuantity:"+quantity+"\nUnit Price:RM"+getPrice()+"\nPrice:RM"+calculatePrice();
        return msg;
    }
    
}
