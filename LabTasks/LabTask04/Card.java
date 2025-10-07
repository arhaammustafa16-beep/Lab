public class Card{
private final Suit suits;
private final Rank ranks;
 Card(Suit suits,Rank ranks){

this.suits=suits;
this.ranks=ranks;
}


public Rank getRank(){
return this.ranks;
}
public int getvalue(){

return this.ranks.getvalue();
}
public String getname(){

return this.ranks.getname();
}

public String toString(){


return String.format("%s of %s",suits,ranks);
}

}