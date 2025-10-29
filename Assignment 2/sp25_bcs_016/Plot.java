public class Plot {
protected String id;    
protected Plottype type;    
protected Shapetype shape;    
protected double area;
protected double price;    
protected boolean isAvailable = true;

    
public Plot(String id, Plottype type, Shapetype shape, double area, double price) {
        
this.id = id;        
this.type = type;        
this.shape = shape;       
this.area = area;
this.price = price;
    
}
    
public String getId(){
        return id;
}

public Plottype getType(){
return type;
}

public Shapetype getShape(){
return shape;
}

public double getArea(){
return area;
}

public double getPrice(){
 return price;
 }

public boolean isAvailable(){
return isAvailable;
}

public void book(){
        
if (isAvailable){
 isAvailable = false;
  System.out.println("Plot: " + id + " booked.");
}
else{
 System.out.println("Plot: " + id + " is already booked.");
}
    
}
    
public void cancel(){        
if (!isAvailable){            
isAvailable = true;            
System.out.println("Booking cancelled for plot " + id + ".");        
} 
else{            
System.out.println("Plot " + id + " was not booked.");        
}
    
}

    
public String getSummary() {
String status;
if(isAvailable){
status= "Available";

}   
else{
status= "Booked";
}     
return "Plot ID: "+id+", Type: "+type+", Area: "+area+" su, Price: "+price+" PKR, Status: "+status;
    

}
}

