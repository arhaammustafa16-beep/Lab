public class CommercialMarket{    
private Shop[] shops;
private int shopCount;
    
public CommercialMarket(int capacity){       
shops = new Shop[capacity];
shopCount = 0;
    
}
    
public void addShop(Shop shop){       
if (shopCount==shops.length) {
Shop[] bigger=new Shop[shops.length+5];
for (int i=0;i<shops.length;i++) {
bigger[i]= shops[i];
            
}
shops= bigger;
}        
shops[shopCount++] = shop;
    
}



public Shop[] findVacantShops(){
int count = 0;
for(int i = 0;i<shopCount; i++) {
 if (shops[i].isAvailable()) count++;
  }

 Shop[] vacant = new Shop[count];        
int index = 0;        
for (int i = 0; i < shopCount; i++) {
            
if (shops[i].isAvailable()) {
                
vacant[index++] = shops[i];
            
}        
}

        return vacant;    
}
    
public int getShopCount(){
        
return shopCount;
}
    
public Shop getShop(int index){
        
if (index >= 0 && index < shopCount) {
            return shops[index];
        
}
        return null;
}
}