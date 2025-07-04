package sorting.variationsOfInsertionsort;


public class Main {
    public static void main (String[] args) {
        RecursiveInsertionSort<Integer> r = new RecursiveInsertionSort<Integer>();
        Integer[] array = {9, 3, 4, 11, 0, 2};
        r.sort(array, 0, 5);
        for (int i = 0; i< array.length; i ++){
            System.out.println(array[i]);
        }
    }

}
