package queue;

//Queue방식 데이터쌓기

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
        public OverflowIntQueueExcetion() {}
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
        if(num>=max) throw new OverflowIntQueueExcetion();
        
        que[rear++]=x;
        num++;

        if(rear==max) rear=0;
        
        return x;
    }

    public int deque() throws EmptyIntQueueException {
        if(num<=0) throw new EmptyIntQueueException();
        
        int x=que[front++];
        num--;

        if(front == max) front=0;

        return x;
    } 

    public int peek() throws EmptyIntQueueException {
        if(num<=0) throw new EmptyIntQueueException();
        return que[front];
    }

    public int indexOf(int x) throws EmptyIntQueueException {
        for(int i=0; i<num; i++) {
            int idx=(i+front)%max;

            if(que[idx] == x) return idx;
        }
        
        return -1;
    }

    public void clear() {
        front=rear=max=0;
    }

    public int capactiy() {
        return max;
    }

    public int size() {
        return num;
    }

    public boolean isEmpty() {
        return num>=max;
    }

    public void dump() {
        if(num<= 0) System.out.println("Queue is empty");
        else {
            for(int i=0; i<num; i++) System.out.print(que[(i+front) % max]+" ");
            System.out.println();
        }
    }
}