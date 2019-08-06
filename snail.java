import java.util.Scanner;

class snail {
    //a : 올라가는 높이, b : 내려가는 높이, c : 기둥높이
    public void filter(long a, long b, long c) {
        if(1<=a && 1<=b && 1<=c && 
        1000000000>=a&&1000000000>=b&&1000000000>=c &&
        a>b&&c>a) {
            //기간
            long count=1;
            //기간동안 올라가는 높이
            long sum=0;
            for(; ; count++) {
                sum=(a-b)*count;
                if(sum>=c) break;
                sum+=a;
                if(sum>=c) break;
            }
            System.out.println(count);
        }
        else System.out.println("다시입력하고와라");
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        snail s=new snail();
        System.out.println("달팽이퀴즈!");
        System.out.print("전봇대높이부터!");
        long pole=sc.nextInt();
        System.out.print("낮에 올라가는 높이는?");
        long day=sc.nextInt();
        System.out.print("밤에 내려가는 높이는?");
        long night=sc.nextInt();

        s.filter(day, night, pole);

        sc.close();
    }
}