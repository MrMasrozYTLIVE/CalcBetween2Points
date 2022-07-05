package distanceCalc;

public class Utils {
	public static double calcDistance2D(Position pos1, Position pos2) {
		return Math.sqrt(pos1.x * pos2.x + pos1.y * pos2.y);
	}
	
	public static double calcDistance3D(Position pos1, Position pos2) {
		return Math.sqrt(pos1.x * pos2.x + pos1.y * pos2.y + pos1.z * pos2.z);
	}
}
