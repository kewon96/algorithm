class IntArrayMax {

    //배열 -> 배열에서 제일 큰 값 출력(음수가 있는 전제)
    public static void main(String[] args) {

        int a[] = new int[4];
        int max;

        max = a[0] = -50;
        a[1] = -11;
        a[2] = -77;
        a[3] = -9;
        
        for(int i=0; i<a.length; i++) {

            if(a[i]>max) {
                max=a[i];
            }
        }
        System.out.println(max);
       
    }
}