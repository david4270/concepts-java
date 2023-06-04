
//basic-2: basic OOP concepts - class, method, inheritance, constructor overloading

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

//Businesses - football club, corporation
class Business{
    int budget = 0;
    String corpName;

    void setName(String name){
        this.corpName = name;
    }

    String getName(){
        return this.corpName;
    }

}

class FootballClub extends Business{
    int trophyCount = 0;
    //Business club = new Business();

    FootballClub(){

    }

    FootballClub(String name, int trophyCtr){
        this.setName(name);
        this.trophyCount = trophyCtr;
    }

    void trophyWon(){
        trophyCount += 1;
        this.budget += 10000;
    }

    void ticketsSold(int numTickets){
        this.budget += 50 * numTickets;
    }

    void playerSold(int moneyIn){
        this.budget += moneyIn;
    }

    void playerBought(int moneyOut){
        this.budget -= moneyOut;
    }

    int clubBudget(){
        return this.budget;
    }

    int getTrophyCount(){
        return this.trophyCount;
    }
}

class Corporation extends Business{
    Corporation(){

    }

    Corporation(String name){
        this.setName(name);
    }

    //Business corp = new Business();
    void productSold(int numProducts){
        this.budget += 100 * numProducts;
    }

    void salaryPaid(int salary){
        this.budget -= 10000 * salary;
    }

    int corpBudget(){
        return this.budget;
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

        Corporation yourCompany = new Corporation();
        FootballClub tottenhamHotspur = new FootballClub();

        yourCompany.setName("Good Morning");
        tottenhamHotspur.setName("Tottenham Hotspur Football Club");

        yourCompany.productSold(40000);
        yourCompany.salaryPaid(300);
        System.out.println(yourCompany.corpBudget());

        tottenhamHotspur.trophyWon();
        tottenhamHotspur.playerBought(3000);
        tottenhamHotspur.playerSold(8000);
        tottenhamHotspur.ticketsSold(5000);
        System.out.println(tottenhamHotspur.getTrophyCount());
        System.out.println(tottenhamHotspur.clubBudget());

        System.out.println(yourCompany.getName());
        System.out.println(tottenhamHotspur.getName());

        FootballClub woolwichFraudClub = new FootballClub("Woolwich Arsenal Fraud Club", 0);
        System.out.println(woolwichFraudClub.getTrophyCount());
        System.out.println(woolwichFraudClub.clubBudget());
        System.out.println(woolwichFraudClub.getName());

        Corporation newCompany = new Corporation("Yellow");
        System.out.println(newCompany.getName());

    }
}