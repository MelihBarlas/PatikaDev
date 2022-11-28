import java.util.Scanner;
public class NotOrt {


    public static void main(String[] args) {
        //değişkenler oluşturulur
        int Matematik,Fizik,Kimya,Turkce,Tarih,Muzik;
        //scanner sınıfı tanımlanır
        Scanner Input = new Scanner(System.in);
        //kullanıcıdan değerler alınınır
        System.out.print("Matematik Notunuz:");
        Matematik= Input.nextInt();
        if(Matematik>100||Matematik<0){
            Matematik=0;
        }
        System.out.print("Fizik Notunuz:");
        Fizik= Input.nextInt();
        if(Fizik>100||Fizik<0){
            Fizik=0;}

        System.out.print("Kimya Notunuz:");
        Kimya= Input.nextInt();
        if(Kimya>100||Kimya<0){
            Kimya=0;}

        System.out.print("Türkçe Notunuz:");
        Turkce= Input.nextInt();
        if(Turkce>100||Turkce<0){
            Turkce=0;}

        System.out.print("Tarih Notunuz:");
        Tarih= Input.nextInt();
        if(Tarih>100||Tarih<0){
                Tarih=0;}

        System.out.print("Müzik Notunuz:");
        Muzik= Input.nextInt();
        if(Muzik>100||Muzik<0){
            Muzik=0;}


        double avarage=(Matematik+Fizik+Kimya+Turkce+Tarih+Muzik)/6;
        if (avarage<55) {System.out.println("Sınıfta Kaldınız!");
        }
        else
        {
            System.out.println("Geçtiniz!");
        }
        System.out.println("Ortalamnız"+avarage);
        System.exit(0);
    }
}