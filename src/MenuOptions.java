public class MenuOptions {
    ReadFromKeyboard read = new ReadFromKeyboard();
    Calculator calculator = new Calculator();
    Print print = new Print();

    public void doSum(){
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("The sum result is: " +
                calculator.sum(first, second));

    }

    public void doSubstract(){
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("The substraction result is: " +
                calculator.substraction(first, second));

    }

    public void doMultiplication(){
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("The multiplication result is: " +
                calculator.multiplication(first, second));

    }

    public void doDivision(){
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("The division result is: " +
                calculator.division(first, second));
    }

    public void doModulo(){
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("The modulo result is: " +
                calculator.modulus(first, second));
    }

    public void doArray(){
        int first = read.getInt();
        int second = read.getInt();
        int third = read.getInt();
        System.out.println("The array result is: " +
                calculator.array(first, second,third));
    }

    public void doFahrenheitDegree(){
        int first = read.getInt();
        System.out.println("The temperature in Fahrenheit Degree is: " +
                calculator.degreeFarenheit(first));
    }

    public void doInches(){
        int first = read.getInt();
        System.out.println("The distance in Inches is: " +
                calculator.inches(first));
    }

    public void doKmHours(){
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("The speed in Kilometers per Hour is: " +
                calculator.speedKmHr(first, second));
    }

    public void printStars(){
        System.out.println("" +
                "    *    \n" +
                "   ***   \n" +
                "  *****  \n" +
                " ******* \n");

    }

    public void humanHead(){
        System.out.println("" +
                "   +\"\"\"\"\"+     \n" +
                " [ | ◯ ◯ | ]   \n" +
                "   |  ^  |     \n" +
                "   | '-' |     \n" +
                "   |_____|     \n") ;
    }
}
