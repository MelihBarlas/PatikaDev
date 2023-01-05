import java.util.Scanner;
public class LeapYear {
    public static void main(String[]args){
        int year;
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen Hesaplamak İstediğiniz Yılı Giriniz:");
        year = input.nextInt();
        if(year%100==0&&year%400==0){
            System.out.println(year +" "+ "Bir Artık Yıldır!");
        } else if (year%100!=0&&year%4==0) {
            System.out.println(year +" "+ "Bir Artık Yıldır!");
        }else {
            System.out.println(year + " "+"Bir Artık Yıl Değildir!");
        }
    }
}
