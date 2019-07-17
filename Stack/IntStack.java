public class IntStack {
    private int max; //Stack volume
    private int ptr; //Stack pointer -> Location of last data
    private int[] stk; //Stack(=Array)

    //if Stack is empty
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {}
    }

    //if Stack is full
    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {}
    }

    //Create Stack
    public IntStack(int capacity) { 
        ptr=0; //Empty when first created
        max=capacity; //Stack volume setting

        try {
            stk=new int[max];
        } catch (OutOfMemoryError e) {
            max=0;
        }
    }

    //Insert Data
    public int push(int x) throws OverflowIntStackException {
        if(ptr >= max) throw new OverflowIntStackException();
        return stk[ptr++]=x; //Increase pointer values
    }

    //Remove Data
    public int pop() throws EmptyIntStackException {
        if(ptr<=0) throw new EmptyIntStackException();
        return stk[--ptr]; //Decrease pointer values
    }

    //Meximum stack pointer(Just look)
    public int peek() throws EmptyIntStackException {
        if(ptr<=0) throw new EmptyIntStackException();
        return stk[ptr-1];
    }

    public void dump() {
        if(ptr<= 0) System.out.println("Stack is empty");
        else {
            for(int i=0; i<ptr; i++) System.out.print(stk[i]+" ");
            System.out.println();
        }
    }

    //Stack all space
    public int capacity() {
        return max;
    }

    public int size() {
        return ptr;
    }
}