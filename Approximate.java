import java.util.Arrays;
import java.util.Scanner;

class Approximate {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);

        System.out.print("수가 몇개야?(찾는 수도 포함해야하니 하나 더 추가해줘!) : ");
        int length = sc.nextInt();
        Integer array[] = new Integer[length];

        for(int i=0; i<length; i++) {
            System.out.print("array["+i+"] = ");
            int n=sc.nextInt();
            array[i]=n;
        }

        System.out.print("어떤수하고 가까운 값을 찾고싶어? -> ");
        int value = sc.nextInt();

        //배열오름차순으로 정렬
        Arrays.sort(array);
        int index=Arrays.asList(array).indexOf(value); // 위치값
        
        // System.out.println("너가 찾는 값인 "+value+"의 값은 " +index+"에 있어!");
        // System.out.println("위치 잘 기억해놔!");
        
        //오른쪽에 있는거
        int index_right = index+1;
        int alpha=array[index_right];
        System.out.println(alpha);

        //왼쪽에 있는거
        int index_left = index-1;
        int beta=array[index_left];
        System.out.println(beta);
        
        sc.close();
    }
}