import java.util.Scanner;

/**
*  (0 0)
   (0 1) (1 0)
   (2 0) (1 1) (0 2)
   (0 3) (1 2) (2 1) (3 0)
   (4 0) (3 1) (2 2) (1 3) (0 4)
   ...
   이런 배열에서 몇번째 위치에 무엇이 들어가는가
*/
public class Weird_Square{
    static double function(int val)
    {
        double arr[][] = new double[10000][10000];
        double count_num;
        int count = 0;
        int row_count = 1;

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                double k = i;
                arr[i][j] = (k + 1) / (j + 1);
            }
        }

        while (true)
        { 
            //열의 갯수만큼 진행
            for (int i = 0; i < row_count; i++)
            {
                //홀수층
                if ((row_count % 2) == 1)
                {
                    count_num = arr[row_count - i - 1][i];
                    count++;

                    if (count == val)
                        return count_num;
                }

                //짝수층
                else
                {
                    count_num = arr[i][row_count - i - 1];
                    count++;

                    if (count == val)
                        return count_num;
                }
            }
            row_count++;
        }
    }
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int val = stdIn.nextInt();

        System.out.println(function(val));
        stdIn.close();
    }
}