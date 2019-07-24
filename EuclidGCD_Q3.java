import java.util.Scanner;

class EuclidGCD_Q3 {
    static int gcd(int x, int y) {
        while(y!=0) {
            int temp=y;
            y=x%y;
            x=temp;
        }
        return (x);
    }

    //start : 배열시작위치, no : 배열의 크기
    static int gcdArray(int a[], int start, int no) {
        if(no==1) //인수가 1개밖에 없을 시
            return a[start];
        else if(no==2) //인수가 2개일 시
            return gcd(a[start], a[start+1]);
        else 
            return gcd(a[start], gcdArray(a, start+1, no-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇개?");
        
        int num; 

        do{
            num=sc.nextInt();
        }while(num<=1);

        int[] x = new int[num];
        
        //배열값 입력
        for(int i=0; i<num; i++) {
            System.out.print("x["+i+"] : ");
            x[i] = sc.nextInt();
        }

        System.out.println("GCD is "+gcdArray(x,0,num));
    }
}