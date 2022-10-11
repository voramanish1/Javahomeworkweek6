package javaprogrames1;
/* 1. Write a Java programme using the following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and Run the programme.*/


 public class Question1 {
     //1.1  Declare two instance variables.
    int a=20;
    int b=30;
    public static void main(String []args) { //1.4
       Question1 obj = new Question1();
       obj.londonUk(); //1.5

    }

    //1.2 Declare one instance method
    public void londonUk(){

    //1.3 Call both instance variables into the instance method inside the print statement.
        System.out.println(a);
        System.out.println(b);







    }



}
