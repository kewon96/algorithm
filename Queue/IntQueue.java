public class IntQueue {
    private int max; //Queue volume
    private int front; //First element
    private int rear; //Last element
    private int num; //Current data count
    private int[] que; //Queue(=Array)

    //If Queue is empty
    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() {}
    }

    //If Queue is Maximum
    public class OverflowIntQueueExcetion extends RuntimeException {
        public EmptyIntQueueException() {}
    }

    //Create Queue
    public IntQueue(int capactiy) {
        num=front=rear=0;
        max=capactiy;

        try {
            que=new int[max];
        } catch (OutOfMemoryError e) {
            max=0;
        }
    }

    //Insert data
    public int enque(int x) throws OverflowIntQueueExcetion {
        
        //Create!

    }

    public int deque() throws EmptyIntQueueException {

        //Create!

    } 

    public int peek() throws EmptyIntQueueException {

        //Create!

    }

    public int capactiy() {
        return max;
    }

    public int size() {
        return num;
    }

    public void dump() {
        if(num<= 0) System.out.println("Queue is empty");
        else {
            for(int i=0; i<num; i++) System.out.print(que[(i+front) % max]+" ");
            System.out.println();
        }
    }
}