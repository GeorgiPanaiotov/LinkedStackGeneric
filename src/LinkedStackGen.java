import java.awt.dnd.InvalidDnDOperationException;

public class LinkedStackGen<T> {

    public Node<T> Head;
    public int Count;

    public void Push(T input){
        if(Count == 0){
            Head = new Node<>(input);
        }
        else{
            Node oldHead = this.Head;
            this.Head = new Node<>(input);
            this.Head.Next = oldHead;
        }
        Count++;
    }

    public T Pop(){
        if(Count == 0){
            throw new InvalidDnDOperationException();
        }
        T oldHead = this.Head.Value;
        this.Head = this.Head.Next;

        return oldHead;
    }

    public T Peek(){
        if(Count == 0){
            throw new InvalidDnDOperationException();
        }
        T current = this.Head.Value;

        return current;
    }
}
