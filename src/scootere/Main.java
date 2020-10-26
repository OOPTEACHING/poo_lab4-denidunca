package scootere;

public class Main {
	public static void main(String[] args) {
		User user = new User(1, "Denisa", "1234567891");
		User user2 = new User(2, "Mihaela", "9876543219");

		Scooter scooter = new Scooter(12, "Bolt", "verde", user);
		Scooter scooter2 = new Scooter(11, "Bolt", "galben", user2);
		Scooter scooter3 = new Scooter(132, "Bolt", "verde", user);
		Scooter scooter4 = new Scooter(131, "Bolt", "galben", user2);

		Station station = new Station();

		station.addScooter(scooter);
		System.out.println(station.getIndex());

		station.addScooter(scooter2);
		System.out.println(station.getIndex());

		station.addScooter(scooter3);
		System.out.println(station.getIndex());

		station.addScooter(scooter4);
		System.out.println(station.getIndex());

		station.removeScooter(scooter2);
		System.out.println(station.getIndex());

		station.removeAllScooters();
		System.out.println(station.getIndex());

	}
}
