import java.util.Scanner;

class BubbleSort_ASC {

    //위치조정
    static void swap(int a[], int alpha, int beta) {
        int temp=a[alpha]; //임시공간에 첫번째값을 넣음
        a[alpha]=a[beta]; //비어있는 첫번째공간에 두번째값을 넣음
        a[beta]=temp; //비어있는 두번째공간에 첫번째값을 넣음
        System.out.println(a[alpha]+"->"+a[beta]);
    }

    //뒤에서부터 진행
    static void bubble(int a[], int n) { //n : 배열크기
        int k=0;
        while(k<n-1) {
            int last=n-1;
            for(int i=0; i<n-1; i++) { //실질적인 번호인 n-1까지 진행(횟수)
                for(int j=n-1; j>i; j--) { //뒤에서부터 시작
                    if(a[j]<a[j-1]) {
                        swap(a, j-1, j);
                        last=j;
                    }
                    k=last;
                }
            } 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열크기를 입력하쇼 : ");
        int x = sc.nextInt();
        int a[] = new int[x];

        System.out.println("각각 값도!");
        for(int n=0; n<x; n++) {
            System.out.print("a["+n+"] = ");
            a[n] = sc.nextInt();
        }

        bubble(a, x);

        System.out.println("오름차순정렬!");
        for(int i=0; i<x; i++) {
            System.out.println("a["+i+"] = "+a[i]);
        }
        
        sc.close();
    }
}