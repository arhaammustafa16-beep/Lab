public class CornerPlot extends Plot {
private double width2;

public CornerPlot(String id,Plottype type,Shapetype shape,double area, double price, double width2){
super(id, type, shape, area, price);
this.width2 = width2;
    
}
    
public double getWidth2(){
return width2;
 }
    
public double getCornerPrice(){
return getPrice() * 1.08;
}

@Override
public String getSummary(){
String status;
if(isAvailable){
status= "Available";

}   
else{
status= "Booked";
}      
return "Plot ID: " + getId()+", Type: "+getType()+" (CORNER)" +", Area: "+getArea()+" su, Price: "+getCornerPrice()+" PKR, Status: "+status;
}
}