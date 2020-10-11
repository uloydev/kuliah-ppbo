class Conversion {
    private double C;
    public Conversion() {
        this.C = 0;
    }
    public Conversion(double C) {
        this.C = C;
    }
    public double cToF() {
        return this.C * 1.8 + 32;
    }
    public double cToK() {
        return this.C + 273;
    }
    public double cToR() {
        return this.C * 0.8;
    }
    public double cToF(double degreeC) {
        return degreeC * 1.8 + 32;
    }
    public double cToK(double degreeC) {
        return degreeC + 273;
    }
    public double cToR(double degreeC) {
        return degreeC * 0.8;
    }
}
