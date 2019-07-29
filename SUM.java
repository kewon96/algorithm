import java.util.Scanner;

//단순 배열의 총 합
class SUM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("몇까지 더할꺼야? : ");
        int n = sc.nextInt();

        int sum = 0;
        
        for(int i=1; i<=n; i++) {
            if(i<n) {
                System.out.print(i+ "+");
            }
            else {
                System.out.print(i);
            }
            sum += i;
        }
       
        System.out.println("="+sum);

        sc.close();
    }
}