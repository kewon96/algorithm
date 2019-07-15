import java.util.Scanner;

class med {

    static int med1(int a, int b, int c) {
        if(a >= b)
            if(b >= c) return b;
            
            else if(a <= c) return a;

            else return c;
        else if(a > c) return a;

        else if(b > c) return c;
        
        else return b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
        System.out.print("a : ");
        int a = sc.nextInt();

        System.out.print("b : ");
        int b = sc.nextInt();

        System.out.print("c : ");
        int c = sc.nextInt();

        System.out.println("Medium : " + med1(a,b,c));

        sc.close();
    }
}