import java.util.Scanner;

class Multiple_3_5_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하쇼 : ");
        int a=sc.nextInt();

        String x = a%15==0 ? "FIZZBUZZ" : a%5==0 ? "BUZZ" : a%3==0 ? "FIZZ" : "???";

        System.out.println(x);

        sc.close();
    }
}