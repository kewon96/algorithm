import java.util.Scanner;

class Factorial_v2 {
    static int Factorial(int n) {
        if(n>0) return n*Factorial(n-1);
        else return 1;
    }

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.print("앞수 : ");
        int x = sc1.nextInt();
        System.out.print("뒷수 : ");
        int y = sc2.nextInt();
        System.out.println(x+"_P_"+y);

        System.out.println(x+"--->Factorial is---> "+Factorial(x)/Factorial(x-y));
    } 
}