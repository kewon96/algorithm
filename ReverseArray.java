import java.util.Scanner;

class ReverseArray {
    static void swap(int[] a, int idx1, int idx2) {
        int t=a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void reverse(int a[]) {
        for(int i=0; i<a.size/2; i++) {
            swap(a, i, a.size-i-1);
            System.out.println("a["+i+"]와 a[" + a.size-i + "]를 교환합니다.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소 수 : ");
        int num=sc.nextInt();

        int[] x = new int[num];

        for(int i=0; i<num; i++) {
            System.out.print("x[" +i+ "] : ");
            x[i] = sc.nextInt();
        }

        reverse(x);

        for(int i =0; i<num; i++) {
            System.out.println("x["+i+"] = " +x[i]);
        }
    }
}