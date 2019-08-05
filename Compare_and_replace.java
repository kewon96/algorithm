import java.util.Scanner;

//세자리 숫자의 백의 자리수와 일의 자리수를 바꾼 뒤 비교하기
class Compare_and_replace {
    //
    public boolean filter(int a, int b) {
        /**
         * 두 수가 같거나
         * 범위외의 값이거나
         * 0이 포함되있다면 false
         */
        String alpha=Integer.toString(a);
        String beta=Integer.toString(b);
        
        if((a==b)||(a<100&&a>999)||(b<100&&b>999)||alpha.contains("0")||beta.contains("0")) {
            return false;
        }else{
            return true;
        }
    }

    //앞 뒤 바꾸기
    public int compare(int i) {
        String str=Integer.toString(i);
        
        String str_copy="";
        char[] chr = str.toCharArray();

        for(int j=2; j>=0; j--) {
            str_copy=str_copy+Character.toString(chr[j]);
        }

        str=str_copy;

        i=Integer.parseInt(str_copy);

        return i;
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        Compare_and_replace cr = new Compare_and_replace();

        System.out.println("숫자 입력부터!");
        System.out.print("첫번째 : ");
        int first=sc.nextInt();
        System.out.print("두번째 : ");
        int second=sc.nextInt();

        boolean check = cr.filter(first, second);

        if(check==true) {
            int f=cr.compare(first);
            int s=cr.compare(second);
    
            if(f>s) System.out.println(f);
            else System.out.println(s);
        }
        else {
            System.out.println("제대로 입력안했구나");
        }

        sc.close();
    }
}