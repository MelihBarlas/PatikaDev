import java.util.Scanner;

public class exponent {
    public static void main(String[] args) {
        int k;

        Scanner input = new Scanner(System.in);
        System.out.print("Input Number:");
        k = input.nextInt();
        for (int i=1; i<=k; i*=4) {
            System.out.println("exponent of 4:"+i);
        }
        for (int a=1; a<=k; a*=5){
            System.out.println("exponent of 5:"+a);
        }
    }
}

