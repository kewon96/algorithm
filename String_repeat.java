import java.util.Scanner;

class String_repeat {

    public boolean isAlphanumeric(String str) {
        char[] charArray = str.toCharArray();
        for(char c:charArray)
        {
            if (!Character.isLetterOrDigit(c))
                return false;
        }
        return true;
    }
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열입력 : ");
        String str=sc.next();
        System.out.print("반복횟수 입력 : ");
        int repeat=sc.nextInt();

        char ch_copy[] = new char[str.length()*repeat]; //늘어난 배열

        String_repeat sr = new String_repeat();
        //boolean hasNonAlpha = !sr.isAlphanumeric(s);

        //범위안에 있는 문자인가 -> 제대로 된 문자인가
        if(sr.isAlphanumeric(str)==true) { 
            //문자열읽음
            for(int i=0; i<str.length(); i++) {
                //복제할 문자들을 넣을 문자배열을 건드림
                for(int j=0; j<ch_copy.length; j++) {
                    if(repeat*i<=j) {
                        ch_copy[j]=str.charAt(i);
                    }
                }
            }

            for(int i=0; i<ch_copy.length; i++) {
                System.out.print(ch_copy[i]);
            }
         }

        else System.out.println("???");
    }
}