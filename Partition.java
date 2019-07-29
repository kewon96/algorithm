import java.util.Scanner;

//퀵 정렬 -> 기준값을 잡은 뒤 그룹을 나누고 그 그룹내에서 정렬
class Partition {
    //위치전환
    static void swap(int a[], int alpha, int beta) {
        int temp=a[alpha]; //임시공간에 첫번째값을 넣음
        a[alpha]=a[beta]; //비어있는 첫번째공간에 두번째값을 넣음
        a[beta]=temp; //비어있는 두번째공간에 첫번째값을 넣음
    }

    static void partition(int[] a, int left, int right) {
        int pl=left; //왼쪽
        int pr=right; //오른쪽
        int x=a[(pl+pr)/2]; //가운데(기준)값

        do {
            while(a[pl]<x) pl++;
            while(a[pr]>x) pr--;
            if(pl<=pr) swap(a, pl++, pr--);
        } while(pl<=pr);

        if(left<pr) partition(a, left, pl); //처음위치~중간위치-1
        if(pl<right) partition(a, pl, right); //중간위치+1~마지막위치
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

        partition(x, 0, nx-1);

        for(int i=0; i<nx; i++) {
            System.out.println("x["+i+"] = "+x[i]);
        }

        sc.close();
    }
}