import java.util.Scanner;

public class DivisibleNumbers {
    public static void main(String[] args) {
        int k,sum=0,ave=0,unit=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Input Number:");
        k =input.nextInt();
        for(int i=0; i<=k; i++ ){
            if(i%3==0&&i%4==0){
                System.out.println(i);
                sum += i;
                unit++;
            }
        }
        ave = sum / unit;
        System.out.println("Average: " + ave);

    }
}


