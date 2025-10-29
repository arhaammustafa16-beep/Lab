package sp25_bcs_016;
public class Demo{

public static void main(String[] args){
Depot lahore= new Depot("Lahore Depot", 4);
Rack rack1 = new Rack("LR-1",new int []{3,4,3});
lahore.addRack(rack1);
System.out.println("Initial Layout:");
System.out.println(rack1);
Parcel r1= new Parcel(" PKX-2025-000111",ParcelType.REGULAR);
Parcel r2= new Parcel(" PKX-2025-000222",ParcelType.REGULAR);
Parcel r3= new Parcel(" PKX-2025-00033",ParcelType.FRAGILE);
System.out.println("Store r1 into R3-S02: "+lahore.store("R3-s02",r1));




}

}