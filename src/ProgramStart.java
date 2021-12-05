public class ProgramStart extends MenuOptions{
    public void printMenu(){
        System.out.println("Hello!\n" +
                "Please select an option:\n"+
                "0. Exit \n"+
                "1. Sum \n"+
                "2. Substraction \n"+
                "3. Multiplication \n"+
                "4. Division \n"+
                "5. Modulo \n"+
                "6. Array \n"+
                "7. Farenheit Degree \n"+
                "8. Inches \n"+
                "9. Speed in Kilometers/Hour \n"+
                "10.Christmas mood level \n"+
                "11.Add your picture here \n"
        );
    }

    public boolean runMenuOption(){
    printMenu();
        int option = read.getInt();
        switch (option){
            case 0:
                System.out.println("Good bye!");
                return false;
            case 1:
                doSum();
                return true;
            case 2:
                doSubstract();
                return true;
            case 3:
                doMultiplication();
                return true;
            case 4:
                doDivision();
                return true;
            case 5:
                doModulo();
                return true;
            case 6:
                doArray();
                return true;
            case 7:
                doFahrenheitDegree();
                return true;
            case 8:
                doInches();
                return true;
            case 9:
                doKmHours();
                return true;
            case 10:
                printStars();
                System.out.println("Merry Christmas!");
                return true;
            case 11:
                humanHead();
                System.out.println("Nice selfie!");
                return true;
            default:
                System.out.println("Incorrect Option. Try again.");
                return true;

        }

    }
    public void runProgram(){
        boolean repeatProgram;
        do{
            repeatProgram = runMenuOption();
        }while (repeatProgram);
    }





}
