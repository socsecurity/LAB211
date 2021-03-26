import java.util.Stack;
public class MStack{
    private Stack<Integer> stack = new Stack();
    private int stackValues;

    public MStack(){}
    public Stack<Integer> getStack() {
        return stack;
    }
    public void setStack(Stack<Integer> stack) {
        this.stack = stack;
    }
    public int getStackValues() {
        return stackValues;
    }
    public void setStackValues(int stackValues) {
        this.stackValues = stackValues;
    }

    public void push(int stackValues){
        getStack().push(stackValues); 
    }

    public void pop(){
        System.out.println((Integer) getStack().pop()); 
    }

    public void get(int position){
        System.out.println(getStack().get(position));
    }
}