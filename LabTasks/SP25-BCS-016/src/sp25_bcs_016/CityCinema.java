package sp25_bcs_016;
public class CityCinema{
Cinema cinemas[];
String city_name ;
static int  counter;
CityCinema(String name , int a){
this.city_name=name;
cinemas = new Cinema[a];
for (int i=0;i<cinemas.length;i++){


cinemas[i]=new Cinema("Cinema-"+(i+1),1);

}
}
public void DisplayCityLayout(){
System.out.println("=== CITY: "+city_name+" | All Cinema Layouts ===");
for(int i=0;i<cinemas.length;i++){
cinemas[i].DisplayCinemaLayout();
}
}
public String toString (){
StringBuilder str =new StringBuilder();
str.append(city_name);
for (int i=0;i<cinemas.length;i++){

str.append("\n"+cinemas[i].toString());
counter++;
str.append("\n"+"====Cinema "+counter+" ends===".toString());


}
return str.toString();
}
 

}
