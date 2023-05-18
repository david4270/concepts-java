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

        //integer calculation
        int a = 10;
        int b = 5;
        System.out.println("a+b = "+ String.valueOf(a + b));
        System.out.println("a-b = "+ String.valueOf(a - b));
        System.out.println("a*b = "+ String.valueOf(a * b));
        System.out.println("a/b = "+ String.valueOf(a / b));
        System.out.println(a++); //increase a after printing this, prints 10
        System.out.println(a); //a increased to 11
        System.out.println(++a); //increase a before printing, prints 12
        System.out.println(a); // a = 12
        System.out.println("a%b = "+ String.valueOf(a % b));

        //boolean example
        int base = 180;
        int height = 185;
        boolean isTall = height > base;
        if(isTall){
            System.out.println("You are tall");
        }

        int c = 3;
        if(c%2 == 1){
            System.out.println("The number " + c + " is odd");
        }

        //char print
        System.out.println('a'); //character
        char a1 = 97; //ASCII
        System.out.println(a1);
        System.out.println('\u0061'); //unicode

        //string
        String a2 = "Happy new day";
        String b2 = new String("Yeet"); //use 'new' to make a new method
        String c2 = new String("Happy new day");

        System.out.println(a2 + ' ' + b2);
        System.out.println(a2.equals(c2)); //true
        System.out.println(a2.equals(b2)); //false
        System.out.println(a2.indexOf("new")); //returns 6
        System.out.println(a2.contains("new")); //returns true
        System.out.println(a2.charAt(6)); //prints 'n'
        System.out.println(a2.replaceAll("day","year")); //replaces "day" to "year"
        System.out.println(a2.substring(2,4)); //pp -> index 2 <= substring < index 4

        String d = "a:b:c:d";
        String[] dsplit = d.split(":"); //{"a","b","c","d"}
        System.out.println(dsplit[1]); //shows b

        //String.format returns string to print
        System.out.println(String.format("Hello world %d",3));
        System.out.println(String.format("Hello %s world","Java"));
        System.out.println(String.format("My birthday is %s %dth","July",24));
        System.out.println(String.format("%10dth",24)); //10 space, then print 24th
        System.out.println(String.format("%.4f",3.141592)); //3.1416

        //printf prints string
        System.out.printf("My birthday is %s %dth\n", "July", 24); //similar to C's printf

        /*
        %s String
        %c char
        %d int
        %f floating point
        %o octal
        %x hexadecimal
        %% literal % (character %)
         */

        //stringbuffer
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("Good morning");
        String result = sb.toString();
        System.out.println(result);

        //String is immutable, value cannot be changed
        //StringBuffer is mutable, value can be changed
        //new StringBuffer() takes more memory and slower
        //StringBuffer() is better at multithreading, StringBuilder() has better performance
        //Better to use StringBuffer() if synchronisation is needed
        sb.insert(0,"Hi ");
        System.out.println(sb.toString());
        System.out.println(sb.substring(0,7));

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

Primitive data types - int, long, double, float, boolean, char - cannot be created using 'new' keyword
- each data type has corresponding wrapper classes
String can be expressed using literals
 */