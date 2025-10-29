public class Block{
private String blockName;
private Plot[] plots;
private int plotCount;
private int streetNumber;
private CommercialMarket market;

public Block(String blockName,int plotCapacity,int streetNumber){
this.blockName=blockName;
this.plots=new Plot[plotCapacity];
this.plotCount=0;
this.streetNumber=streetNumber;
this.market=new CommercialMarket(5);
}

public void addPlot(Plot plot){
if(plotCount==plots.length){
Plot[] bigger=new Plot[plots.length+2];
for(int i=0;i<plots.length;i++){
bigger[i]=plots[i];
}
plots=bigger;
}
String houseNumber=String.format("%03d",plotCount+1);
plot.id=streetNumber+"-"+houseNumber;
plots[plotCount++]=plot;
}

public void addShop(Shop shop){
market.addShop(shop);
}

public Plot[] getPlots(){
return plots;
}

public CommercialMarket getMarket(){
return market;
}

public void displayStreetLayout(int plotsPerStreet){
System.out.println("Street Layout for Block "+blockName+" (A=Available,X=Booked)");
int totalStreets=(plotCount+plotsPerStreet-1)/plotsPerStreet;
for(int s=0;s<totalStreets;s++){
System.out.print("Street "+(s+1)+": ");
for(int p=0;p<plotsPerStreet;p++){
int idx=s*plotsPerStreet+p;
if(idx<plotCount){
Plot plot=plots[idx];
System.out.print(plot.isAvailable()?"A ":"X ");
}
}
System.out.println();
}
System.out.println();
}
}