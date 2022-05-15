//Author: Ivana Tosheva Aleksoska <ivana.toshevaaleksoska@edu.fh-joanneum.at>

package at.fhj.msd;

public class Main {public static void main(String[] args) {

  //  double num1 = Double.parseDouble(args[0]);
  //  double num2 = Double.parseDouble(args[1]);
    double num1 = 20;
    double num2 = 10;
    System.out.println("Calculation #1: " + num1 + " + " +num2 + " = " + Calculator.add(num1,num2));
    System.out.println("Calculation #2: " + num1 + " - " +num2 + " = " + Calculator.minus(num1,num2));
    System.out.println("Calculation #4: " + num1 + " * " +num2 + " = " + Calculator.multiply(num1,num2));
    System.out.println("Calculation #3: " + num1 + " / " +num2 + " = " + Calculator.divide(num1,num2));

}
}
