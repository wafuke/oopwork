package oop;

mport java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySortReverse {
    public static void main(String[] args) {
        // Initial array of pallet IDs
        String[] pallets = {"B14", "A11", "B12", "A13"};

        // Sort the array in ascending order
        System.out.println("Sorted ....");
        Arrays.sort(pallets);
        for (String pallet : pallets) {
            System.out.println("-- " + pallet);
        }

        // Reverse the sorted array
        System.out.println("\nReversed ....");
        List<String> palletList = Arrays.asList(pallets);
        Collections.reverse(palletList); // Reverses the order
        for (String pallet : palletList) {
            System.out.println("-- " + pallet);
        }
    }
}