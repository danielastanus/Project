import javax.swing.*;

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
        } else return "Bau!";


    }

    public int checkBiggerNumber(int x, int y) {
        if (x > y) {
            return x;
        } else
            return y;
    }

    public String parametru(String verify) {
        if (verify.equals("FastTrackIT")) {
            return "Learning text comparison";
        } else
            return "Got to try some more";
    }

    //am repetat aceste doua exercitii pentru a exersa
    public void main(String[] args) {
    }

    public int switchExemple(int exemple) {
        int theNumber = 6;
        switch (theNumber) {
            case 2:
                System.out.println("The number is: 2!");
                break;
            case 4:
                System.out.println("The number is: 4!");
                break;
            case 6:
                System.out.println("The number is: 6!");
                break;
            case 8:
                System.out.println("The number is: 8!");
                break;
            case 10:
                System.out.println("The number is: 10!");
            default:
                System.out.println("Number not found");
        }
        return -1;
    }


    public boolean isNumberEven(int valuee) {
        if (valuee % 2 == 0) {
            return true;
        } else
            return false;

    }

    public boolean isEligibleToVote(int age) {
        if (age >= 18) {
            return true;
        } else
            return false;
    }

    public float compareThreeNumbers(float d, float e, float f) {
        if (d >= e && d >= f) {
            return d;
        } else if (e >= d && e >= f) {
            return e;
        } else
            return f;

    }

    public void countBackward(int small, int big) {
        for (int i = big; i >= small; i--) {
            System.out.println(i);
        }
    }

    public void givenNumber(int z) {
        for (int i = z; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public void numberNegative(int b) {
        for (int g = b; g >= -100; g--) {
            System.out.println(g);
        }
    }

    public float getSumAndAverage(int first, int last) {
        float sum = 0;
        for (int i = first; i <= 100; i++) {
            sum = i + sum;
        }
        return sum / (last - first + 1);

    }

    public void countingNumbers(int firstnumber, int secondnumber) {
        for (int i = firstnumber; i <= secondnumber; i++) {
            System.out.println(i);
        }
    }

    public void evenNumbers(int l) {
        for (int i = 1; i <= l; i++) {
            if (i % 2 == 0) {

                System.out.println(i);
            }


        }
    }

    public void notEvenNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }


    public void numberingFrom(int first, int last) {
        for (int x = first; x <= last; x++){
            System.out.println(x);
        }
                for (int y = last; y <= first; y++) {
                        System.out.println(y);
                }

    }

    public void stars (int star){
        for (int i = 1; i <= star; i++){
            for (int i1 = 1; i1 <= i; i1++){
                System.out.print('*');
            }
            System.out.println();
        }
    }


//    public void number (int randomNumber){
//        int i =randomNumber;
//        while ( i <= 100){
//            System.out.println(i);
//            i++;
//        }
//    }
//
//    public void reverseNumber (int reverse){
//        int i = reverse;
//        while (i >=-100){
//            System.out.println(i);
//            i--;
//        }
//    }
//
//    public void chooseNumbers (int n, int m){
//        int i = n;
//        while (i <= m){
//            System.out.println(i);
//            i++;
//        }
//    }
////    4. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
////    Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute o
////    numaratoare crescatoare de la cel mai mic la cel mai mare.(ex: daca int x e
////    primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).
//    public void conditionNumbers (int unu, int doi){
//        int i = unu;
//        int j = doi;
//        while ( i<=doi || j<=unu){
//            if (unu<=doi);
//            System.out.println(i);
//            i++;
//        }
//            if (doi<=unu);
//                System.out.println(j);
//                j++;
//            }
//
//
//
////    5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.
//    public  void  evenNumbersWhile (){
//        int i = 0;
//        int number = 0;
//        while (i <= 50)
//        {
//            System.out.println(number);
//            i+=1;
//            number+=2;
//            }
//        }
//
////    6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.
//
//    public void notEvenWhile (int x){
//        int i =1;
//        while ( i<=x){
//            if (i % 2 !=0){
//                System.out.println(i);
//                i++;
//            }
//        }
//    }















}

