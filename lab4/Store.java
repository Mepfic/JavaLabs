package labs_java.lab4;

import java.io.Serializable;

public class Store implements Serializable{

        private String name;
        private int amount;
        private int price;

        public Store(String name, int amount, int price) {
            if(amount<=0 || price<=0){
                throw new StoreException("Invalid amount or price");
            }
            this.name = name;
            this.amount = amount;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getTotalPrice(){
            return amount*price;
        }

       @Override
        public String toString() {
            return name+"; "+ "price: " + price + "; "+"amount: " + amount+"; " + " total price: "+ getTotalPrice()+".";
        }
}
