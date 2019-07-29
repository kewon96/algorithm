import java.util.Scanner;

//이진검색 -> 정렬되있다는 전제가 있어야 함
class BinSearch {
    static int BinSearch(int[] a, int n, int key) {
        int pl = 0;
        int pr = n-1;

        do {
            int pc = (pl+pr)/2;
            if(a[pc] == key) return pc;
            else if(a[pc] < key) pl=pc+1;
            else pr=pc-1;
        } while(pl<=pr);

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소수 : ");
        int num = sc.nextInt();
        int[] x=new int[num];

        System.out.println("오름차순으로!");

        System.out.print("x[0] : ");
        x[0]=sc.nextInt();

        for(int i=1; i<num; i++) {
            do{
                System.out.print("x["+i+"] : ");
                x[i]=sc.nextInt();
            } while(x[i] < x[i-1]);
        }

        System.out.print("검색할 값 : ");
        int ky = sc.nextInt();
        
        int idx = BinSearch(x, num, ky);

        if(idx==-1) System.out.println("없졍!");
        else System.out.println(ky+"는 x["+idx+"]에 있다.");
        
        sc.close();
    }
}