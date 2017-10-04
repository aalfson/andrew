package objectOrientedProgramming;

public class Location {
	
	private int x = 0; 
	private int y = 0;
	
	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x; 
	}
	
	public void setX(int xCoordinate) {
		this.x = xCoordinate;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setY(int yCoordinate) {
		this.y = yCoordinate;
	}
}
