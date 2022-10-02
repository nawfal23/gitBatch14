import static java.lang.System.*;

public class DemoTest {

    // initialize a String
    public static String myName;

    public static void main(String[] args) {
       // assigned a String value to my String
        myName = "My name is John";
        // called my method
        printMe(myName);
    }

    // crete a method
    public static void printMe(String name) {
        out.println(name);
    }

}
