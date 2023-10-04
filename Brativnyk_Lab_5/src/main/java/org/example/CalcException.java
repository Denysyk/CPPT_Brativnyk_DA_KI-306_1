package org.example;

/**
 * Клас CalcException є підкласом ArithmeticException та використовується для представлення винятків, пов'язаних з обчисленнями.
 */
class CalcException extends ArithmeticException {
    /**
     * Конструктор за замовчуванням.
     */
    public CalcException() {}

    /**
     * Конструктор, який приймає рядок, який вказує на причину винятку.
     *
     * @param cause рядок, який містить причину винятку
     */
    public CalcException(String cause) {
        super(cause);
    }
}

/**
 * Клас Equations містить метод calculate для обчислення значення рівняння.
 */
class Equations {
    /**
     * Обчислює значення рівняння для заданого кута.
     *
     * @param x кут, для якого обчислюється рівняння
     * @return результат обчислення рівняння
     * @throws CalcException виникає, якщо сталася помилка під час обчислення рівняння
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
