// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

// Written in Intellij x OpenJDK 20.0.1
// Class Block - class name should be same as source file name
public class Main {
    // Method Block - main method
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }

        typeExplore();
    }

    public static void typeExplore(){
        int num = 10; //default
        long randomLongNum = 3245757235476234L; //long numbers should have L or l at the end of number

        float pi = 3.14F; //float has F or f at the end of the number
        double morePi = 3.1415926535897932384626; //default

        int octNum = 012; //octal equivalent of 10
        int hexNum = 0xA; //hexadecimal equivalent of 10

        System.out.println(num);
        System.out.println(randomLongNum);
        System.out.println(pi);
        System.out.println(morePi);
        System.out.println(octNum);
        System.out.println(hexNum);

        int a = 10;
        int b = 5;
        System.out.println("a+b = "+ String.valueOf(a + b));
        System.out.println("a-b = "+ String.valueOf(a - b));
        System.out.println("a*b = "+ String.valueOf(a * b));
        System.out.println("a/b = "+ String.valueOf(a / b));
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a);

    }
}

/*
Class name should start with capital letter. If the class name is mixture of different words, use capital letter for the start of each word
    ex) Cookie, BananaMilk

public class Cookie{
    (Methods)
}

Method name should be written in verb. If the method name is mixture of different words, start first word with smallcase letter, and start with capital letter for the later words.
    ex) walkSlow, sleep, doWork

public static void walkSlow(){
    (Statements)
}

Variable name should contain the meaning of the variable. For ordered variables, use i, j, k, m, n (for char, use c, d, e)
 */

/*
Variable name cannot be following, and should not contain special characters other than underscore(_) and $

abstract  continue  for         new        switch
assert    default   goto        package    synchronized
boolean   do        if          private    this
break     double    implements  protected  throw
byte      else      import      public     throws
case      enum      instanceof  return     transient
catch     extends   int         short      try
char      final     interface   static     void
class     finally   long        strictfp   volatile
const     float     native      super      while

 */

/*
Types in java - the following are common types used in Java:
    int
    long
    double
    boolean
    char
    String
    StringBuffer
    List
    Map
    Set

User can also define types after creating class. For example:

class Animal{

}

Animal cat;
 */