package ExampleProblems;

public class BinarySearch {

    public static boolean search(int[] array, int value, int start, int end) {

        if(start > end) {
            return false;
        }

        if (value > array[end] || value < array[start]) {
            return false;
        }

        if (start == end) {
            return array[start] == value;
        }

        int midpoint = ((end - start) / 2) + start;

        if (value < array[midpoint]) {
            return search(array, value, start, midpoint);
        } else if (value > array[midpoint]) {
            return search(array, value, midpoint, end);
        } else return array[midpoint] == value;
    }
}
