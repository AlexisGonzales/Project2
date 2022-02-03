public abstract class BulbList {

	protected BulbNode first;
    protected BulbNode last;
    protected int length;
    
    public BulbList() {
    	first = new BulbNode(null);
    	last = first;
    	length = 0;
    }

    public int getLength(){
        return length;
    }

    public void append(BulbNode bulbNode){
        last.next = bulbNode;
        last = bulbNode;
        length++;
    }
}
