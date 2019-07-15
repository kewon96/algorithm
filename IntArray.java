import java.util.Scanner;

class IntArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];

        a[1] = 37;
        a[2] = 67;
        a[4] = 97;

        for(int i=0; i<a.length; i++) {
            System.out.println("a[" + i + "] = " +a[i]);
        }
       
        sc.close();
    }
}