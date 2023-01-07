import java.util.Scanner;
public class exponentnumbers {
    public static void main(String[] args) {
        int k, r;
        Scanner input=new Scanner(System.in);
        System.out.print("Taban Sayıyı Giriniz:");
        r= input.nextInt();
        System.out.print("Üs Sayıyı Giriniz:");
        k = input.nextInt();
        int total=1;
        for (int i=1; i<=k; i++){
            total*=r;}
        System.out.println("Result:" + total);
    }
}
