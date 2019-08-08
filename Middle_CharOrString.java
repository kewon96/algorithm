import java.util.Scanner;

//중간에 있는 문자 출력(만약 짝수라면 양옆으로 출력하기(ㅁㄴㅇㄹ -> ㄴㅇ))
class Middle_CharOrString {
    
    public String solution(String s) {
        String answer = "";
        if(s.length()>=1&&s.length()<=100) {
            if(s.length()%2==1) {
              answer=s.substring(s.length()/2, s.length()/2+1);
          }
          else {
              answer=s.substring(s.length()/2-1, s.length()/2+1);
          }
        }
        return answer;
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        test t = new test();
        String s=sc.next();

        System.out.println(t.solution(s));
    }
}