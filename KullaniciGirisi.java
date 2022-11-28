import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password, nps, select;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Kullanıcı Adınızı Giriniz:");
        userName = input.nextLine();

        System.out.print("Lütfen Parolanızı Giriniz:");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Başarıyla giriş yaptınız!");

        }
        else if (userName.equals("patika") && !password.equals("java123")) {
            System.out.println("Şifreniz Yanlış! Değiştirmek ister misiniz?");
            System.out.println("\n1-Evet\n2-Hayır");
            System.out.println("evet veya hayır yazınız");
        }  else if (!userName.equals("patika")||!password.equals("java123")){
            System.out.println("Bilgileriniz Yanlış program kapatılıyor!");
            System.exit(0);}
        select = input.nextLine();
        if (select.equals("evet")) {
            System.out.println("Yeni Şifrenizini Giriniz:");
            nps = input.nextLine();
            if (nps.equals("java123")) {
                System.out.println("Yeni Şifreniz Eskisiyle Aynı Olamaz!");
            } else {
                System.out.println("Şifreniz Başarıyla Değiştirildi!");
                System.exit(0);

            }
        }else{System.exit(0);}




    }
}




