import java.util.Scanner;
public class Weather {
    public static void main(String[]args){
        int heat;
        Scanner inp=new Scanner(System.in);
        System.out.println("Hava Sıcaklığını Giriniz:");
        heat= inp.nextInt();
        if(heat>=50 || heat<=-50){
            System.out.println("Ekstrem Hava Koşullarında Lütfen Evinizden Ayrılmayınız!!!");
        }
        else if(heat<=5){
            System.out.println("Kayak Yapmaya Gidebilrisiniz!");
            
        }else if (heat<15) {
            System.out.println("Sinemaya Gidebilirsiniz!");
            if (heat>10) {
                System.out.println("Piknik Yapmaya Gidebilrisiniz!");
            }
        } else if (heat<25) {
            System.out.println("Piknik Yapmaya Gidebilrisiniz!");

        }else {
            System.out.println("Yüzmeye Gidebilrisiniz!");}


    }
}
