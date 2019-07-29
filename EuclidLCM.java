import java.util.Scanner;

//유클리드호제법 -> 최소공배수
class EuclidLCM {
    static int lcm(int x, int y) {
        return x*y/EuclidGCD.gcd(x, y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("First Integer : ");
        int x=sc.nextInt();
        System.out.print("Second Integer : ");
        int y=sc.nextInt();

        System.out.println("LCM is "+lcm(x,y));

        sc.close();
    }
}