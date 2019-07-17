import java.util.Scanner;

class IntQueueTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntStack s = new IntStack(64);

        while(true) {
            System.out.println("Data count : "+s.size() + " / "+s.capacity());
            System.out.print("(1)Enque (2)Deque (3)Peek (4)Dump (0)End : ");

            //input in (1 2 3 4 0)
            int menu = sc.nextInt();

            //If input 0, end the repetition.
            if(menu==0) break;

            //Data Values
            int x;
            switch (menu) {
                case 1 :
                    System.out.print("Data : ");
                    x=sc.nextInt();
                    try {
                        s.push(x);
                    }
                    catch (IntQueue.OverflowIntQueueExcetion e) {
                        System.out.println("Queue is Maximum!!");
                    }
                    break;

                case 2 :
                    try {
                        x=s.pop();
                        System.out.println("Pop data is "+x+".");
                    }
                    catch (IntQueue.EmptyIntQueueException e) {
                        System.out.println("Queue is empty!!");
                    }
                    break;

                case 3 :
                    try {
                        x=s.peek();
                        System.out.println("Peek data is "+x+".");
                    }
                    catch (IntQueue.EmptyIntQueueException e) {
                        System.out.println("Stack is empty!!");
                    }
                    break;
                
                case 4 :
                    s.dump();
                    break;
            }
        }
        sc.close();
    }
}