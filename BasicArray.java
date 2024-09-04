
public class BasicArray {

    public static void main(String args[]) {

        // Array declaration and initlization method 1
        int arr[] = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Array declaration and initlization method 2
        int array1[] = new int[5];  // Array declaration
        array1[0] = 10;  
                                        // Array initlization
        array1[1] = 20;
        array1[2] = 30;
        array1[3] = 40;
        array1[4] = 50;

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        // Accessing single array element
        System.out.println(array1[0]);


        // Array declaration and initlization method 3

        int []array2={1,2,3,4,5};
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}
