import java.util.Scanner;

//세자리 숫자의 백의 자리수와 일의 자리수를 바꾼 뒤 비교하기
class Compare_and_replace {
    public void compare(String str) {
        
        String str_copy="";
        char[] chr = str.toCharArray();

        for(int i=2; i>=0; i--) {
            str_copy=str_copy+Character.toString(chr[i]);
        }

        str=str_copy;
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        Compare_and_replace cr = new Compare_and_replace();

        System.out.println("숫자 입력부터!");
        System.out.print("첫번째 : ");
        String first=sc.next();
        System.out.print("두번째 : ");
        String second=sc.next();

        cr.compare(first);
        cr.compare(second);

        int f=Integer.parseInt(first);
        int s=Integer.parseInt(second);

        if(f>s) System.out.println(f);
        else System.out.println(s);
    }
}