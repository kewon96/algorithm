import java.util.Scanner;

class Quest {
    Scanner sc = new Scanner(System.in);

    public void Quest1() {
        System.out.print("최대값 : ");
        int a=sc.nextInt(); //제한값 삽입
        int exp=1;
        int i=1;

        for(; i<a; i++) {
            if(i*i<a) {
                exp=i*i;
                System.out.println(exp);
            }
            //else System.out.println();
        }
    }
    // 1,2,3,4,5,6,7,8
    // 1,3,2,4,5,7,6,8, ...
    // +2,-1,+2,-1...
    public void Quest2() {
        System.out.print("최대값 : ");
        int a=sc.nextInt();

            int count=0;

        for(int i=1; count<a; i=i+2){
            count=2*i-1;
            if(count<a) System.out.println(count);
            else continue;

            count=2*i+1;
            if(count<a) System.out.println(count);
            else continue;

            count=2*i;
            if(count<a) System.out.println(count);
            else continue;

            count=2*i+2;
            if(count<a) System.out.println(count);
            else continue;

            //i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Quest q = new Quest();

        //q.Quest1();
        q.Quest2();
    }
}