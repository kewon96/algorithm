import java.util.Scanner;

//단순 최댓값출력
class MaxResult {

    static int algorithm(int x, int y, int z) {
        int max=x;
        if(y>max) max=y;
        if(z>max) max=z;

        return max;
    }

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.println("최대값 구하기!");
        /* a값 설정 */
        System.out.print("a : "); int a = stdIn.nextInt();

        /* b값 설정 */
        System.out.print("b : "); int b = stdIn.nextInt();

        /* c값 설정 */
        System.out.print("c : "); int c = stdIn.nextInt();

        /*
        int max = a;
        if(b>max) max=b;
        if(c>max) max=c;
        */
        

        System.out.println("Max = " + algorithm(a, b, c));
        stdIn.close();
    }
}