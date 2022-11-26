import java.util.Scanner;
import java.math.*;

public class VKI {
    public static void main (String[]args){
        double VKI,Boy,Kilo;
        String Sonuc1=("Zayıf! Vücut Kitle İndeksiniz:" ),Sonuc2=("İdeal! Vücut Kitle İndeksiniz:" ),Sonuc3=("Kilolu! Vücut Kitle İndeksiniz:" );
        Scanner Input=new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu Metre Cinsinden Giriniz:");
        Boy= Input.nextDouble();
        System.out.print("Lütfen Kilonuzu Kilogram Cinsinden Giriniz:");
        Kilo= Input.nextDouble();
        VKI=Kilo/(Boy*Boy);
        if (VKI<20) System.out.println(Sonuc1+ VKI);

        else if (VKI<30) System.out.println(Sonuc2+ VKI);

        else if (VKI>30) System.out.println(Sonuc3+ VKI);


    }
}
