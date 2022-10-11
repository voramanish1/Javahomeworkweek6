package javaprogrames1;

/*  4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme /*


 */
//4.1 Declare two instance and two static variables.
public class Question4 {
    int a = 20;
    int b = 30;
    static int c = 40;
    static int d = 50;

    public static void main(String[] args) {
    Question4 z = new Question4();
    z.londonUk();
    londonUk1();

    }

    //4.2 Declare one instance method.
    public void londonUk() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }

    //4.3 Declare one static method.
    public static void londonUk1() { // class name
        Question4 t = new Question4();//create object
        System.out.println(t.a);
        Question4 p = new Question4();//create object
        System.out.println(p.b);
        System.out.println(c);
        System.out.println(d);
    }


}
