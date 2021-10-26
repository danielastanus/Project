public class Lab2 {
  public static int x=7;
  public static int y=3;



    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println(calc.sum(x,y));
        System.out.println(calc.substraction(x, y));
        System.out.println(calc.multiplication(x, y));
        System.out.println(calc.division(x, y));
        System.out.println(calc.modulus(x, y));

        Print stars = new Print();
        stars.printStars();

    }
}