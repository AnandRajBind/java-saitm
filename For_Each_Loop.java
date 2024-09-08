
public class For_Each_Loop {

    public static void main(String args[]) {
        // int arr[] = {1, 2, 3, 4, 5};
        float[] arr = {12.5f, 23.2f, 39.5f, 46.9f, 50.5f};
        //problem1.  write a program sum of float array elemen.

        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            sum = sum + arr[i];
        }
        System.out.println("Sum of array element is: " + sum);

        //problem2 write a program check tha array element is present or not in the array.


        int arr2[] = {1, 2, 3, 4, 5};
        int num1=3;
        for (int i = 0; i < arr.length; i++) {
 if(num1==3){
        System.out.println("Element is present in the array");
        break;
 }
 else{
        System.out.println("Element is not present in the array");
        break;
 }
        }
        // String array
        String[] student = {"Rahul", "Rohit", "Raj", "Ravi", "Rahul"};
        System.out.println(student[2]);
        System.out.println(arr.length);
        // print the array element in reverse order
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        System.out.println("Using for each loop");
        // for each loop
        for (float i : arr) {
            System.out.println(i);
        }
    }
}
