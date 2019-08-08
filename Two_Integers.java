import java.util.Scanner;

//두 정수 사이의 합(ex : 4, 7 -> 4+5+6+7)
class Two_Integers {
    public long solution(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }

    private long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2; //등차수열의 합 공식
    }

    public static void main(String[] a) {
        Two_Integers ti = new Two_Integers();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("첫번째 정수 입력 : ");
        int first=sc.nextInt();
        System.out.print("두번째 정수 입력 : ");
        int second=sc.nextInt();

        System.out.println(ti.solution(first, second));
        
        sc.close();
    }
}