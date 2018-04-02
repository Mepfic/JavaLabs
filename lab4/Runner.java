package labs_java.lab4;

import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input list length");
        int length = scn.nextInt();
        List<Store> list = FileScanner.getList(length, scn);
        FileScanner.writeToFile("lab4.out", list);
        List<Store> list2 = FileScanner.readFromFile("lab4.out");
        for (Store store : list2) {
            System.out.println(store);
        }

    }

}
