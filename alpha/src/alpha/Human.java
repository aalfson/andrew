package alpha;

public class Human {
	
	String name = "Alex";
	int age = 15;

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
}

