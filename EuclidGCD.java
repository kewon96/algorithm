import java.util.Scanner;

class EuclidGCD {
    static int gcd(int x, int y) {
        if(y==0) return x;
        else return gcd(y, x%y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("First Integer : ");
        int x=sc.nextInt();
        System.out.print("Second Integer : ");
        int y=sc.nextInt();

        System.out.println("GCD is "+gcd(x,y));
    }
}