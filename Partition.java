import java.util.Scanner;

class Partition {
    //위치전환
    static void swap(int a[], int alpha, int beta) {
        int temp=a[alpha]; //임시공간에 첫번째값을 넣음
        a[alpha]=a[beta]; //비어있는 첫번째공간에 두번째값을 넣음
        a[beta]=temp; //비어있는 두번째공간에 첫번째값을 넣음
    }

    static void partition(int[] a, int n) {
        int pl=0; //왼쪽
        int pr=n-1; //오른쪽
        int x=a[n/2]; //가운데(기준)값

        do {
            while(a[pl]<x) pl++;
            while(a[pr]>x) pr--;
            if(pl<=pr) swap(a, pl++, pr--);
        } while(pl<=pr);

        System.out.println("기준값 = "+x);

        System.out.println("기준값이하 그룹 : ");
        for(int i=0; i<=pl-1; i++) System.out.print(a[i]+" ");
        System.out.println();

        if(pl>pr+1) {
            System.out.println("기준값과 일치한 그룹");
            for(int i=pr+1; i<=pr; i++) System.out.print(a[i]+" ");

            System.out.println();
        }

        System.out.println("기준값 이상 그룹");
        for(int i=pr+1; i<n; i++) System.out.print(a[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int nx=sc.nextInt();
        int x[] = new int[nx];

        for(int i=0; i<nx; i++) {
            System.out.print("x["+i+"] = ");
            x[i]=sc.nextInt();
        }

        partition(x, nx);

        sc.close();
    }
}