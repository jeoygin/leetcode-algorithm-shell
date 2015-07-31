public class Interval {
    int start;
    int end;
    Interval() { 
        this(0, 0);
    }
    Interval(int s, int e) { 
        start = s; 
        end = e; 
    }
    public boolean equals(Object that) {
        if (that instanceof Interval && that != null) {
            return equals(this, ((Interval) that));
        }
        return false;
    }
    public boolean equals(Interval src, Interval dst) {
        if (src == null && dst == null) {
            return true;
        }

        if ((src == null || dst == null) && src != dst) {
            return false;
        }

        return src.start == dst.start && src.end == dst.end;
    }

    public String toString() {
        return "[" + start + "," + end + "]";
    }
}