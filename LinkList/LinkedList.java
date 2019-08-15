package LinkList;

import java.util.Comparator;

public class LinkedList<E> {

    private Node<E> head; //머리노드
    private Node<E> crnt; //선택노드 -> 검색한 노드를 선택 후 삭제하는 등의 용도
    /**
     * hexad == null -> 노드가 하나도 없는 상태에서 리스트가 비어있는지 판단함
     * head.next == null -> 노드가 1개뿐인지 판단
     * head.net.next == null -> 노드가 2개인지 판단
     * p.next == null -> Node<E>형의 변수 p가 가리키는 노드가 꼬리노드인지 확인
     */

    public LinkedList() {
        head=crnt=null; //연결 리스트가 비어 있는지 확인
    }

    //노드 검색
    public E search(E obj, Comparator<? super E> c) {
        Node<E> ptr=head; //현재 스캔 중인 노드를 가리키는 변수 ptr을 head로 초기화

        while(ptr != null) { //위의 조건에 따라 return 결정됨
            if(c.compare(obj, ptr.data)==0) { //검색 성공
                crnt=ptr;
                return ptr.data;
            }
            ptr=ptr.next; //다음 노드를 선택
        }
        return null; //검색 실패
    }

    public void addFirst(E obj) {
        Node<E> ptr=head; //삽입 전의 머리 노드에 대한 포인터를 ptr에 대입
        head=crnt=new Node<E>(obj, ptr); //new Node<E>(obj, ptr)를 통해 추가할 노드가 생성됨
    }

    public void addLast(E obj) {
        if(head==null) { //리스트가 비어있으면
            addFirst(obj); //머리에 삽입
        }
        else {
            Node<E> ptr=head;
            while(ptr.next != null) ptr=ptr.next; //끝날시 ptr은 꼬리노드를 가리킴
            ptr.next=crnt=new Node<E>(obj, null);
        }
    }

    //머리 노드 삭제
    public void removeFist() {
        if(head != null) head=crnt=head.next;
    }

    //꼬리 노드 삭제
    public void removeLast() {
        if(head != null) {
            if(head.next == null) removeFist(); //노드가 하나만 있을 시 머리노드 삭제
            else {
                Node<E> ptr=head; //스캔중인 노드
                Node<E> pre=head; //위 노드의 앞 노드

                while(ptr.next != null) {
                    pre=ptr;
                    ptr=ptr.next;
                }

                pre.next=null; //삭제 후의 꼬리노드를 null로 설정
                crnt=pre;
            }
        }
    }

    public void remove(Node<E> p) {
        if(head != null) {
            if(p==head) removeFist();
        }
        else {
            Node<E> ptr=head;

            while(ptr.next!=p) {
                ptr=ptr.next;
                if(ptr==null) return;
            }
            ptr.next=p.next;
            crnt=ptr;
        }
    } 

    //선택노드 삭제
    public void removeCurrentNode() {
        remove(crnt);
    }

    //모든 노드 삭제
    public void clear() {
        while(head != null) removeFist();
        crnt=null;
    }

    //선택 노드를 한칸 뒤로 이동
    public boolean next() {
        if(crnt==null || crnt.next==null) return false; //이동불가
        crnt=crnt.next;
        return true;
    }

    //선택 노드 출력
    public void printCurrentNode() {
        if(crnt==null) System.out.println("???");
        else System.out.println(crnt.data);
    }

    public void dump() {
        Node<E> ptr=head;

        while(ptr != null) {
            System.out.println(ptr.data);
            ptr=ptr.next;
        }
    }
}