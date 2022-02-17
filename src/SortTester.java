import java.util.Arrays;

public class SortTester
{
  public static void main(String[] args)
  {
    /* --- SELECTION SORT --- */
    int[] arr1 = {100, 120, 89, 86, 99, 77, 54, 40, 19, 14, 13, 1241, 45, 12, 6, 3, 0, -4, -5, -20};
    Sort.selectionSort(arr1);
    System.out.println(Arrays.toString(arr1));
 
    /* --- INSERTION SORT --- */ 
    int[] arr2 = {100, 120, 89, 86, 99, 77, 54, 40, 19, 14, 13, 1241, 45, 12, 6, 3, 0, -4, -5, -20};
    Sort.insertionSort(arr2);
    System.out.println(Arrays.toString(arr2));
  }
}
