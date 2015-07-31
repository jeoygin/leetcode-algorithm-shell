public class Point {
	int x;
	int y;
 	public Point() {
 		x = 0; 
 		y = 0;
 	}
 	public Point(int a, int b) { 
 		x = a; 
 		y = b; 
 	}
 	public boolean equals(Object that) {
        if (that instanceof Point && that != null) {
            return equals(this, ((Point) that));
        }
        return false;
    }
    public boolean equals(Point src, Point dst) {
        if (src == null && dst == null) {
            return true;
        }

        if ((src == null || dst == null) && src != dst) {
            return false;
        }

        return src.x == dst.x && src.y == dst.y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}