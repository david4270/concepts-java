// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

// Written in Intellij x OpenJDK 20.0.1
// Class Block - class name should be same as source file name

// basic-1: Types in Java - exploration

import java.util.*;

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

        numtypeExplore();
        boolcharExplore();
        strtypeExplore();
        arraylistExplore();
        mapExplore();
        setExplore();
        enumExplore();
        typeExchange();
    }

    public static void numtypeExplore(){
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
    }


    public static void boolcharExplore(){
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
    }

    /*
    Primitive data types - int, long, double, float, boolean, char - cannot be created using 'new' keyword
    - each data type has corresponding wrapper classes
    String can be expressed using literals
     */

    public static void strtypeExplore(){
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

    public static void arraylistExplore(){
        //array
        int [] odds = {1,3,5,7,9};
        String [] daysinWeek = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
        for(int i = 0; i < daysinWeek.length; i++){
            System.out.println(i + " " + daysinWeek[i]);
        }
        // ArrayIndexOutOfBoundsException - error when trying to access out of index (8th index in daysinWeek)

        //list
        //Arraylist - need to import java.util.ArrayList; Does not specify type
        ArrayList greatDays = new ArrayList();
        greatDays.add("234");
        greatDays.add("123");
        greatDays.add("154");
        greatDays.add(0, "126"); //insert at index 0
        greatDays.add(2, "253"); //insert at index 2

        System.out.println(greatDays.get(4)); //get index 4
        System.out.println(greatDays.size()); //get size
        System.out.println(greatDays.contains("123")); //check if it contains 123
        System.out.println(greatDays.remove(2)); //remove index 2, and return the number

        greatDays.add(128);
        System.out.println(greatDays.contains(128)); //contains integer 128
        System.out.println(greatDays.contains("128")); //doesn't contain string "128"
        System.out.println(greatDays);

        //Generics - arraylist with specified type. Need to define reference
        ArrayList<Integer> greatNo = new ArrayList<Integer>();
        greatNo.add(7);
        greatNo.add(9);
        greatNo.add(10);
        greatNo.add(11);

        int seven = greatNo.get(0);
        System.out.println(seven);
        System.out.println(greatNo);

        //If import java.util.Arrays; -> can generate ArrayList with new Arraylist<>(Arrays.asList(array))
        ArrayList<String> arrDaysinWeek = new ArrayList<>(Arrays.asList(daysinWeek));
        System.out.println(arrDaysinWeek);

        ArrayList<String> arrRandNo = new ArrayList<>(Arrays.asList("3254","12345","1234"));
        System.out.println(arrRandNo);

        String res = "";
        for (int i = 0; i < arrDaysinWeek.size(); i++){
            res += arrDaysinWeek.get(i);
            res += ", ";
        }
        res = res.substring(0,res.length()-2); //remove last comma and space
        System.out.println(res);

        //use String.join
        String res2 = String.join(", ", arrDaysinWeek);
        System.out.println(res2);

        // import java.util.Comparator; to sort the ArrayList
        greatNo.add(5);
        greatNo.add(1);
        greatNo.sort(Comparator.naturalOrder()); //in-order -> Comparator.naturalOrder(), reverse -> Comparator.reverseOrder()
        System.out.println(greatNo);


    }

    public static void mapExplore(){
        //import java.util.HashMap;
        HashMap<String, Integer> plTable = new HashMap<>();
        plTable.put("Manchester City",1);
        plTable.put("Woolwich Fraud Club",2);
        plTable.put("Newcastle Utd",3);
        plTable.put("Manchester Utd",4);
        plTable.put("Liverpool",5);
        plTable.put("Brighton",6);
        plTable.put("Aston Villa",7);
        plTable.put("Tottenham Hotspur",8);
        plTable.put("Brentford",9);
        plTable.put("Fulham",10);
        plTable.put("Crystal Palace",11);
        plTable.put("Chelsea Clown Club",12);
        plTable.put("Wolverhampton",13);
        plTable.put("Bournemouth",14);
        plTable.put("West Spam",15);
        plTable.put("Nottingham Forest",16);
        plTable.put("Everton",17);
        plTable.put("Leeds United",18);
        plTable.put("Leicester City",19);
        plTable.put("Southampton",20);

        System.out.println("Tottenham Hotspur is placed " + plTable.get("Tottenham Hotspur") + "th in Premier League"); //get value of key
        System.out.println(plTable.getOrDefault("Norwich City", 0)); //return default value if get not working
        System.out.println(plTable.containsKey("Manchester City")); //Check if key exists
        System.out.println(plTable.containsKey("Southampton")); //Check if key exists
        System.out.println(plTable.containsKey("Sunderland")); //Check if key exists

        System.out.println("Southampton is relegated as " + plTable.remove("Southampton") + "th place");
        System.out.println(plTable.containsKey("Southampton")); //Check if key exists

        System.out.println(plTable.size()); //size of hashmap
        System.out.println(plTable.keySet()); //print all keys -> collects all keys of map & returns as Set

        List<String> keyList = new ArrayList<>(plTable.keySet()); //can be stored as list like this
        System.out.println(keyList);

        //HashMap - unordered data storage
        //LinkedHashMap - stores data in order of data storage
        //TreeMap - stores data based on order of key (A->Z?)

    }

    public static void setExplore(){
        HashSet<String> wordSet = new HashSet<>(Arrays.asList("C","O","M","E","O","N","Y","O","U","S","P","U","R","S"));
        System.out.println(wordSet);

        HashSet<String> wordSet2 = new HashSet<>(Arrays.asList("T","O","T","T","E","N","H","A","M"));
        System.out.println(wordSet2);

        //Intersection
        HashSet<String> intersection = new HashSet<>(wordSet);
        intersection.retainAll(wordSet2);
        System.out.println(intersection);

        //Union
        HashSet<String> union = new HashSet<>(wordSet);
        union.addAll(wordSet2);
        System.out.println(union);

        //Subtract
        HashSet<String> subtract = new HashSet<>(wordSet);
        subtract.removeAll(wordSet2);
        System.out.println(subtract);

        HashSet <String> exampleSet = new HashSet<>();
        exampleSet.add("zero");
        exampleSet.add("une");
        exampleSet.add("deux");
        exampleSet.add("trois");
        exampleSet.add("quatre");
        exampleSet.add("cinq");
        exampleSet.add("six");
        exampleSet.add("sept");
        exampleSet.add("huit");
        exampleSet.add("neuf");
        exampleSet.add("dix");
        exampleSet.add("onze");
        exampleSet.add("onze");
        exampleSet.add("douze");
        exampleSet.add("treize");
        exampleSet.add("quatorze");
        exampleSet.add("quinze");
        exampleSet.add("seize");

        exampleSet.addAll(Arrays.asList("dix-sept","dix-huit","dix-neuf","vingt"));

        exampleSet.add("Yeet");

        System.out.println(exampleSet);

        exampleSet.remove("Yeet");

        System.out.println(exampleSet);


        //HashSet - unordered, no repetitions
        //LinkedHashSet - stores data in order of data storage, no repetitions
        //TreeSet - stores data based on order of key (A->Z?), no repetitions
    }

    enum FootballLeagues{
        PREMIER_LEAGUE,
        EFL_CHAMPIONSHIP,
        EFL_LEAGUE_1,
        EFL_LEAGUE_2,
        LA_LIGA,
        LA_LIGA_2,
        SERIE_A,
        SERIE_B,
        SERIE_C,

        BUNDESLIGA,
        BUNDESLIGA_2,
        LIGA_3
    }

    public static int leagueTier(FootballLeagues type){
        ArrayList<FootballLeagues> firstTier = new ArrayList<>(Arrays.asList(FootballLeagues.PREMIER_LEAGUE, FootballLeagues.LA_LIGA,FootballLeagues.SERIE_A,FootballLeagues.BUNDESLIGA));
        ArrayList<FootballLeagues> secondTier = new ArrayList<>(Arrays.asList(FootballLeagues.EFL_CHAMPIONSHIP, FootballLeagues.LA_LIGA_2,FootballLeagues.SERIE_B,FootballLeagues.BUNDESLIGA_2));
        ArrayList<FootballLeagues> thirdTier = new ArrayList<>(Arrays.asList(FootballLeagues.EFL_LEAGUE_1, FootballLeagues.SERIE_C, FootballLeagues.LIGA_3));
        ArrayList<FootballLeagues> fourthTier = new ArrayList<>(Arrays.asList(FootballLeagues.EFL_LEAGUE_2));
        if(firstTier.contains(type)){
            return 1;
        }
        else if(secondTier.contains(type)){
            return 2;
        }
        else if(thirdTier.contains(type)){
            return 3;
        }
        else if(fourthTier.contains(type)){
            return 4;
        }
        else{
            return 0;
        }
    }
    public static void enumExplore(){
        System.out.println(FootballLeagues.PREMIER_LEAGUE);

        for(FootballLeagues type: FootballLeagues.values()){
            System.out.println(type);
        }

        int plTier = leagueTier(FootballLeagues.PREMIER_LEAGUE);
        System.out.println(plTier);
        System.out.println(leagueTier(FootballLeagues.LIGA_3));

    }

    public static void typeExchange() {
        String num = "123";
        int n = Integer.parseInt(num);
        System.out.print(n);

        String newNum = ""+ n;
        String newNum1 = String.valueOf(n);
        String newNum2 = Integer.toString(n);
        System.out.println(newNum);
        System.out.println(newNum1);
        System.out.println(newNum2);

        String doubleNum = "123.456";
        double d = Double.parseDouble(doubleNum); //string -> double
        double d2 = n; //int -> double
        System.out.println(d);
        System.out.println(d2);
        int n2 = (int) d; //double -> int
        System.out.println(n2);

        //final -> to set constant (cannot reassign the value)

        final int n3 = 123;
        //n = 456; // creates compilation error

        System.out.println(n3);

        final ArrayList<String> a = new ArrayList<>(Arrays.asList("a","b"));
        //a = new ArrayList<>(Arrays.asList("c","d")); //creates compilation error

        //For list, add/remove of value is possible. To not allow add/remove, use List.of("a","b")
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