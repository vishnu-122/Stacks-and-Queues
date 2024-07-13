public class Stack<T> {
    private class Node<T>{
        T value;
        Node<T> next;

        public Node(T value,Node<T> next){
            this.value = value;
            this.next = next;
        }
    }


    private Node<T> top;

    public Stack(){
        top = null;
    }

    public boolean isEmpty(){
        return  top == null;
    }

    public void push(T item){
        top = new Node<>(item,top);
    }

    public T pop(){
        if (!isEmpty()){
            T temp = top.value;
            top = top.next;
            return  temp;


        }
        throw new IllegalStateException("Stack Underflow - No items can be popped");
    }

    public T peek(){
        if (!isEmpty()){
            return top.value;
        }
        throw new IllegalStateException("Stack underflow - no items can be peeked or viwed");
    }

    @Override
    public String toString(){
        StringBuilder output = new StringBuilder();
        Node<T> current = top;
        while (current != null){
            output.append(current.value);
            if (current != null){
                output.append(",");
            }
            current = current.next;
        }
        return output + "]";
    }
}
