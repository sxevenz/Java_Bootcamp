package Mod3;
import java.util.Date;

public class DateActivity {


    static class Car{
        String model;
        int year;
        int price;
        public Car(String model, int year, int price) {
            this.model = model;
            this.year = year;
            this.price = price;
        }

        public void setModel(String model) {
            this.model = model;
        }
        public void setYear(int year) {
            this.year = year;
        }
        public void setPrice(int price) {
            this.price = price;
        }
        public String getModel() {
            return model;
        }
        public int getYear() {
            return year;
        }
        public int getPrice() {
            return price;
        }
        public void Horn(){
            System.out.println(model +" Beep!");
        }
    }

    public static void main(String[] args) {
        Date d =  new Date();
        System.out.println(d);



    }
    }


