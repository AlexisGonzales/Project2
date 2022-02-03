public class UnsortedBulbList extends BulbList{
	
	public UnsortedBulbList() {}
	
	public void add(Bulb b) {
		append(new BulbNode(b));
	}
	
}
