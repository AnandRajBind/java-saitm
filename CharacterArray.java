
public class CharacterArray {

    public static void main(String[] args) {

        // Character Array declaration and initlization method 1
        char arr[] = {'a', 'b', 'c', 'd', 'e'};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // accessing single array element
        System.out.println(arr[0]);
        // Character Array declaration and initlization method 2

        char arr2[] = new char[5];  // Array declaration
        arr2[0] = 'A';  // Array initlization
        arr2[1] = 'B';
        arr2[2] = 'C';
        arr2[3] = 'D';
        arr2[4] = 'E';
        for(char i:arr2){
            System.out.print(i);
        }
    }
}
