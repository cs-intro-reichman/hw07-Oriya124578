/** Draws the Koch curve and the the Koch snowflake fractal. */
public class Koch {

	public static void main(String[] args) {
		int n = 3;
        if (args.length > 0) {
            n = Integer.parseInt(args[0]);
        }

        snowFlake(n);
        
    }


	

	public static void curve(int n, double x1, double y1, double x2, double y2) {
		if (n == 0) {
		StdDraw.line(x1, y1, x2, y2);
		return;
	}
		double x_p2 = x1 + (x2 - x1) / 3;
        double y_p2 = y1 + (y2 - y1) / 3;

        double x_p4 = x1 + 2 * (x2 - x1) / 3;
        double y_p4 = y1 + 2 * (y2 - y1) / 3;

        double dx = x_p4 - x_p2;
        double dy = y_p4 - y_p2;
        
        double x_p3 = x_p2 + dx * 0.5 - dy * Math.sqrt(3) / 2;
        double y_p3 = y_p2 + dx * Math.sqrt(3) / 2 + dy * 0.5;

		curve(n - 1, x1, y1, x_p2, y_p2);
        curve(n - 1, x_p2, y_p2, x_p3, y_p3);
        curve(n - 1, x_p3, y_p3, x_p4, y_p4);
        curve(n - 1, x_p4, y_p4, x2, y2);
	}

    /** Gets n, and draws a Koch snowflake of n edges in the standard canvass. */
	public static void snowFlake(int n) {
		// A little tweak that makes the drawing look better
		StdDraw.setYscale(0, 1.1);
		StdDraw.setXscale(0, 1.1);
		// Draws a Koch snowflake of depth n
		//// Write the rest of your code below.
		double x1 = 0.200, y1 = 0.650;
        double x2 = 0.500, y2 = 0.130;
        double x3 = 0.800, y3 = 0.650;
		curve(n, x1, y1, x3, y3);
        curve(n, x3, y3, x2, y2);
        curve(n, x2, y2, x1, y1);
    }
}
	