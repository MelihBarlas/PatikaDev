import java.util.Scanner;
import java.math.*;
public class Alan {
    public static void main(String[] args){
        //Kenar Uzunlukları Girilen Üçgenin Alanın Hesaplanması
        double KisaKenar,UzunKenar,Hipotenus,cevre,Alan,u,sonuc;
        Scanner Input= new Scanner(System.in);
        System.out.print("Kısa Kenar Uzunluğunu Cm cinsinden Giriniz:");
        KisaKenar= Input.nextDouble();
        System.out.print("Uzun Kenar Uzunluğunu Cm cinsinden Giriniz:");
        UzunKenar= Input.nextDouble();
        System.out.print("Hipotenüs Uzunluğunu Cm cinsinden Giriniz:");
        Hipotenus= Input.nextDouble();
        //matematiksel formüller yazılır
        cevre=Hipotenus+UzunKenar+KisaKenar;
        u=cevre/2;
        Alan=u*(u-KisaKenar)*(u-UzunKenar)*(u-Hipotenus);
        sonuc= Math.sqrt(Alan);
        System.out.println("Üçgenin Alanı:"+ sonuc);

    }
}
