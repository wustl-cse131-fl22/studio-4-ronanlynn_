package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(162,228,184);
		
		double[] x = {0,0,1,1};
		double[] y = {0,0.5,0,0.5};
		
		StdDraw.filledPolygon(x, y);
		
		StdDraw.setPenColor(220,208,255);
		
		double[] x1 = {0,0.5,1};
		double[] y2 = {0,0.25,0};
		
		StdDraw.filledPolygon(x1,y2);
		
		double[] x2 = {0,0.5,1};
		double[] y3 = {0.5,0.25,0.5};
		
		StdDraw.filledPolygon(x2, y3);
		
		StdDraw.setPenColor(0,0,0);
		
		StdDraw.setPenRadius(0.025);
		
		double[] x3 = {0,0,1,1};
		double[] y4 = {0,0.5,0.5,0};
		StdDraw.polygon(x3,y4);
		
		StdDraw.setPenColor(225,103,0);
		StdDraw.filledCircle(0.5, 0.25, 0.12);
		
		
		
		
		
	}
}