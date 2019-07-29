import java.util.Scanner;

//선형검색
class SeqSerch {
    //a : 배열의 원소수, n : 배열의 길이(=한계값), key : 찾는 값
    //찾는 값을 배열 맨 끝에 저장한 뒤 하나하나 진행할 때 마다 맨 끝값을 비교하는 방식
    static int seqSerch(int[] a, int n, int key) {
        // for(int i=0; i<n; i++) {
        //     if(a[i] == key) return i;
        // }
        // return -1;
        int i=0;

        a[n]=key; //찾을 값이 맨 끝에 저장된 상황

        while(true) {
            if(a[i]==key) break;
            
            i++;
        }

        return i==n? -1 : i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소수 : ");
        //num : 배열 수
        int num = sc.nextInt();
        //x배열 선언
        int[] x=new int[num+1];

        //x배열에 입력값을 넣음
        for(int i=0; i<num; i++) {
            System.out.print("x["+i+"] : ");
            x[i] = sc.nextInt();
        }

        //검색할 값 입력
        System.out.print("검색할 값 : ");
        int ky = sc.nextInt();
        //seqSerch사용
        int idx = seqSerch(x, num, ky);

        if(idx==-1) System.out.println("없졍!");
        else System.out.println(ky+"는 x["+idx+"]에 있다.");

        sc.close();
    }
}