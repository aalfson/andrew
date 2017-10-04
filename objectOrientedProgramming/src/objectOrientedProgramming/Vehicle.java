package objectOrientedProgramming;

public class Vehicle {

	private int passengerCount;
	public String name;
	private boolean submersible;  
	private Location location; 
	
	public Vehicle(int passengerCount, String name, Location location) {
		this.passengerCount = passengerCount;
		this.name = name; 
		this.submersible = false;
		this.location = location;
	}
	
	public int getPassengerCount() {
		return this.passengerCount; 
	}
	
	public void setPassengerCount(int count) {
		this.passengerCount = count;
	}
	
	public boolean getSubmersible() {
		return this.submersible; 
	}
	
	public void displayLocation() {
//		x, y
		System.out.println(this.location.getX() + ", " + this.location.getY());
	}
	
	public void move(int x, int y) {
		this.location.setX(x);
		this.location.setY(y);
	}
	
}


