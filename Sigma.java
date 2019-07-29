import java.util.Scanner;

//배열요소들의 총 합 -> 재귀함수사용
class Sigma {

    static int Sigma(int a) {
        int sum=0;
        for(int i=1; i<=a; i++) {
            sum+=i;
        }
        return sum;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("자연수를 입력하쇼 : ");
        int n = sc.nextInt();

        System.out.println("Sum = "+Sigma(n));

        sc.close();
    }
}
