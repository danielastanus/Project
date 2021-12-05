import java.util.Scanner;

public class Login {
    public boolean isLoggedIn(){
        Scanner scan = new Scanner(System.in);

        String Username = "Daniela";
        String Password = "parola10";

        System.out.println("Username: ");
        String givenUserName = scan.next();
        System.out.println("Password: ");
        String givenPassword = scan.next();

        if (Username.equals(givenUserName) && Password.equals(givenPassword)){
            System.out.println("You are succesfully logged in.");
            return true;
        }else {
            System.out.println("Invalid logged in username or password. Please try again. ");
            return false;
        }
    }

    public boolean loginSuccesful() {
        boolean repeat;
        int count = 0;
        do {
            repeat = isLoggedIn();
            count++;
        } while (!repeat && count < 3);
        return repeat;
    }


}
