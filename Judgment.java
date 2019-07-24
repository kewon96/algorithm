import java.util.Scanner;

class Judgment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수하나 입력하시오 : ");
        int n = sc.nextInt();

        if(n>0) System.out.println("양수넹");
        else if(n<0) System.out.println("음수넹");
        else System.out.println("0이넹");
       
        sc.close();
    }
}