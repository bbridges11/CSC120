public class Range {

    double low, high;

    public Range(double l, double h) {
        high = Math.max(l,h);
        low = Math.min(l,h);
    }

    public double getLow() {
        return low;
    }

    public double getHigh() {
        return high;
    }

    public boolean disjoint(Range o) {
        return (high < o.low) || (o.high < low);
    }

    public boolean isIn(double p) {
        if(p >= low && p <= high) {
            return true;
        }

        return false;
    }

    public double distance(double p) {
        if(isIn(p) == true) {
                return 0;
        } else if(p > high) {
                return (p - high);
        } else {
                return (low - p);
        }
    }
}