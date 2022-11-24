import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
// Java ile kullanıcıdan alınan para değerinin
// KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
//Değişkenler oluşturuyoruz
        double Fiyat;
// Scanner input belirlenir
        Scanner Input = new Scanner(System.in);
        System.out.print("Kdv'siz Fiyat:");
        Fiyat= Input.nextInt();
        //Kdv Oranı 1000 lira üzerinde ise %8 altında ise %18 olacak şekilde hesaplanarak matematiksel işlemler yapılır
        boolean kosul = Fiyat>=1000;
        double vergi= kosul ? Fiyat*8/100 : Fiyat*18/100;
        double sonuc= vergi+Fiyat;
        System.out.println("Kdv Miktarı:"+vergi);
        System.out.println("Kdv Dahil Fiyat"+ sonuc);




            }

}
