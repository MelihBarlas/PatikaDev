import java.util.Scanner;

public class combination {
    public static void main(String[] args) {
        double n,r,com=1,num=1,tot=1,total;
        Scanner input = new Scanner(System.in);
        System.out.print("Input C Number:");
        n = input.nextInt();
        System.out.print("Input N Number:");
        r = input.nextInt();
        for (double i=1; i<=n; i++) {
            com=com*i;
        }
        for (double a=1; a<=r; a++){
            num=num*a;
        }
        for (double y=1; y<=(n-r); y++){
            tot=tot*y;
        }
        total=com/(num*tot);
        System.out.println(total);
    }
}
