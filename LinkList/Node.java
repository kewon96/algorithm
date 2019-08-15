package LinkList;

public class Node<E> {
    E data; //데이터
    Node<E> next; //다음 노드 참조

    //생성자
    Node(E data, Node<E> next) {
        this.data=data;
        this.next=next;
    }

    // public void setData(E data) {
    //     this.data=data;
    // }

    // public E getData() {
    //     return data;
    // }

    // public void setNext(Node<E> next) {
    //     this.next=next;
    // }

    // public Node<E> getNext() {
    //     return next;
    // }
}