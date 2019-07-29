import java.util.Scanner;

//삼각형만들기
class Triangle {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("최대값 구하기!");

        do {
            System.out.println("몇층쌓을꺼야?");
            n=stdIn.nextInt();
        } while(n <= 0);

        /*왼쪽 위
        for(int i=1; i<=n; i++) {
            for(int j=n; j>=i; j--) 
                System.out.print('*');

                System.out.println();
        }
        */

        for(int i=1; i<=n; i++) {
            for(int j=1; j<n-i+1; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++) {
                System.out.print('*');
            }
                System.out.println();
        }
        stdIn.close();
    }
}