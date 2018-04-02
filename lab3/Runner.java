package labs_java.lab3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class Runner {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Input list length");
            int length = scn.nextInt();
            List<Store> list = getList(length, scn);
            writeToFile("lab3.out", list);
            List<Store> list2 = readFromFile("lab3.out");
            for (Store store : list2) {
                System.out.println(store);
            }

        }
        public static List<Store> readFromFile(String filename){
            ArrayList<Store> list = null;
            try {
                FileInputStream fis = new FileInputStream(filename);
                ObjectInputStream oin = new ObjectInputStream(fis);
                list = (ArrayList<Store>) oin.readObject();
                oin.close();

            } catch (IOException |ClassNotFoundException e) {
                e.printStackTrace();
            }
            return list;
        }
        public static void writeToFile(String filename, List<?> list){
            try {
                FileOutputStream  fos = new FileOutputStream(filename);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(list);
                oos.flush();
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public static List<Store> getList(int length, Scanner scn){
            String name;
            int amount;
            int price;
            List<Store> list = new ArrayList<>();
            for (int i = 0; i < length; i++) {
                System.out.println("Product: ");
                scn.nextLine();
                System.out.println("Input title");
                name = scn.nextLine();
                System.out.println("Input amount");
                amount = scn.nextInt();
                System.out.println("Input price");
                price = scn.nextInt();
                list.add(new Store(name, amount, price));
            }
            return  list;
        }
}
