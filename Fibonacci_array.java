import java.util.Scanner;

//피보나치수열 -> 배열에 저장
class Fibonacci_array {
    static int fibonacci(int a) {
        if(a==1) return 0;
        else if(a==2) return 1;
        else return fibonacci(a-1)+fibonacci(a-2);
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기는 얼마나? : ");
        int x=sc.nextInt();
        int array[]=new int[x];

        for(int i=1; i<x; i++) {
            array[i]=fibonacci(i);
            System.out.println(array[i]);
        }

        sc.close();
    }
}