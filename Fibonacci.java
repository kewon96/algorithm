import java.util.Scanner;

//피보나치수열
class Fibonacci {
    static int fibonacci(int a) {
        if(a==1) return 0;
        else if(a==2) return 1;
        else return fibonacci(a-1)+fibonacci(a-2);
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int x = sc.nextInt();

        System.out.println(fibonacci(x));

        sc.close();
    }
}