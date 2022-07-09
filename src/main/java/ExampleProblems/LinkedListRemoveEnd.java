package ExampleProblems;

import java.util.LinkedList;

public class LinkedListRemoveEnd {

    public static LinkedList removeNfromEnd(LinkedList list, int n) {
            list.remove(list.size() - n);
            return list;
        }
}
