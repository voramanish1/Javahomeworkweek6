package javaprogrames1;
/*2. Write a Java programme using the following steps.
2.1 Declare two static variables
2.2 Declare one static method
2.3 Call both static variables into the static method inside the print statement.
2.4 Declare the Main method.
2.5 Call the static method into the Main method and Run the programme. */

public class Question2 {
//2.1 Declare two static variables
    static int a=20; //2.1
    static int b=30; //2.1

    public static void main(String []args) {
       londonUk();//2.5

    }
//2.2 Declare one static method
    public static void londonUk() { //2.2 static method
    System.out.println(a); //2.3
    System.out.println(b); //2.3

//2.3 Call both static variables into the static method inside the print statement.


/* static = static ( direct call karvanu )
instance - static ( you have to create object in main method )
static = instance ( you have to create object in method )
 */
    }

}
