import java.util.Scanner;

class Factorial_Recursion {
    static int Factorial(int n) {
        if(n>0) return n*Factorial(n-1);
        else return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 : ");
        int x = sc.nextInt();

        System.out.println(x+"--->Factorial is---> "+Factorial(x));
    } 
}