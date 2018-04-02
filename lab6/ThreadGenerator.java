package labs_java.lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class ThreadGenerator {
    private static int amountThread;
    private static String operation;
    private static int limit;
    public static ArrayList<Long> list = new ArrayList<>();
    static Scanner scn;

    public static void main (String [] args){
        System.out.println("Enter the number of threads:");
        scn = new Scanner(System.in);
        amountThread = scn.nextInt();
        System.out.println("Number of threads is: "+ amountThread);
        System.out.println("Enter the number 'a' (limit):");
        limit = scn.nextInt();
        System.out.println("Number 'a' is: "+limit);
        System.out.println("Enter the type of operation: '+' or '-' or '*':");
        String temp = scn.next();
            if (temp.equals("+") || temp.equals("-") || temp.equals("*")){
                operation = temp;
                System.out.println("The type of operation is: " + operation);
            }else {
                System.out.println("The type of operation isn't correct");
                System.exit(0);
            }
        scn.close();
        try {
            execute();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Result is: "+ getResult());
    }

    public static void execute() throws InterruptedException{
        Counter counter = new Counter();

        for (int i = 0; i < amountThread; i++){
            Thread thread = new SimpleTread (counter, limit);
            thread.start();
        }
        Thread.sleep(1000);
    }

    public static long getResult(){
        long result = 0;
        switch (operation) {
            case "+": {
                for (long el : list){
                    result += el;
                }
            }
            break;
            case "-": {
                for (long el : list) {
                    result += el;
                }
            }
            break;
            case "*": {
                result = 1;
                for (long el : list) {
                    result *= el;
                }
            }
            break;
        }
        return result;
    }
}
