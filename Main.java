import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //değişkenler oluşturulur
        int Matematik,Fizik,Kimya,Turkce,Tarih,Muzik;
        //scanner sınıfı tanımlanır
        Scanner Input = new Scanner(System.in);
        //kullanıcıdan değerler alınınır
        System.out.print("Matematik Notunuz:");
        Matematik= Input.nextInt();

        System.out.print("Fizik Notunuz:");
        Fizik= Input.nextInt();

        System.out.print("Kimya Notunuz:");
        Kimya= Input.nextInt();

        System.out.print("Türkçe Notunuz:");
        Turkce= Input.nextInt();

        System.out.print("Tarih Notunuz:");
        Tarih= Input.nextInt();

        System.out.print("Müzik Notunuz:");
        Muzik= Input.nextInt();
//değerler toplanım matematiksel işlemi yapılır
        int toplam = Matematik + Fizik + Kimya + Turkce + Tarih + Muzik;
        double sonuc= toplam/6.0;
        System.out.println("Ortalamanız:" + sonuc);
        // not ortalamasının 60 dan büyük olup olmama durumu sorgulanarak geçtiniz ve kaldınız yazıları yazdırılır
        boolean kosul = sonuc>=60;
        String s = kosul ? "Geçtiniz" : "Kaldınız";
        System.out.println(s);
            }
}