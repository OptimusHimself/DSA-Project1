public class RankSort{
    static int []testA = Selectionsort.testOne;
    static int[][] testB = Selectionsort.testTwo;

    public static void rankSort1(int[] testArr, int[] rankIndex) {

        for (int i = 0; i < testArr.length; i++) {

            for (int j = 0; j < testArr.length; j++) {
                //Error1* Forget to consider this situation
                if (testArr[i] == testArr[j] && j > i) {
                    rankIndex[i]++;
                }
                //Error 2** wrong condition. Symmetric principle. Still has the same rankIndex for two same value.
                /*if (testArr[i] == testArr[j] && j != i) {
                    rankIndex[i]++;
                }*/

                if (testArr[i] > testArr[j]) {
                    rankIndex[i]++;
                }
            }
        }
    }

    public static void rankSort2(int[][] testArr, int[] rankIndex2) {
        for (int i = 0; i < testArr.length; i++) {

            for (int j = 0; j < testArr.length; j++) {

                if (testArr[i][0] == testArr[j][0] && j > i) {
                    rankIndex2[i]++;
                }

                if (testArr[i][0] > testArr[j][0]) {
                    rankIndex2[i]++;
                }
            }
        }

    }

    public static void printSorted(int[] testArr, int[] rankIndex) {
        int[] sorted = new int[testArr.length];
        for (int i = 0; i < testArr.length; i++) {
            sorted[rankIndex[i]] = testArr[i];

        }
        for (int i = 0; i < testArr.length; i++) {

            System.out.print(sorted[i] + ", ");
        }


    }

    public static void printSorted2(int[][] testArr, int[] rankIndex2) {
//      Error3*** length should be the number of item!
        int[][] sorted = new int[testArr.length][1];
//        int[][] sorted = new int[testArr.length][2];
        for (int i = 0; i < testArr.length; i++) {
            sorted[rankIndex2[i]][0] = testArr[i][0];
            sorted[rankIndex2[i]][1] = testArr[i][1];

        }
        for (int i = 0; i < testArr.length; i++) {

            System.out.print("{" + sorted[i][0] + ", " + sorted[i][1] + "} ");
        }

    }

    public static void main(String[] args) {

        int[] rankIndex = new int [testA.length];

        int[] rankIndex2 = new int[testB.length];
        for (int indexValue : rankIndex) {
            indexValue = 0;
            //System.out.print(indexValue + ", ");
        }

        rankSort1(Selectionsort.testOne, rankIndex);
        printSorted(Selectionsort.testOne, rankIndex);

        System.out.println();

        for (int indexValue : rankIndex2) {
            indexValue = 0;
            //System.out.print(indexValue + ", ");
        }

        rankSort2(testB,rankIndex2);
        printSorted2(testB,rankIndex2);





    }

}
