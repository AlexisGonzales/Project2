public class Bulb {
	
	private String manufacturer;
	private String partNumber;
	private int wattage;
	private int lumens;
	
	public Bulb(String manufacturer, String partNumber, int wattage, int lumens) {
		this.manufacturer = manufacturer;
		this.partNumber =partNumber;
		this.wattage = wattage;
		this.lumens = lumens;
		
		if(wattage < 5) {
			throw new IllegalBulbException(toString());
		}
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public String getPartNumber() {
		return partNumber;
	}
	
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	
	public int getWattage() {
		return wattage;
	}
	
	public void setWattage(int wattage) {
		this.wattage = wattage;
	}
	
	public int getLumens() {
		return lumens;
	}
	
	public void setLumens(int lumens) {
		this.lumens = lumens;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bulb other = (Bulb) obj;
		if (lumens != other.lumens)
			return false;
		if (manufacturer == null) {
			if (other.manufacturer != null)
				return false;
		} else if (!manufacturer.equals(other.manufacturer))
			return false;
		if (partNumber == null) {
			if (other.partNumber != null)
				return false;
		} else if (!partNumber.equals(other.partNumber))
			return false;
		if (wattage != other.wattage)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return manufacturer + "," + partNumber + "," + wattage + "," + lumens;
	}
	
	int compareTo(Bulb bulb){
		int wattage1 = this.wattage;
		int wattage2 = bulb.getWattage();
        
		if(wattage1 > wattage2) {
			return 1;
		}
		else {
			return -1;
		}
    }
	
}
