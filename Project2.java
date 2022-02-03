public class Project2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedBulbList sorted = new SortedBulbList();
		UnsortedBulbList unsorted = new UnsortedBulbList();
		
		String info = "";
		
		File file = new File("input.txt");
		Scanner scanner = null;
		try {
			scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				info = scanner.nextLine();
				
				String[] tokens = info.split(",");
				
				Bulb bulb = new Bulb();
				bulb.setManufacturer(tokens[0]);
				bulb.setPartNumber(tokens[1]);
				bulb.setWattage(Integer.parseInt(tokens[2]));
				bulb.setLumens(Integer.parseInt(tokens[3]));
				
				unsorted.add(bulb);
				sorted.add(bulb);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        BulbGUI bulbGUI = new BulbGUI();
        bulbGUI.show(unsorted, sorted);
	}

}
