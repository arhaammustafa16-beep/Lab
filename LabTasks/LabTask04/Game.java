public class Game{
Card cards[];
int numofp;
Player player;
Player players[];

Deck d1;
Game(int numof){

 player= new Player(52/numof);
players =new Player[numof];
gett();
distribute();
}
public void gett(){
Card []gotcards= d1.getcard();
}
public void distribute(){
System.out.println(gotcards[0]);
}



}