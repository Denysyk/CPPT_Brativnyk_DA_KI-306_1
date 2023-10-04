package org.example;

class CalcException extends ArithmeticException {
    public CalcException() {}
    public CalcException(String cause) {
        super(cause);
    }
}

/**
 * Class <code>Equations</code> implements method for ((sin(x) / cos(x)) expression
 * calculation
 * @author Ваше_Прізвище
 * @version 1.0
 */
class Equations {
    /**
     * Method calculates the ((sin(x) / cos(x))) expression
     * @throws CalcException if an exception occurs during calculation
     */
    public double calculate(int x) throws CalcException {
        double y, rad;
        rad = x * Math.PI / 180.0;

        try {
            y = Math.sin(rad) / Math.cos(rad);
            if (Double.isNaN(y) || Double.isInfinite(y) || x == 90 || x == -90) {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException ex) {
            if (rad == Math.PI / 2.0 || rad == -Math.PI / 2.0) {
                throw new CalcException("Exception reason: Illegal value of X for tangent calculation");
            } else if (x == 0) {
                throw new CalcException("Exception reason: X = 0");
            } else {
                throw new CalcException("Unknown reason of the exception during expression calculation");
            }
        }

        return y;
    }
}