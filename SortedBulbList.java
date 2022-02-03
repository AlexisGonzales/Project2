public class SortedBulbList extends BulbList{
	
	public SortedBulbList() {}
	
	public void add(Bulb b){
		BulbNode node = new BulbNode(b);
		BulbNode current = first;
        while(current.next != null && current.next.data.compareTo(node.data) < 0){
            current = current.next;
        }
        if (current.next == null){
            append(node);
        }
        if(current.next.data.compareTo(node.data) > 0){
            node.next = current.next;
            current.next = node;
            length++;
        }
    }

}
