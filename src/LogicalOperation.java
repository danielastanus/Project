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
//    Creati o metoda care primeste un numar ca si parametru si sa afiseze ce numar a primit.
//    Folosind constructia Switch-Case, verificati ce numar s-a primit si afisati textul "The number is:  x !"
//    unde x trebuie sa reprezinte numarul apasat. Pentru exemplul de fata sa nu se foloseasca concatenarea
//    stringului "The number is:" cu numarul de la parametru, ci sa se scrie
//    intreg textul cu tot cu numar pentru fiecare caz din Switch-Case.
//    Apelati metoda in main() pentru a verifica daca functioneaza

//    public int switchOp(int verifySwitch){
//        int verify =45;
//        switch (verifySwitch){
//            case 10:System.out.println("10");break;
//            case 25:System.out.println("25");break;
//            case 45:System.out.println("39");break;
//            case 50:System.out.println("50");break;
//            default:System.out.println("Not found here");
//    }


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
