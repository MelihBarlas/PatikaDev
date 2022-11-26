import java.util.Scanner;
public class Manav {
    public static void main(String[]args){
        double a,Armut=2.14,e,Elma=3.67,m,Muz=0.95,d,Domates=1.11,p,Patlican=5.0,Toplam;

        Scanner Input=new Scanner(System.in);
        System.out.print("Armut için Kilogram Giriniz:");
        a= Input.nextDouble();
        System.out.print("Elma için Kilogram Giriniz:");
        e= Input.nextDouble();
        System.out.print("Muz için Kilogram Giriniz:");
        m= Input.nextDouble();
        System.out.print("Domates için Kilogram Giriniz:");
        d= Input.nextDouble();
        System.out.print("Patlıcan için Kilogram Giriniz:");
        p= Input.nextDouble();
        Toplam=(Armut*a)+(Elma*e)+(Domates*d)+(Muz*m)+(Patlican*p);
        System.out.println("Toplam Tutar:"+Toplam);
    }
}
