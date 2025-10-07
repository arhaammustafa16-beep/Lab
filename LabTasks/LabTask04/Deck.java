import java.util.Random;
public class Deck{

Card cards[];

Deck(){
cards=new Card[52];
Rank ranks[]= Rank.values();
Suit suits[]=Suit.values();

int x=0;
for(int i=0;i<ranks.length;i++){

for(int j=0;j<suits.length;j++){
cards[x++]= new Card(suits[j],ranks[i]);

}
}
 }
public void display(){
for (int i=0;i<cards.length;i++){
System.out.println(cards[i]);
}
}
public void shuffle(){

for(int i=0;i<2322;i++){
Random raa = new Random();
int ra=raa.nextInt(52);
Card t = cards[ra];
cards[ra]=cards[0];
cards[0]=  t;

}
}
public Card[] getcard(){
return cards;

}








}
