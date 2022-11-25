import java.util.Scanner;
import java.math.*;
public class TaksiMetre {
    public static void main(String[] args ){
        //Değişkenler belirlenir ve scanner sistemi kurulur
        int Km;
        float perKm=2.20f,acilis=10f,Ucret;
        //Floatı çıktının düzgün görünmesi için kullandım
        Scanner Input= new Scanner(System.in);
        System.out.print("Mesafeyi Km Cinsinden Giriniz:");
        Km= Input.nextInt();
        //Matematik hesabı yapılır ve çıktı yansıtılır
        Ucret=(acilis)+(perKm*Km);
        Ucret = (Ucret<20) ? 20 :Ucret;
        System.out.print("Ödeme Tutarı:"+ Ucret+"TL");
    }
}
