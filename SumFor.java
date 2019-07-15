import java.util.Scanner;

class SumFor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
        System.out.println("몇까지 더할꺼야? : ");
        int n = sc.nextInt();

        int sum = 0;

        sum=n*(n+1)/2;

        System.out.println(sum);

        sc.close();
    }
}