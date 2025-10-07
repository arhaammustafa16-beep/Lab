package sp25_bcs_016;
public class Screen{
Seat seats[][];
String name;
double Price_premium=SeatType.Premium.getseatprice();
int Default_number_of_rows;
double Price_VIP=SeatType.VIP.getseatprice();
double Price_regular=SeatType.Regular.getseatprice();

Screen(){}

Screen(String name,int Default_number_of_rows){
this.name=name;
seats= new Seat[Default_number_of_rows][];
for (int i=0;i<seats.length;i++){
seats[i]= new Seat[Default_number_of_rows];
for (int j=0;j<seats[i].length;j++){

seats[i][j]= new Seat(String.format("%d-%03d",i,j),SeatType.Premium.getseattype(),SeatType.Premium.getseatprice(),true);
}}
}
public boolean cancel(int r,int c){
if (seats[r][c].cancelbooking()){
System.out.println("Booking is cancelled.");
return true;
}
else{
System.out.println("Booking is not cancelled.");
return false;
}

}

public boolean book(String seatID ){
String []parts= seatID.split("-");
int rownumber = Integer.parseInt(parts[0]);
int columnnumber =Integer.parseInt(parts[1]);
if (seats[rownumber][columnnumber].bookseat()){
System.out.println("Booking is done.");
return true;
}
else{
System.out.println("Booking is not done.");
return false;
}

}

public void checkrow(int row){

if (row>=0&& row<Default_number_of_rows){
System.out.println("Row number is valid");
}
else {
System.out.println("Row number is invalid");
}
}
public String getscreenname(){
return this.name;
}
public Seat getseat(String seatID){
String []parts=seatID.split("-");
int r=Integer.parseInt(parts[0]);
int c=Integer.parseInt(parts[1]);
return seats[r][c];

}

public int getavailableseatcount(){
int count=0;
for (int i=0;i<seats.length;i++){
for (int j=0;j<seats[i].length;j++){
if(seats[i][j].getAvaialability()=='A'){
count++;
}
}
}
return count;
} 
public void setrowtype(int i,SeatType s,double price){
for (int j=0;j<seats[i].length;j++){
seats[i][j].setprice(s.getseatprice());
seats[i][j].setseattype(s.getseattype());
}

}
public Seat getseat(int r,int c){
return seats[r][c];
}
public boolean book(int r,int c){
if (seats[r][c].bookseat()){
System.out.println("Booking is done.");
return true;
}
else{
System.out.println("Booking is not done.");
return false;
}
}
public int gettotalseatcount(){
int count=0;
for(int i=0;i<seats.length;i++){

for(int j=0;j<seats[i].length;j++){
count++;

}
}
return count;
}
public String toString(){
StringBuilder str = new StringBuilder();
str.append(name+"\n");
for(int i=0;i<seats.length;i++){

for(int j=0;j<seats[i].length;j++){
str.append(seats[i][j]+(" ").toString());

}
str.append("\n".toString());

}
return str.toString();

}





private void check_bounds( int r,int c){
if (r <= 0 || r >= seats.length || c < 0 || c >= seats[r].length) {

 System.out.println("Out of bounds");
}
}
public void DisplayVerbose (){
for (int i=0;i<seats.length;i++){
for(int j=0;j<seats[i].length;j++){
System.out.println(seats[i][j].getid() +" " +seats[i][j].getseattype()+" "+seats[i][j].getAvaialability()+" "+seats[i][j].price);

}
}
}


public int getAvailableseatcount(SeatType s){
int count=0;
for (int i=0;i<seats.length;i++){
for(int j=0;j<seats[i].length;j++){
if(seats[i][j].getAvaialability()=='A' && seats[i][j].getseatttype()==s.getseattype()){
count++;
}
}
}

return count;
}
public Seat FindFirstavailable(SeatType s){
for(int i=0;i<seats.length;i++){
for(int j=0;j<seats[i].length;j++){
if(seats[i][j].getseatttype()==s.getseattype() && seats[i][j].getAvaialability()=='A'){
return seats[i][j];
}
}
}
System.out.println("Not Available ");
return null;
}

public boolean cancel(String seatID ){
String []parts= seatID.split("-");
int rownumber = Integer.parseInt(parts[0]);
int columnnumber =Integer.parseInt(parts[1]);
if (seats[rownumber][columnnumber].cancelbooking()){
System.out.println("Booking is cancelled.");
return true;
}
else{
System.out.println("Booking is not cancelled.");
return false;
}

}
public int getrowlength(int n){
int c=seats[n].length;
return c;
}
private SeatType getseattype(int r,int c){
return seats[r][c].getseattype();
}

private double pricefor(SeatType s){
return s.getseatprice();
}

public int getRowCount(){
return seats.length;
}

public Seat[] ListAvaialable(SeatType s){
int count=getAvailableseatcount(s);
Seat arr[]=new Seat[count];
int index=0;
for(int i=0;i<seats.length;i++){
for(int j=0;j<seats[i].length;j++){
if(seats[i][j].getAvaialability()=='A' && seats[i][j].getseatttype()==s.getseattype()){
arr[index]=seats[i][j];
index++;
}
}
}
return arr;
}
public void DisplayLayout(){
System.out.println("=== Screen-"+name+" | Layout ===");
for(int i=0;i<seats.length;i++){
for(int j=0;j<seats[i].length;j++){
System.out.print(seats[i][j].toString()+" ");
}
System.out.println();
}
System.out.println("Total: "+gettotalseatcount()+", Available: "+getavailableseatcount());
}

}

