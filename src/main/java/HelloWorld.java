import ExampleProblems.*;
import DependencyInjection.Car;
import DependencyInjection.Plane;
import DependencyInjection.Truck;
import DependencyInjection.Vehicle;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HelloWorld {

    public static void main(String[] args) {
        //Example print
        System.out.println("Hello World");

        // Example using String Utils
        System.out.println(StringUtils.difference("abcde", "abxyz"));


        // Anagram Example
        String[] strings = { "cat", "dog", "tac", "god", "act", "random", "values" };
        Anagram.findAnagrams(strings);

        System.out.println("");

        // Linked List example
        LinkedList list = new LinkedList();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        System.out.println(list);

        int n = 2;
        LinkedListRemoveEnd.removeNfromEnd(list, n);

        System.out.println(list);

        // Fibonacci example
        System.out.println("Fibonacci " + Fib.fibonicci(5));
        System.out.println("Fibonacci Recursion " + Fib.fibonicciRecursion(5));

        //Quick sort example
        int[] array = {1,5,3,8,6,3,7,8,3};
        QuickSort.quickSort(array, 0, array.length - 1);

        for (int item : array) {
            System.out.print(item + "");
        }
        System.out.println();
        System.out.println("Array to string: " + array.toString());


        // Binary Search Example
        int value = 5;

        //Arrays.sort(); #just saying. 

        if (BinarySearch.search(array, value, 0, array.length -1)) {
            System.out.println(value + " is in the list");
        } else {
            System.out.println(value + " is not in the list");
        }

        int[][] matrix = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        RotateMatrix rotateMatrix = new RotateMatrix();
        int[][] rotated = rotateMatrix.rotateMatrix(matrix);

        System.out.println(rotated);
    }

    private void dependencyInjection() {
        // Simple Dependency Injection Example
        Car car = new Car();
        Truck truck = new Truck();
        Plane plane = new Plane();

        Vehicle car1 = new Vehicle(car);
        Vehicle truck1 = new Vehicle(truck);
        Vehicle plane1 = new Vehicle(plane);

        car1.setDestination("Chicago");
        truck1.setDestination("Dallas");
        plane1.setDestination("LAX");

        List<Vehicle> vehicleList = new ArrayList<>(); ;
        vehicleList.add(car1);
        vehicleList.add(truck1);
        vehicleList.add(plane1);

        //Print using streams
        vehicleList.forEach(s -> System.out.println(s.getInfo() + " " + s.getDestination()));

        //Print building a big string
        String status = "";
        status += String.format("Car location = %s; Truck location = %s; Plane Location = %s;",
                car1.getDestination(), truck1.getDestination(), plane1.getDestination());
        System.out.println(status);
    }

}
