package main.model;

public class MilkPacket {
	private static final int DEFAULT_PACKET_CAPACITY_IN_MILILITERS = 1000;
	
	private String producerName;
	
	private double milkFattinessInPercents;
	
	private int packetCapacityInMililiters;
	
	private int caloriesAmountPerHundredGrams;
	
	private int shelfLifeInDays;
	
	private String packetMaterial;
	
	protected double priceInHryvnias;
	
	protected String dateOfProduction;

	public MilkPacket() {

	}

	public MilkPacket(String producerName, double milkFattinessInPercents, int packetCapacityInMililiters,
			int caloriesAmountPerHundredGrams, int shelfLifeInDays, String packetMaterial, double priceInHryvnias,
			String dateOfProduction) {
		this.producerName = producerName;
		this.milkFattinessInPercents = milkFattinessInPercents;
		this.packetCapacityInMililiters = packetCapacityInMililiters;
		this.caloriesAmountPerHundredGrams = caloriesAmountPerHundredGrams;
		this.shelfLifeInDays = shelfLifeInDays;
		this.packetMaterial = packetMaterial;
		this.priceInHryvnias = priceInHryvnias;
		this.dateOfProduction = dateOfProduction;
	}

	public MilkPacket(String producerName, double milkFattinessInPercents, int packetCapacityInMililiters,
			int caloriesAmountPerHundredGrams) {
		this(producerName, milkFattinessInPercents, packetCapacityInMililiters, caloriesAmountPerHundredGrams, 0, null,
				0, null);
	}

	@Override
	public String toString() {
		return "MilkPacket [producerName=" + producerName + ", milkFattinessInPercents=" + milkFattinessInPercents
				+ ", packetCapacityInMililiters=" + packetCapacityInMililiters + ", caloriesAmountPerHundredGrams="
				+ caloriesAmountPerHundredGrams + ", shelfLifeInDays=" + shelfLifeInDays + ", packetMaterial="
				+ packetMaterial + ", priceInHryvnias=" + priceInHryvnias + ", dateOfProduction=" + dateOfProduction
				+ "]";
	}

	public static void printStaticDefaultPacketCapacityInMililiters() {
		System.out.println(DEFAULT_PACKET_CAPACITY_IN_MILILITERS);
	}

	public void printDefaultPacketCapacityInMililiters() {
		System.out.println(DEFAULT_PACKET_CAPACITY_IN_MILILITERS);
	}


	public void resetValues(String producerName, double milkFattinessInPercents, int packetCapacityInMililiters,
			int caloriesAmountPerHundredGrams, int shelfLifeInDays, String packetMaterial, double priceInHryvnias,
			String dateOfProduction) {
		this.producerName = producerName;
		this.milkFattinessInPercents = milkFattinessInPercents;
		this.packetCapacityInMililiters = packetCapacityInMililiters;
		this.caloriesAmountPerHundredGrams = caloriesAmountPerHundredGrams;
		this.shelfLifeInDays = shelfLifeInDays;
		this.packetMaterial = packetMaterial;
		this.priceInHryvnias = priceInHryvnias;
		this.dateOfProduction = dateOfProduction;
	}

}
