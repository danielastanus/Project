import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab7 {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        ReadFromKeyboard read = new ReadFromKeyboard();
        int x = read.getInt();
        System.out.println("The read integer is: "+x);

        float y = read.getFloat();
        System.out.println("The read float is: "+y);

        String a = read.getString();
        System.out.println("The read string is: "+a);

        double d = read.getDouble();
        System.out.println("The read double is: "+d);

        int[] myArr = read.getArray();
        System.out.println("The read array is:"+myArr);



        try{
            System.out.println("Insert a number: ");
            int j = scan.nextInt();
            System.out.println("The readed number is: " + j);
        }catch (InputMismatchException error){
            System.out.println("Incorrect value!");
        }


        String z = scan.nextLine();
        System.out.println("The read string is: "+z);
        float h = scan.nextFloat();
        System.out.println("The read float is: "+h);
    }



}
