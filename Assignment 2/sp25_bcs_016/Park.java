public class Park{
private String parkName;
private Shapetype shape;
private double width,depth,area;

public Park(String parkName,Shapetype shape,double width,double depth){
this.parkName=parkName;
this.shape=shape;
this.width=width;
this.depth=depth;
this.area=width*depth;
}

public double getArea(){
return area;
}


public String getParkName(){
return parkName;
}
}