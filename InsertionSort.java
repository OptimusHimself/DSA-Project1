public class InsertionSort {

    static int[] testA = Selectionsort.testOne;
    static int[][] testB = Selectionsort.testTwo;

    public static void insertionSort2(int[][] testArr) {
        for (int i = 1; i < testArr.length; i++) {

            int j = i - 1;

//            while (testArr[j + 1][0] < testArr[j][0]) {
//                // Error 2 Only swipe the pivot number,,,😂
//                int cha = testArr[j + 1][0];
//                testArr[j + 1][0] = testArr[j][0];
//                testArr[j][0] = cha;
//
//                if(j > 0) j--;
//            }


            while (testArr[j + 1][0] < testArr[j][0]) {
                int cha = testArr[j + 1][0];
                int chaaa = testArr[j + 1][1];
                testArr[j + 1][0] = testArr[j][0];
                testArr[j + 1][1] = testArr[j][1];
                testArr[j][0] = cha;
                testArr[j][1] = chaaa;

                if (j > 0) j--;
            }
        }}


        public static void insertionSort1 ( int[] testArr){

            for (int i = 1; i < testArr.length; i++) {

                int j = i - 1;
                // Error 1* didn't pay attention to j = 0 condition
//            while (testArr[j + 1] < testArr[j]&&j >= 0) {
//                int cha = testArr[j + 1];
//                testArr[j + 1] = testArr[j];
//                testArr[j] = cha;
//                j--;
//            }

                while (testArr[j + 1] < testArr[j]) {
                    int cha = testArr[j + 1];
                    testArr[j + 1] = testArr[j];
                    testArr[j] = cha;
                    if (j > 0) j--;
                }
            }

        }

        public static void printSorted1 ( int[] testArr){
            for (int i = 0; i < testArr.length; i++) {
                System.out.print(testArr[i] + ", ");
            }
        }

        public static void printSorted2 ( int[][] testArr){
            for (int i = 0; i < testArr.length; i++) {
                System.out.print("{" + testArr[i][0] + ", " + testArr[i][1] + "} ");
            }
        }

        public static void main (String[]args){
            insertionSort1(testA);
            printSorted1(testA);

            // My debug method
        /*System.out.println();
        // because I got psychiatric disorder
        for (int i = 0; i < testB.length; i++) {
            System.out.print("{" + testB[i][0] + ", " + testB[i][1] + "} ");
        }*/

            // The correct output
            // {3, 6} {31, 56} {49, 58} {59, 837} {61, 8} {64, 8} {71, 2} {98, 1}

            System.out.println();

            insertionSort2(testB);
            printSorted2(testB);
        }
    }

