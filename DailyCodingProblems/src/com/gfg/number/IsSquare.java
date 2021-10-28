package com.gfg.number;

//https://practice.geeksforgeeks.org/problems/is-square1846/1
//class Point {
//	private int x, y;
//
//	Point(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//}

//Refernce : https://github.com/PaulCris/geeks4geeks/blob/master/isSquare/java/Main.java

public class IsSquare {
	static class Point {
		private int x, y;

		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	private static boolean isSquare(Point p1, Point p2, Point p3, Point p4) {
		/**
		 * Finding the length of all sides. Distance Between Two Points (x1, y1) and
		 * (x2, y2) √(x2 - x1)2 + (y2 - y1)2
		 */
		double val = findSquare(p1, p2);
		if (findSquare(p2, p3) == val || 2 * findSquare(p2, p3) == val && findSquare(p3, p4) == val
				|| 2 * findSquare(p3, p4) == val && findSquare(p4, p1) == val
				|| 2 * findSquare(p4, p1) == val && findSquare(p1, p3) == findSquare(p2, p4))
			return true;
		else
			return false;

	}

	private static double findSquare(Point p1, Point p2) {

		// (x1,y1),(x2,y2)
		int n = (p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y);

		System.out.println(n);
		// return Math.sqrt(n);
		return n;
	}

	public static void main(String[] args) {
		/*
		 * Point p1 = new Point(2, 6); Point p2 = new Point(5, 1); Point p3 = new
		 * Point(0, -2); Point p4 = new Point(-3, 3); Point p1 = new Point(0, 0), p2 =
		 * new Point( 0, 1 ), p3 = new Point(1, 1 ), p4 = new Point( 1, 0 );
		 */

		Point p1 = new Point(20, 10), p2 = new Point(10, 20), p3 = new Point(20, 20), p4 = new Point(10, 10);
		System.out.println("Given points are " + (isSquare(p1, p2, p3, p4) ? "square" : "not square"));

	}
}
