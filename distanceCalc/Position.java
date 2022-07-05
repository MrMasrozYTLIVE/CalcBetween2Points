package distanceCalc;

public class Position {
	protected double x, y, z;
	
	public Position(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Position(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Position(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
