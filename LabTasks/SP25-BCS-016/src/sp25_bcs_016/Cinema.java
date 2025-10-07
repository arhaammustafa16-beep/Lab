package sp25_bcs_016;
public class Cinema{
Screen screens[];
String cinema_name;
static int counter;

Cinema(){}

Cinema(String name, int n){
this.cinema_name=name;
screens=new Screen[n];
for(int i=0;i<screens.length;i++){
screens[i]=new Screen("1",5);
}
}

public void DisplayCinemaLayout(){
System.out.println("=== CINEMA: "+cinema_name+" | Layouts ===");
for(int i=0;i<screens.length;i++){
screens[i].DisplayLayout();
}
}

public String toString(){
StringBuilder str=new StringBuilder();
str.append(cinema_name+"\n");
for(int i=0;i<screens.length;i++){
str.append(screens[i].toString()+"\n");
counter++;
str.append("+++Screen "+counter+" ends+++\n==============\n");
}
return str.toString();
}
}