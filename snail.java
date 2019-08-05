import java.util.Scanner;

class snail {
    public void filter(long a, long b, long c) {
        
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("달팽이퀴즈!");
        System.out.print("전봇대높이부터!");
        long pole=sc.nextInt();
        System.out.print("낮에 올라가는 높이는?");
        long day=sc.nextInt();
        System.out.print("밤에 내려가는 높이는?");
        long night=sc.nextInt();
        //기간
        long count=0;
        //기간동안 올라가는 높이
        long sum=0;

        for(count=1; ; count++) {
            sum=(day-night)*count;
            if(sum>=pole) break;
            sum+=day;
            if(sum>=pole) break;
        }
        System.out.println(count);
    }
}