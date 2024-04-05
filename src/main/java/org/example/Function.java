package org.example;

public class Function {

  private static logarithm logarithm;
  private static trigonometry.Secant secant;
  private static trigonometry.Cosecant cosecant;

  public Function() {
    this.logarithm = new logarithm();
    this.secant = new trigonometry.Secant();
    this.cosecant = new trigonometry.Cosecant();
  }

  public static double calculate(double x){
    if(x < 0){
      return Math.pow(secant.approximatedValue(x) + cosecant.approximatedValue(x) + secant.approximatedValue(x), 2);
    }
    else if(x > 0){
      double ln_x = logarithm.preciseValue(x);
      double log2_x = logarithm.preciseValue(x, 2);
      double log5_x = logarithm.preciseValue(x, 5);
      double log10_x = logarithm.preciseValue(x, 10);
      double numerator = ((ln_x / log2_x) + log2_x) * log5_x;
      double denominator = log2_x;
      double subtraction = log10_x * (log10_x / log2_x);

      return (numerator / denominator) - subtraction;
    }
    else{
      return Math.pow(secant.approximatedValue(x) + cosecant.approximatedValue(x) + secant.approximatedValue(x), 2);
    }
  }
}
