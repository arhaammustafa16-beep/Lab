public class HousingSociety {
private String societyName;
private Block[] blocks;
private int blockCount;

public HousingSociety(String societyName, int blockCapacity){
this.societyName= societyName;
blocks= new Block[blockCapacity];
blockCount = 0;
}

public void addBlock(Block block){

if (blockCount==blocks.length){

Block[] bigger= new Block[blocks.length+3];
for (int i= 0;i<blocks.length;i++){

bigger[i]=blocks[i];
}
blocks=bigger;

}
blocks[blockCount++]=block;
}

public String getSocietyName(){
return societyName;
}

public Block[]getBlocks(){
return blocks;
}
}