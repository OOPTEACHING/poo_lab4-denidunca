package scootere;

public class Station {
	public static final int SLOTS = 5;
	public Scooter[] scooters;
	private int emptySlotIndex;

	public Station() {
		scooters = new Scooter[SLOTS];
	}

	public int getIndex() {
		return this.emptySlotIndex;
	}

	public void setIndex(int emptySlotIndex) {
		this.emptySlotIndex = emptySlotIndex;
	}

	public void addScooter(Scooter scooter) {
		if (emptySlotIndex < SLOTS) {
			this.scooters[emptySlotIndex] = scooter;
			this.emptySlotIndex++;
		} else {
			System.out.println("Scooterul nu a putut fi adaugat");
		}

	}

	public void removeScooter(Scooter scooter) {
		if (emptySlotIndex < SLOTS) {
			if (this.scooters[emptySlotIndex] == scooter) {
				this.scooters[emptySlotIndex] = null;
			}

			this.emptySlotIndex--;
		} else {
			System.out.println("Nu s-a putut gasi nici un scooter");
		}
	}

	public void removeAllScooters() {
		while (emptySlotIndex > 0) {
			this.scooters[emptySlotIndex] = null;
			emptySlotIndex--;
		}
		this.emptySlotIndex = 0;
	}

}
