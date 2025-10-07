public enum Suit{
SPADES("Spades"),HEARTS("Hearts"),DIAMONDS("Diamonds"),CLUBS("Clubs");
private final String name;

Suit(String name){
this.name=name;

}
public String getname(){
return this.name;
}
/*public String toString(){

return String.format("Suit name: %s",this.name);
}*/
} 