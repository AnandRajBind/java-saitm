
public class ReverseArray {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int length = arr.length;
        int num = Math.floorDiv(length, 2);
        int temp;

        System.out.println("Before reverse you array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < num; i++) {
// swap a[i] and a[length-i-1]
//a b  temp 
            temp = arr[i];
            arr[i] = arr[length - i - 1];
            arr[length - i - 1] = temp;
        }
        System.out.println();
        System.out.println("After reverse you array is: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

// find the smallest value  in the given array
        int arr1[] = {10, 2, 35, 4, 155, 6};

        int min = Integer.MAX_VALUE;
        for (int i : arr1) {//enhanced forEach  loop
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Minimum element is : " + min);

// find the largest value in the given array
        int arr2[] = {10, 2, 35, 4, 155, 6};
        int max = Integer.MIN_VALUE;
        for (int e = 0; e <= arr2.length; e++) {
            if (e > max) {
                max = e;
            }
        }
        System.out.println("Maximum element is : " + max);

// Check the array is sorted or not
        int arr3[] = {1, 2, 3, 4, 5, 6};
        boolean isSorted = true;
        for (int i = 0; i < length-1; i++) {

            if (arr3[i] > arr3[i + 1]) {
                isSorted = false;
                break;
            }
        }
          if(isSorted){
              System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
}
