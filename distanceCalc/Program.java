package distanceCalc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
	public static void main(String[] args) {
        try {
			new Program().start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void start() throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		choseSpace();
		String input = reader.readLine();
		
		if(!input.equalsIgnoreCase("2D") && !input.equalsIgnoreCase("3D")) {
			System.out.println("Unknown space \"" + input + "\"! Restarting app...");
			start();
			return;
		}
		
		double x1 = selectCoord("x1", reader);
		double x2 = selectCoord("x2", reader);
		double y1 = selectCoord("y1", reader);
		double y2 = selectCoord("y2", reader);
		double z1 = 0, z2 = 0;
		if(input.equalsIgnoreCase("3D")) {
			z1 = selectCoord("z1", reader);
			z2 = selectCoord("z2", reader);
		}
		
		if(input.equalsIgnoreCase("2D")) {
			System.out.println("Distance between two positions: " + Utils.calcDistance2D(new Position(x1, y1), new Position(x2, y2)));
		} else {
			System.out.println("Distance between three positions: " + Utils.calcDistance3D(new Position(x1, y1, z1), new Position(x2, y2, z2)));
		}
	}

	private double selectCoord(String coord, BufferedReader reader) throws IOException {
		System.out.println("Please input " + coord + " coordinate!");
		System.out.print("> ");
		
		double d = 0;
		String input = reader.readLine();
		if(input.startsWith("Please")) input = reader.readLine();
		try {
			d = Double.parseDouble(input);
		} catch (NumberFormatException e) {
			System.out.println("Unknown value " + input);
			return selectCoord(coord, reader);
		}
		
		return d;
	}
	
	private void choseSpace() {
		System.out.println("Choose a space (2D or 3D)");
		System.out.print("> ");
	}
}
