public class Lab2 {
  public static float x=7;
  public static float y=3;
  public static float z=24;
  public static double distanceKm=20;
  public static double timeHr=30;
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println(calc.sum(x,y));
        System.out.println(calc.substraction(x, y));
        System.out.println(calc.multiplication(x, y));
        System.out.println(calc.division(x, y));
        System.out.println(calc.modulus(x, y));
        System.out.println(calc.array(x,y,z));

        System.out.println(calc.sum(10,32));
        System.out.println(calc.substraction(20,7));
        System.out.println(calc.multiplication(8,9));
        System.out.println(calc.division(7,8));
        System.out.println(calc.inches(7));
        System.out.println(calc.degreeFarenheit(70));
        System.out.println(calc.speedKmHr(distanceKm,timeHr));
        System.out.println(calc.speedKmHr(distanceKm*1000, timeHr*360));
        System.out.println(calc.speedKmHr(distanceKm*1609, timeHr));
        Print stars = new Print();
        stars.printStars();

        Print logo = new Print();
        logo.javaLogo();

        Print head = new Print();
        head.humanHead();

        System.out.println(calc.printSpeedInMetric(20000, 4, 9, 45));





  }
}