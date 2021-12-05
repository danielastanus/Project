import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadFromKeyboard {

    public int getInt(){
        int count = 0;

        do{
            Scanner scan = new Scanner(System.in);
            try {
                System.out.println("Please insert a number: ");
                return scan.nextInt();
            } catch (InputMismatchException error){
                System.out.println("Incorrect value. Please try again.");
                count++;
            }
            if (count == 5){
                sleep(5);
                count = 0;
            }
        }while(true);
    }


    private void sleep(int seconds) {
        System.out.println("Sleeping for: ");
        do {
            System.out.println(seconds);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
            seconds--;
        } while (seconds > 0);
    }

    public float getFloat() {
        float count = 0;

        do {
            Scanner scan = new Scanner(System.in);
            try {
                System.out.println("Please insert a string: ");
                return scan.nextFloat();
            } catch (InputMismatchException error) {
                System.out.println("Incorrect value. Please try again.");
                count++;
            }
            if (count == 5) {
                sleep(5);
                count = 0;
            }
        } while (true);
    }

    public String getString() {
        int count = 0;

        do {
            Scanner scan = new Scanner(System.in);
            try {
                System.out.println("Please insert a String: ");
                return scan.nextLine();
            } catch (InputMismatchException error) {
                System.out.println("Incorrect value. Please try again.");
                count++;
            }
            if (count == 5) {
                sleep(5);
                count = 0;
            }
        } while (true);
    }

    public double getDouble() {
        int count = 0;

        do {
            Scanner scan = new Scanner(System.in);
            try {
                System.out.println("Please insert a double: ");
                return scan.nextDouble();
            } catch (InputMismatchException error) {
                System.out.println("Incorrect value. Please try again.");
                count++;
            }
            if (count == 5) {
                sleep(5);
                count = 0;
            }
        } while (true);
    }

    public int[] getArray() {
        int count = 0;
        int n;

        do {
            Scanner scan = new Scanner(System.in);
            n = scan.nextInt();

            try {
                System.out.println("Please insert an array: ");
                int[] myArr = new int[4];
                for (int i = 0; i<n; i++){
                    myArr[i] = scan.nextInt();
                }
            } catch (InputMismatchException error) {
                System.out.println("Incorrect value. Please try again.");

            }
            if (count == 5) {
                sleep(5);
                count = 0;
            }
        } while (true);
    }




}
