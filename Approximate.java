import java.util.Arrays;
import java.util.Scanner;

class Approximate {
    static void compare(Integer a[], int b) { //b : 기준값
        int index=Arrays.asList(a).indexOf(b);

        //오른쪽에 있는거
        int index_right = index+1;
        int alpha=a[index_right]; //정상출력
        int index_alpha=alpha-b;

        //왼쪽에 있는거
        int index_left = index-1;
        int beta=a[index_left]; //정상출력
        int index_beta=b-beta;

        if(index_alpha>index_beta) System.out.println(index_left+"번째에 있는 "+beta+"이(가) 가까워!");
        else if(index_alpha==index_beta) System.out.println(index_left+"번째에 있는 "+beta+"이(가) 양쪽에 있어!");
        else System.out.println(index_right+"번째에 있는 "+alpha+"이(가) 가까워!");
    }
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

        compare(array, value);
        sc.close();
    }
}