package javaprogrames1;

public class Question3 {
//3.1  Declare one instance and one static variable

    int a=20;
    static int b=30;
//3.5 Declare the Main method
    public static void main(String[] args) {
        Question3 obj1=new Question3(); // creation of object
        obj1.londonUk1();
        londonUk();
    }

//3.2 Declare one instance method.
  public void londonUk1() {
      System.out.println(a);
      System.out.println(b);
  }
//3.3 Declare one static method.
      public static void londonUk(){ //2.2 static method
      Question3 obj = new Question3();
      System.out.println(obj.a); //2.3
          System.out.println(b); //2.3
      }



}
