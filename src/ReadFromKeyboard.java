import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadFromKeyboard {

    public int getInt(){
        do{
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("Please insert a number: ");
                return scan.nextInt();
            } catch (InputMismatchException error){
                System.out.println("Incorrect value. Please try again.");
            }
        }while(true);
    }
}
