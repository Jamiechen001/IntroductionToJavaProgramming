package me.jamiechen.abstract_class_and_interface;

/**
 * Created by JamieChen on 2017/3/21 0021.
 */
public class Rational extends Number implements Comparable<Rational>{
    private long numerator = 0;
    private long denominator = 1;

    public Rational() {
        this(0, 1);
    }

    public Rational(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        this.numerator = ((denominator > 0) ? 1 : -1) * numerator / gcd;
        this.denominator = Math.abs(denominator) / gcd;
    }

    private static long gcd(long n, long d) {
        long n1 = Math.abs(n);
        long n2 = Math.abs(d);
        int gcd = 1;

        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }

        return gcd;
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public Rational add(Rational rational) {
        long n = numerator * rational.getDenominator() + denominator * rational.getNumerator();
        long d = denominator * rational.getDenominator();
        return new Rational(n, d);
    }

    public Rational subtract(Rational rational) {
        long n = numerator * rational.getDenominator() - denominator * rational.getNumerator();
        long d = denominator * rational.getDenominator();
        return new Rational(n, d);
    }

    public Rational multiply(Rational rational) {
        long n = numerator * rational.getNumerator();
        long d = denominator * rational.getDenominator();
        return new Rational(n, d);
    }

    public Rational divide(Rational rational) {
        long n = numerator * rational.getDenominator();
        long d = denominator * rational.getNumerator();
        return new Rational(n, d);
    }

    @Override
    public String toString() {
        if (denominator == 1)
            return numerator + " ";
        else
            return numerator + "/" + denominator;
    }

    @Override
    public boolean equals(Object obj) {
        if ((this.subtract((Rational)obj)).getNumerator() == 0)
            return true;
        else
            return false;
    }

    @Override
    public int intValue() {
        return (int)doubleValue();
    }

    @Override
    public float floatValue() {
        return (float)doubleValue();
    }

    @Override
    public double doubleValue() {
        return numerator * 1.0 / denominator;
    }

    @Override
    public long longValue() {
        return (long)doubleValue();
    }

    @Override
    public int compareTo(Rational o) {
        if (this.subtract(o).getNumerator() > 0)
            return 1;
        else if (this.subtract(o).getNumerator() < 0)
            return -1;
        else
            return 0;
    }
}
