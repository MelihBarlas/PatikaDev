import java.util.Scanner;
public class ChineseZodiac {
    public static void main(String[]args){
        int year,calc;
        String Zodiac="";
        Scanner input=new Scanner(System.in);
        System.out.print("Doğdunuz Yılı Giriniz:");
        year = input.nextInt();
        calc = year % 12;
        if (calc==0){
            Zodiac = "Maymun";}
        else if (calc==1) { Zodiac = "Horoz";
        }
        else if (calc==2) {Zodiac = "Köpek";
        }
        else if (calc==3) {Zodiac = "Domuz";
        }
        else if (calc==4) {Zodiac = "Fare";
        }
        else if (calc==5) {Zodiac = "Öküz";
        }
        else if (calc==6) {Zodiac = "Kaplan";
        }
        else if (calc==7) {Zodiac = "Tavşan";
        }
        else if (calc==8) {Zodiac = "Ejderha";
        }
        else if (calc==9) {Zodiac = "Yılan";
        }
        else if (calc==10) {Zodiac = "At";
        }
        else if (calc==11) {Zodiac = "Koyun";
        }else {
            System.out.println("Hatalı Giriş Yaptınız");
        }
        System.out.println("Çin Burcunuz:" + Zodiac);
    }
}
