class Rational { 
    long numerator,denominator; 

    class Illegal extends Exception { 
        String reason; 
        Illegal (String reason) { 
            this.reason = reason; 
        } 
    } 

    Rational () { 
        // to be completed
    }

    Rational(long numerator, long denominator) throws Illegal { 
        this.numerator = numerator;
        this.denominator = denominator;
    } 

    // find the reduce form 
    private void simplestForm() { 
        long computeGCD; 
        computeGCD = GCD(Math.abs(numerator), denominator); 
        numerator /= computeGCD; 
        denominator /= computeGCD; 
    } 

    // find the greatest common denominator 
    private long GCD(long a, long b) { 
        if (a%b ==0) return b; 
        else return GCD(b,a%b); 
    } 

    public void add(Rational x) {
        numerator = (numerator * x.denominator) + (x.numerator * denominator);
        denominator = (denominator * x.denominator); 
        simplestForm();
    }

    public void subtract(Rational x) {
        // to be completed
        numerator = (numerator * x.denominator) - (x.numerator * denominator);
        denominator = (denominator * x.denominator);
        simplestForm();
    }

    public void multiply(Rational x) {
        numerator = (numerator * x.numerator);
        denominator = (denominator * x.denominator);
        simplestForm();
        // to be completed
    }

    public void divide(Rational x) {
        numerator = (numerator * x.denominator);
        denominator = (denominator * x.numerator);
        // to be completed
    }

    public boolean equals (Object x) {
        // to be completed
        if(x == null){
            return false;
        }
        if (x.getClass() != this.getClass()){
            return false;
        }
        Rational r = (Rational) x;
        return compareTo(r) == 0;
    }

    public long compareTo(Object x) {

        return 0;
    }

    public String toString() {
        // to be completed
        if (denominator == 1 || numerator == 0){
            return numerator + "";
        }
        else{
            return numerator + "/" + denominator;
        }
    }

    public static void main(String[] args) {
        System.out.println("This is Rational class.");
    }
}