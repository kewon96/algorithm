import java.util.Scanner;

//배열 위치 변경 -> 각 양끝요소 변경
class ReverseArray {
    static void swap(int[] a, int idx1, int idx2) {
        int t=a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void reverse(int a[]) {
        for(int i=0; i<a.length/2; i++) {
            swap(a, i, a.length-i-1);
            System.out.println("a["+i+"]와 a[" + (a.length-i) + "]를 교환합니다.");
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