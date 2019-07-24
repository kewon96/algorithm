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
        
        System.out.println("너가 찾는 값인 "+value+"의 값은 " +Arrays.asList(array).indexOf(value)+"에 있어!");
        /*
        //오른쪽으로 이동
        for(int j=찾는 값의 위치; ) {

        }

        //왼쪽으로 이동
        for() {

        }
        */
        sc.close();
    }
}