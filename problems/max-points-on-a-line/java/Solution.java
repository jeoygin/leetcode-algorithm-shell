/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */
import java.util.*;
public class Solution {
    public int maxPoints(Point[] points) {
        int res = points.length > 0 ? 1 : 0;
        for (int i = 0; i < points.length; i++) {
        	Map<Double, Integer> map = new HashMap<Double, Integer>();
        	int dup = 1;
        	for (int j = i + 1; j < points.length; j++) {
        		if (j != i) {
        			if (points[i].x == points[j].x && points[i].y == points[j].y) {
        				dup++;
        			} else {
        				Double k = points[i].x != points[j].x ? 1.0 * getK(points[i], points[j]) : Integer.MAX_VALUE;
	        			Integer cnt = map.get(k);
	        			if (cnt == null) {
	        				cnt = 0;
	        			}
	        			cnt++;
	        			map.put(k, cnt);
        			}
        		}
        	}
        	res = Math.max(res, dup);
        	for (Map.Entry<Double, Integer> entry : map.entrySet()) {
        		res = Math.max(res, entry.getValue() + dup);
        	}
        }
        return res;
    }
    double getK(Point p1, Point p2) {
    	if (p1.x > p2.x) {
    		return getK(p2, p1);
    	}
    	return 1.0 * (p2.y - p1.y) / (p2.x - p1.x);
    }
}
