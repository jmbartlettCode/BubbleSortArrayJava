/*
 * Josh Bartlett
 * Purpose: Sort an array using bubble-sort
 * June 1, 2019
 * Bellevue University
 * bubbleSort.java
 */

public class bubbleSort {
    public static void main(String[] args){
        
        // Declare and create an int array with a length of 10
        int[] intArray = new int[10];
        
        // Call the fill method
        fill(intArray);
        
        // Call the print method to print the array before it is sorted
        print(intArray);
        
        // Calls the sort method
        sort(intArray);
        
        // Prints a blank line between the unsorted and sorted array
        System.out.println();
        
        // Calls the print method to print the sorted array
        print(intArray);
    }
    
    // Method to fill the array with random ints
    public static int[] fill(int[] array){
       for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 100);
        }
       return array;
    }
    
    // Method to bubble-sort the array
    public static int[] sort(int[] array){
        boolean changed;
        do{
            changed = false;
            for(int i = 0; i < array.length - 1; i++){
                if(array[i] > array[i + 1]){
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    changed = true;
                }
            }
        } while(changed);
        return array;
    }
    
    // Method to print the array
    public static void print(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
