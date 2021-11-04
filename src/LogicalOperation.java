public class LogicalOperation {

    public String verifyText(String text) {
        if (text.equals("FastTrack")) {
            return "Learning text comparision";
        } else
            return "Got to try some more";
    }


    public int getNumber(int number) {
        if (number >= 2 && number < 8) {
            return number;
        } else
            return 0;

    }

    public String snow(int value) {
        if (value > 8 || value == 6) {
            return "The amount of snow this winter was(cm):" + value;
        } else
            return "The forecast snow is(cm):20";
    }


    public int numere(int x, int y) {
        if (x > y) {
            return x;
        } else
            return y;
    }

    public String textNumber(String texxtt, int numar) {
        if (texxtt.equals("FastTrack") && numar <= 3) {
            return texxtt + numar;
        } else if (!texxtt.equals("FastTrack") && numar >= 4) {
            return numar + texxtt;
        } else
            return "Not even closer";

    }


    public String theGreatest(int numarr) {
        if (numarr > 3 && numarr != 4) {
            return "The number is greater than 3 and not equal to 4.";
        } else if (numarr == 4) {
            return "The number is equal to 4.";
        } else if (numarr < 3) {
            return "The number is lower than 3.";
        }else return "Bau!";


    }

    public int checkBiggerNumber(int x, int y){
        if (x>y){
            return x;
        }else
            return y;
    }

    public String parametru (String verify){
        if(verify.equals("FastTrackIT")){
            return "Learning text comparison";
        }else
            return "Got to try some more";
    }

public  void main(String[] args) {
}
public int switchExemple( int exemple) {
        int theNumber = 8;
        switch (theNumber){
            case 2: System.out.println("The number is: 2!");break;
            case 4: System.out.println("The number is: 4!");break;
            case 6: System.out.println("The number is: 6!");break;
            case 8: System.out.println("The number is: 8!");break;
            case 10: System.out.println("The number is: 10!");
            default: System.out.println("Number not found");
        }
       return -1;
}









    public boolean isNumberEven (int valuee) {
        if (valuee % 2 == 0) {
            return true;
        }else
            return false;

    }

    public boolean isEligibleToVote (int age){
        if (age >= 18) {
            return true;
        }else
            return false;
    }

    public float compareThreeNumbers (float d, float e, float f){
        if (d >= e && d>=f) {
            return d;
        }else if (e >=d && e >=f){
            return e;
        }else
            return f;

    }





















}
