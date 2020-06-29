package main.model;

public class PacketCreator {

	public static void main(String[] args) {

		MilkPacket chuvash = new MilkPacket("Osada", 7.5, 750, 55, 7, "Cardboard", 35, "29.06.2020");
		MilkPacket chavush = new MilkPacket("Odasa", 5, 1000, 45);
		MilkPacket chvaush = new MilkPacket();
		System.out.println(chuvash);
		System.out.println(chavush);
		System.out.println(chvaush);

		System.out.println("-----------");
		chuvash.printDefaultPacketCapacityInMililiters();
		MilkPacket.printStaticDefaultPacketCapacityInMililiters();

		System.out.println("-----------");
		chavush.printDefaultPacketCapacityInMililiters();
		MilkPacket.printStaticDefaultPacketCapacityInMililiters();

		System.out.println("-----------");
		chvaush.printDefaultPacketCapacityInMililiters();
		MilkPacket.printStaticDefaultPacketCapacityInMililiters();

		System.out.println("-----------");

		MilkPacket[] milkPackets = new MilkPacket[4];
		int a = 0;
		while (a < 4) {
			milkPackets[a] = new MilkPacket();
			a++;
		}

		for (MilkPacket i : milkPackets) {
			System.out.println(i);
		}
	}

}
