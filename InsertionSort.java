import java.util.Scanner;

//단순삽입정렬
class InsertionSort {
    static void InsertionSort(int[] a, int n) {
        for(int i=0; i<n; i++) {
            int j;
            int tmp=a[i];
            for(j=i; j>0 && a[j-1]>tmp; j--) a[j]=a[j-1];
            a[j]=tmp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int nx=sc.nextInt();
        int[] x = new int[nx];

        for(int i=0; i<nx; i++) {
            System.out.print("x["+i+"] : ");
            x[i] = sc.nextInt();
        }

        InsertionSort(x, nx);

        System.out.println("-----------------------------");
        for(int i=0; i<nx; i++) {
           System.out.println("x["+i+"] = "+x[i]); 
        }

        sc.close();
    }
}