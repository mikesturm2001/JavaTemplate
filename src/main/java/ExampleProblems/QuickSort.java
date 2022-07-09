package ExampleProblems;

public class QuickSort {

    public static void quickSort(int[] array, int low, int high) {

        if (array == null || array.length == 0) {
            return;
        }

        if (low > high) {
            return;
        }

        // We need to find the pivot
        int pivotPosition = (low + high) / 2;
        int pivotValue = array[pivotPosition];

        // We need to start at the left and start at the right and move in.
        int leftPosition = low;
        int rightPosition = high;

        while(leftPosition <= rightPosition) {
            //Advance up the array looking for values greater than the pivot on the left side
            while (array[leftPosition] < pivotValue) {
                leftPosition++;
            }

            //Advance down the array looking for values less that the pivot of the right side
            while (array[rightPosition] > pivotValue) {
                rightPosition--;
            }

            //Swap the values
            if (leftPosition <= rightPosition) {
                int temp = array[leftPosition];
                array[leftPosition] = array[rightPosition];
                array[rightPosition] = temp;
                leftPosition++;
                rightPosition--;
            }
        }

        //Do same operation as above recursively to sort two sub arrays
        if (low < rightPosition) {
            // sort the bottom half
            quickSort(array, low, rightPosition);
        }
        if (high >= leftPosition) {
            // sort the top half
            quickSort(array, leftPosition, high);
        }
    }
}
