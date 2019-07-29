
//짝수(0포함)번째는 문자형, 홀수번째는 정수형이 넣어지는 배열
class Array_combine {

    int j=0;
    public static void main(String[] args) {
        String a[] = {"A", "B", "C", "D", "E"};
        String b[] = {"1","2","3","4","5","6","7","8","9"};
        String c[] = new String[10];
        
        for(int i=0; i<a.length; i=i+2) {
            c[i]=a[i];
        }
        /*
        if(i<a.length) {
            int i+=2;
        }

        else int i+=1
        
        ->

        i= i<a.length ? i+2:i+1;
        */
        for(int i=1; i<b.length; i=i<a.length ? i+2:i+1) {
            c[i]=b[i];
        }

        
        for(int j=0; j<c.length; j++) {
            if(c[j]==null) c[j]="";
            System.out.print(" "+c[j]+" ");
        }
    }
}