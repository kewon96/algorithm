import java.util.Arrays;
import java.util.Scanner;

//Arrays.binarySearch를 이용한 검색 -> 이진검색
class BinSearchTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = sc.nextInt();
        int[] x=new int[num];

        System.out.println("오름차순으로ㄱㄱ");

        System.out.print("x[0] : ");
        x[0]=sc.nextInt();

        for(int i=1; i<num; i++) {
            do {
                System.out.print("x["+i+"] : ");
                x[i] = sc.nextInt();
            } while(x[i] < x[i-1]);
        }

        System.out.print("검색할 값 : ");
        int key = sc.nextInt();
        int idx = Arrays.binarySearch(x, key);

        if(idx<0) System.out.println("x["+idx+"]");
        else System.out.println(key+"값은(는) x[" +idx+"]에 있어!");

        sc.close();
    }
}