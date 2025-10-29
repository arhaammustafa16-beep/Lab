
package sp25_bcs_016;
import java.util.*;
public class Rack{
String name;
String ID;
ParcelType p1; 
int row_length;
int []arr;
Rack(){}
Rack(String name, int []r){
this.name=name;
arr=r;



}
public String getname(){
return name;
}



public String toString(){
StringBuilder sc =new StringBuilder();



sc.append(this.name+"\n");

for(int i=0;i<arr.length;i++){

sc.append(String.format("R %d :",i)).toString();
for(int j=0;j<arr[i];j++){
if (p1==null){
sc.append("[--] ").toString();
}
}
sc.append("\n");
}



return sc.toString();
}

}