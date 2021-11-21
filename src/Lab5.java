public class Lab5 {

    // Exercitiul 2

    public static void main(String[] args) {
        int[] myArr = new int[100];
        for (int i = 0; i < 100; i++) {
            myArr[i] = i + 1;

        }
        for (int i = 0; i < myArr.length; i++) {

            System.out.println(myArr[i]);
        }


        LogicalOperation operation = new LogicalOperation();

        int[] array3 = operation.populateArray(100);

        System.out.println(operation.getAverageValueFromArray(array3));

        System.out.println(operation.isValueInArray(array3, 51));

//        System.out.print(operation.printArrayGrid(operation.populateArray(99)));


//Exercitiul 6
        int[] array4 = operation.populateArray(95);
        System.out.println(operation.isInArray(array4, 88));

//Exercitiul 5
        System.out.println(operation.isValueInString(operation.populateStringArray(), "f"));


        System.out.println(operation.skipValue(operation.givenArray, 7));


// Exercitiul 3

        int[] evenArray = operation.populateArray(100);
        for (int i = 0; i < evenArray.length; i++) {
        }
        for (int i1 = 1; i1 <= 100; i1++) {
            if (i1 % 2 == 0) {
                System.out.println(i1);
            }
        }

//Exercitiul 7

        int[][] a = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }


}