import java.util.ArrayList;
import java.util.List;

public class Lab6 {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        LogicalOperation operation = new LogicalOperation();
        List<Integer> mySecondList = operation.getPopulatedList(100);
        List<Integer> myThirdList = operation.getPopulatedList(15);


        myList.add(1);
        myList.add(2);
        myList.add(3);

        System.out.println(myList);
        myList.remove(Integer.valueOf(3));
        System.out.println(myList);
        myList.clear();
        System.out.println(myList);

        List<String> myStringList = new ArrayList<>();

        myStringList.add("apple");
        myStringList.add("banana");
        myStringList.add("strawberry");

        List<Integer> takeANumber = new ArrayList<>();
        takeANumber.add(5);
        takeANumber.add(9);
        takeANumber.add(47);
        takeANumber.add(32);
        takeANumber.add(60);


        operation.printListFromNumber(mySecondList, 50);

        operation.reverseNumber(mySecondList);

        operation.displayList(myThirdList);

        operation.addNumberToList(mySecondList, 200);
        myThirdList.add(200);

        operation.addStringToList (myStringList, 0, "pear");

        operation.addOnFirstPosition(myThirdList,40);

//        operation.smallestNumberInArray(takeANumber);







    }
}
