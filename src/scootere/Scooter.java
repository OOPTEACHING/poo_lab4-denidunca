package scootere;

public class Scooter {
	private int id;
	private String color;
	private String name;
	private User user;

	public Scooter(int id, String name, String color, User user) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.user = user;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
