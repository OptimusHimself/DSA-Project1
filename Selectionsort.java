public class Selectionsort{

    public static int [] testOne ={1, 62, 81, 0, 23, 55, 76, 87, 20, 54, 65, 76, 1};
    public static int [][] testTwo = {{71, 2}, {64, 8},{31, 56},{98, 1},{3, 6},{59, 837}, {49, 58},{61, 8}};

    public static void selectionSort(int [] arr) {

        int min, i, j, len = arr.length;

        for (i = 0; i < len; i++) {

            min = i;

            for (j = i + 1; j < len; j++) {

                if (arr[min] > arr[j]) {
                    int agent = arr[min];
                    arr[min] = arr[j];
                    arr[j] = agent;
                }
                //Error1* it is not effective to swap two item
//                if (arr[min] > arr[j]) {
//                    int agent = min;
//                    min = j;
//                    j = agent;
//                }
            }
        }


    }

    public static void selectionSortPlus(int [][] arr) {

        int min, i, j, len = arr.length;

        for (i = 0; i < len; i++) {

            min = i;

            for (j = i + 1; j < len; j++) {

                if (arr[min][0] > arr[j][0]) {
                    int agent = arr[min][0];
                    int agent2 = arr[min][1];
                    arr[min][0] = arr[j][0];
                    arr[min][1] = arr[j][1];
                    arr[j][0] = agent;
                    arr[j][1] = agent2;


                }
            }
        }


    }

    public static void printSorted(int [] arr) {
        int i,len= arr.length;
        for (i = 0; i < len; i++) {

            System.out.print(arr[i] + ", ");
        }
    }


    public static void printSortedPlus (int [][] arr) {
        int i,len= arr.length;
        for (i = 0; i < len; i++) {
            //Error2** this just output the address
            //System.out.print(arr[i] + ", ");


            System.out.print("{" + arr[i][0] + ", " + arr[i][1] + "} ");
        }
    }

    public static void main(String[] args) {

        selectionSort(testOne);

        printSorted(testOne);

        System.out.println();

        selectionSortPlus(testTwo);

        printSortedPlus(testTwo);


    }
}