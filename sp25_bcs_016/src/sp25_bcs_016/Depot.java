package sp25_bcs_016;
public class Depot{
String name;
Rack []r;
public Depot(String name, int n){
this.name=name;
r = new Rack[10];
for (int i =0; i<r.length;i++){
r[i]= new Rack();

}


} 
public void addRack(Rack r1){

}
public boolean store(String s,Parcel p1){
return true;
}
public void printAllLayouts(){
System.out.println("gg");

}


}