public class Rectangle {
    Range xRange, yRange;

    public Rectangle(double xLow, double yLow, double xHigh, double yHigh) {
        xRange = new Range(xLow, xHigh);
        yRange = new Range(yLow, yHigh);
    }

    public Range getXRange() {
        return xRange;
    }

    public Range getYRange() {
        return yRange;
    }

    public boolean disjoint( Rectangle o ) {
        return (xRange.disjoint(o.xRange)) || (yRange.disjoint(o.yRange));
    }

   public boolean isIn( double x, double y ) {
    if(xRange.isIn(x) && yRange.isIn(y)) {
        return true;
    }

    return false;
}

   public double distance( double x, double y ) {
        double sum, xSum, ySum;

        if(isIn(x,y) == true) {
            return 0;
        }

        xSum = Math.pow(xRange.distance(x), 2);
        ySum = Math.pow(yRange.distance(y), 2);
        sum = xSum + ySum;

        return (Math.sqrt(sum));
    }

}