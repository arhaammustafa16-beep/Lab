public class Shop {
private String shopID;
private double price;
private boolean available = true;

public Shop(String shopID, double price) {

this.shopID = shopID;
this.price = price;
    
}

public void book(){
 if (available) {
 available = false;
 System.out.println("Shop: " + shopID + " booked.");
 }
 else{
 System.out.println("Shop: " + shopID + " is already booked!");
}
}

public void cancel() {
available = true;
System.out.println("Booking cancelled for shop: " + shopID);
    }

 public boolean isAvailable() {
 return available;
 }
public String getShopID(){
return shopID;
}
}
