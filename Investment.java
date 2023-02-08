import java.util.Scanner;

public class Investment{
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        int[] investments = new int[6];
        double rate = 3.9;
        int years = 5;
        int choice;
        boolean arrSet = false;
        
        do{
            System.out.println("Welcome to the Investment Program!");
            System.out.println("Available Options: ");
            System.out.println("1. Enter the initial amount of money for 6 investments and store them inside the array.");
            System.out.println("2. Calculate and print the total amounts for each investment of the arrray.");
            System.out.println("Enter 1 or 2 (or anything else to exit).");
        choice = scan.nextInt();

        if(choice == 1){
            fillArrayInvestments(investments);
            arrSet = true;
        }else if(choice == 2 && arrSet == true){
            calculateAndPrintInvestments(investments, rate, years);
        }else if(arrSet == false){
            System.out.println("Please first enter 6 amouts of money");
        }
        }
        while(choice == 1 || choice == 2);
        

    }

    public static double invest(int money, double rate, int years){
        return money * (1 + (years * (rate / 100)));
    }

    public static void fillArrayInvestments(int[] positiveInt){
        for(int i = 0; i < positiveInt.length; i++){
            System.out.println("Enter 6 amounts of money you wish to invest");
            positiveInt[i] = scan.nextInt();
        }
    }

    public static void calculateAndPrintInvestments(int[] moneyArr, double rates, int year){
            for(int i = 0; i < moneyArr.length; i++){
                System.out.println(invest(moneyArr[i], rates, year));
            }
        }
}