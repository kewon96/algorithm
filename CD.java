import java.util.Scanner;

class CD {
    public static void main(String[] args) {
        //약수인지 유무 판단
        Scanner sc = new Scanner(System.in);
        System.out.print("정수하나 입력! -> ");
        int a=sc.nextInt();
        System.out.print("판별값 하나 입력! -> ");
        int b=sc.nextInt();

        if(a%b==0) System.out.println("약수!");
        else System.out.println("아닌데?");

        sc.close();
    }
}