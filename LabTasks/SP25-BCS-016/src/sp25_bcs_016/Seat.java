package sp25_bcs_016;
public class Seat{
String seatType;
double price;
String id;
boolean isAvailable;
Seat(){}
Seat(String id, String type, double price, boolean isAvailable ){

this.id=id;
this.seatType=type;
this.price=price;
this.isAvailable=isAvailable;


}
public String getid(){
return this.id;

}

public SeatType getseattype(){
if(this.seatType.equals(SeatType.Premium.getseattype())){
return SeatType.Premium;
}
else if(this.seatType.equals(SeatType.VIP.getseattype())){
return SeatType.VIP;
}
else if(this.seatType.equals(SeatType.Regular.getseattype())){
return SeatType.Regular;
}
else {
return null;
}
}

public String getseatttype(){
return this.seatType;
}

public char getAvaialability(){
if(this.isAvailable){
return 'A';
}
else{
return 'B';
}

}
public void setseattype(String s){
this.seatType=s;
}
public boolean bookseat(){
this.isAvailable=false;
return true;
}
public boolean cancelbooking(){
isAvailable=true;
return this.isAvailable;
}
public void setprice(double price){
this.price =price;
}
public void setseattype(SeatType seattype){
String a=seattype.getseattype();
this.seatType=a;
}
public String toString(){

return String.format("[%s:%c]",id,getAvaialability());

}




}


