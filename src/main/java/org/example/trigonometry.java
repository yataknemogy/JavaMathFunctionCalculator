package org.example;

public class trigonometry {

  static class Sine {
    private static final int seriesTermCount = 10;

    static double approximatedValue(double x) {
      double result = 0.0;
      double term = x;
      double xSquared = x * x;
      long factorial = 1;
      int sign = 1;

      for (int i = 1; i <= seriesTermCount; i++) {
        result += sign * term / factorial;
        term *= xSquared;
        factorial *= (2 * i) * (2 * i + 1);
        sign *= -1;
      }

      return result;
    }

    static double preciseValue(double x) {
      return Math.sin(x);
    }
  }

  static class Cosine {
    private static final int seriesTermCount = 10;

    static double approximatedValue(double x) {
      double result = 1.0;
      double term = 1.0;
      double xSquared = x * x;
      long factorial = 1;
      int sign = -1;

      for (int i = 1; i <= seriesTermCount; i++) {
        factorial *= (2 * i - 1) * (2 * i);
        term *= xSquared;
        result += sign * term / factorial;
        sign *= -1;
      }

      return result;
    }

    static double preciseValue(double x) {
      return Math.cos(x);
    }
  }

  static class Secant {
    static double approximatedValue(double x) {
      double cosine = Cosine.approximatedValue(x);
      if (cosine == 0) {
        throw new ArithmeticException("Cosine is zero, secant is undefined.");
      }
      return 1 / cosine;
    }

    static double preciseValue(double x) {
      return 1 / Math.cos(x);
    }
  }

  static class Cosecant {
    static double approximatedValue(double x) {
      double sine = Sine.approximatedValue(x);
      if (sine == 0) {
        throw new ArithmeticException("Sine is zero, cosecant is undefined.");
      }
      return 1 / sine;
    }

    static double preciseValue(double x) {
      return 1 / Math.sin(x);
    }
  }
}
