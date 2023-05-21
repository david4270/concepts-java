
//basic-2: OOP concepts

//Calculator class
class Calculator{
    static double result = 0;
    double nonStaticResult = 0;
    String name;

    //method - function within class
    //add method
    static double add(double a, double b){ //a,b are parameters - values stored in method
        result = a + b;
        return result;
    }

    //sub method - subtraction
    static double sub(double a, double b){
        result = a - b;
        return result;
    }

    //mul method - multiplication
    static double mul(double a, double b){
        result = a * b;
        return result;
    }

    //div method - division
    static double div(double a, double b){
        if(b == 0){
            return 0;
        }
        result = a / b;
        return result;
    }

    double returnVal(double a){
        this.nonStaticResult += a;
        return nonStaticResult;
    }
}

//Main class
public class Main {
    public static void main(String[] args) {
        //cal1 is instance of Calculator class
        Calculator cal1 = new Calculator();

        //Instance variable
        cal1.name = "Calculator 1";
        System.out.println(cal1.name);

        System.out.println(cal1.add(3,5)); //3, 5 are arguments - values tossed to method
        System.out.println(cal1.sub(3,5));
        System.out.println(cal1.mul(3,5));
        System.out.println(cal1.div(3,5));

        System.out.println(cal1.returnVal(3.3546));

    }
}