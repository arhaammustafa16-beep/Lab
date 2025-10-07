package sp25_bcs_016;
public enum SeatType{
Premium("Premium",1500),VIP("VIP",1000),Regular("Regular",500);


public String name ;
public double price;
SeatType(String name,double price){

this.name =name;
this.price=price;


}
public String getseattype(){
return name;
}
public double getseatprice(){
return price;
}

} 