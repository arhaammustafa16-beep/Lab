public class MainDemo{

public static void main(String[] args){
CityHousing city=new CityHousing("Lahore",5);

// Housing Societies
HousingSociety society1=new HousingSociety("LDA Avenue 1",3);
HousingSociety society2=new HousingSociety("LDA Avenue 2",3);

// Blocks for Society 1
Block blockA1=new Block("A",50,1);
Block blockB1=new Block("B",50,2);
Block blockC1=new Block("C",50,3);

// Blocks for Society 2
Block blockA2=new Block("A",50,1);
Block blockB2=new Block("B",50,2);
Block blockC2=new Block("C",50,3);

// Add blocks to societies
society1.addBlock(blockA1);
society1.addBlock(blockB1);
society1.addBlock(blockC1);

society2.addBlock(blockA2);
society2.addBlock(blockB2);
society2.addBlock(blockC2);

// Add societies to city
city.addSociety(society1);
city.addSociety(society2);

// Populate plots (all available by default)
for(Block b: society1.getBlocks()){
if(b!=null){
for(int i=0;i<50;i++){
b.addPlot(new Plot("",Plottype.RES_5_MARLA,Shapetype.RECTANGLE,112.5,5000000));
}
}
}
for(Block b: society2.getBlocks()){
if(b!=null){
for(int i=0;i<50;i++){
b.addPlot(new Plot("",Plottype.RES_5_MARLA,Shapetype.RECTANGLE,112.5,5000000));
}
}
}

// Print city layout
System.out.println("City Housing: "+city.getCityName());
for(HousingSociety society: city.getSocieties()){
if(society!=null){
System.out.println("\n Housing Society: "+society.getSocietyName()+"\n");
for(Block block:society.getBlocks()){
if(block!=null){
block.displayStreetLayout(10); // 10 plots per street
}
}
}
}

// Example booking (optional)
blockA1.getPlots()[6].book(); // Book plot 1-007
blockB2.getPlots()[12].book(); // Book plot 2-013

System.out.println("--- After Booking ---");
System.out.println("City Housing: "+city.getCityName());
for(HousingSociety society: city.getSocieties()){
if(society!=null){
System.out.println("\n Housing Society: "+society.getSocietyName()+"\n");
for(Block block:society.getBlocks()){
if(block!=null){
block.displayStreetLayout(10);
}
}
}
}
}
}