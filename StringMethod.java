
public class StringMethod {

    public static void main(String[] args) {
        String name = "Anand Raj Bind";
        System.out.printf("Your  string is : %s \n", name);
        System.out.format("Your  string is : %s \n", name);

        int value = name.length();
        System.out.println("Length of the string is : " + value);

        String lstring = name.toLowerCase();
        System.out.println("Lower case of the string is : " + lstring);

        String ustring = name.toUpperCase();
        System.out.println("Lower case of the string is : " + ustring);

        String nonTrimeString = "    Anand      ";
        String trimeString = nonTrimeString.trim();
        System.out.println(trimeString);
        System.out.println(" Trimed string is " + nonTrimeString.trim());

        // String subString = name.substring(6);
        System.out.println("SubString is : " + name.substring(1));
        System.out.println("SubString is : " + name.substring(6, 9));

System.out.println("Replace : " + name.replace(
    'A', 'B'));


    System.out.println("Replace : " + name.replace(
        "anand", "Anurag"));


        System.out.println(name.startsWith("Anand"));// shi hoga to true return karega  nhi to false 
        System.out.println(name.endsWith("Bind"));


        System.out.println(name.charAt(6));// 6th index pe kaun sa character hai

        System.out.println(name.indexOf("an"));// a ka index kya hai


    }
}
