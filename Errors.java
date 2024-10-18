public class Errors {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
         /*No.1 *********************************** Syntax Error********************************:- when compiler finds sonthing wrong in the syntax of the
        code.it will give syntax error.
        Syntax error occurs compile time.
        */
        // int a=5;
        // d=4;// Syntax Error:- d is not declared
        // System.out.println("Hello, World!") // Syntax Error:- missing semicolon


/*******************************************************************************************************/
// No.2 *************************Logical Error or Symentic Error********************** :- A logical error or bug  occurs when a program compiles and runs but does the wrong things. 
//Ex:- Message deliverd to wrong person, wrong calculation, wrong output etc.
 
        int num1 = 10;
        int num2 = 20;

        // Incorrect logic: using integer division
        int average = (num1 + num2) / 2;
        System.out.println("The average is: " + average); // This will print 15 instead of 15.0
        int a=5;
        int b=0;
        System.out.println(a/b); // Logical Error:- Division by zero
         
// ********************************Run time error*****************************************:- A run time error also known as exception. Java may sometimes encounter an error while the program is running.These are also called exception. 

/*Ex:-
int a= 8;
char b= 'a';
System.out.println(a+b); // Run time error:- incompatible types: possible lossy conversion from int to char.
*/

// Note:- Java is a strongly typed language, so it will not allow you to mix data types.
// Syntax error and symentic error encounterd by programmer while run time error encounterd by  user.
}
}     







