import java.util.Scanner;
import java.math.*;
public class Airline {
    public static void main(String[] args) {
        int distance, age, type;
        double price;
        Scanner input = new Scanner(System.in);
        System.out.print("Gitmek İstediğiniz Mesafeyi Giriniz:");
        distance = input.nextInt();
        System.out.print("Lütfen Yaşınızı Giriniz:");
        age = input.nextInt();
        System.out.println("Bilet Tipini Seçiniz Tek Yön=>1 Gidiş Dönüş=>2");
        type = input.nextInt();
        if (distance > 1 && age > 0 && type == 1 || type == 2) {
            if (age < 12 && type == 1) {
                price = (distance * 0.1) / 2;
                System.out.println("Bilet Fiyatınız:" + price+"TL");
            } else if (12 <= age && age < 24 && type == 1) {
                price = ((distance * 0.1) / 10) * 9;
                System.out.println("Bilet Fiyatınız:" + price+"TL");
            } else if (age >= 24 && age < 65 && type == 1) {
                price = (distance * 0.1);
                System.out.println("Bilet Fiyatınız:" + price+"TL");
            } else if (age >= 65 && type == 1) {
                price = ((distance * 0.1) / 10) * 7;
                System.out.println("Bilet Fiyatınız:" + price+"TL");

            } else if (age < 12) {
                price = (((distance * 0.2) / 2) / 10) * 8;
                System.out.println("Bilet Fiyatınız:" + price+"TL");

            } else if (age >= 12 && age < 24) {
                price = (((((distance * 0.2) / 10) * 9) / 10) * 8);
                System.out.println("Bilet Fiyatınız:" + price+"TL");

            } else if (age >= 24 && age < 65) {
                price = (((distance * 0.2) / 10) * 8);
                System.out.println("Bilet Fiyatınız:" + price+"TL");

            } else if(age>65){
                price=(((((distance*0.2)/10)*7)/10)*8);
                System.out.println("Bilet Fiyatınız:" + price+"TL");
            }

        }else {
            System.out.println("Hatalı Giriş Yaptınız!");
        }

    }
}
