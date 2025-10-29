public class CityHousing{
private String cityName;
private HousingSociety[] societies;
private int societyCount;

public CityHousing(String cityName,int capacity){
this.cityName=cityName;
societies=new HousingSociety[capacity];
societyCount=0;
}

public void addSociety(HousingSociety society){
if(societyCount==societies.length){
HousingSociety[] bigger=new HousingSociety[societies.length+2];
for(int i=0;i<societies.length;i++){
bigger[i]=societies[i];
}
societies=bigger;
}
societies[societyCount++]=society;
}

public String getCityName(){
return cityName;
}

public HousingSociety[] getSocieties(){
return societies;
}
}