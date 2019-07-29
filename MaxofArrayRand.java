import java.util.Random;
import java.util.Scanner;

//랜덤한 변수가 저장된 배열 -> 최댓값출력
class MaxofArrayRand {
    static int maxof(int[] a){
        int max = a[0];
        for(int i=0; i<a.length; i++) {
            if(a[i]>max) {
                max=a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("사람 수 : ");
        int num = sc.nextInt();

        int[] height = new int[num];

        //키
        for(int i=0; i<num; i++) {
            height[i] = 160+rand.nextInt(30);
            System.out.println("height[" + i + "] : " + height[i]);
        }

        System.out.println(maxof(height));
        sc.close();
    }
}