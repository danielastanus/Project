public class Lab3 {
    public static void main(String[] args) {


        String text = "FastTrackaaa";

        LogicalOperation op = new LogicalOperation();

        System.out.println(op.verifyText(text));

        int number = 7;

        System.out.println(op.getNumber(number));

        int value = 9;
        System.out.println(op.snow(value));

        int a = 20;
        int b = 45;
        System.out.println(op.numere(a,b));

        String texxtt = "FastTracky";
        int numar = 4 ;
        System.out.println(op.textNumber(texxtt, numar));

        int numarr = -12;
        System.out.println(op.theGreatest(numarr));


        int biggest = op.checkBiggerNumber(7,90);
        System.out.println("The bigger number is:"+biggest);

        String textCompare = op.parametru("FastTrackIT");
        System.out.println(textCompare);

//        int switchMethod = op.switchOp(45);
//        System.out.println(switchMethod);

        boolean evenNumber = op.isNumberEven(8);
        System.out.println(evenNumber);

        int age = 16;
        System.out.println(op.isEligibleToVote(age));

        float threeNumbers = op.compareThreeNumbers(54,2100, 100);
        System.out.println(threeNumbers);

    }
}
