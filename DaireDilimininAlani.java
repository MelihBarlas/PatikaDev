import java.util.Scanner;
public class DaireDilimininAlani {
    public static void main(String[] args){
        Scanner Input= new Scanner(System.in);
        //değişkenler belirlendi pi sayısı 3.14 alınır
        double r,pi=3.14,alfa,sonuc;
        System.out.print("Yarı Çap Bilgisini Cm Cinsinden Giriniz:");
        r= Input.nextDouble();
        System.out.print("Açı Ölçüsünü Giriniz:");
        alfa= Input.nextDouble();
        //Matematik işlemleri yapılır
        sonuc= (pi*(r*r)*alfa)/360;
        System.out.println("Daire Dilminin Alanı:"+sonuc+"Cm Kare");


    }
}
