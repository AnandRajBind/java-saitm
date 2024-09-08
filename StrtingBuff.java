import java.util.*;
class StringBuff{
    public static void main(String[] args) {
        StringBuffer st =new StringBuffer("Anand Raj");
   st.insert(9, "Bind");
   System.out.printf(" %s \n", st);

   st.reverse();
   System.out.format("%s \n",st);

   st.capacity();
   System.out.println(st.capacity());
    }
}