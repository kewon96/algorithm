package LinkList;

import java.util.Comparator;
import java.util.Scanner;

public class LinkedListTester {
    static Scanner sc = new Scanner(System.in);
    
    static class Data{
        static final int NO=1;
        static final int NAME=2;

        private Integer no;
        private String name;

        //문자열로 받음
        public String toString() {
            return "("+no+")"+name;
        }
        
        //데이터 입력
        public void scanData(String guide, int sw) {
            System.out.println(guide+"할 데이터를 입려하세요");

            if((sw & NO)==NO) {
                System.out.print("번호 : ");
                no=sc.nextInt();
            }

            if((sw & NAME)==NAME) {
                System.out.print("이름 : ");
                name=sc.next();
            }
        }

        //회원번호로 순서를 매기는 comparator
        public static final Comparator<Data> NO_ORDER = new NoOrderComparator();

        public static class NoOrderComparator implements Comparator<Data> {
            public int compare(Data d1, Data d2) {
                return (d1.no>d2.no) ? 1 : (d1.no<d2.no) ? -1 : 0;
            }
        }

        //이름으로 순서를 매기는 comparator
        public static final Comparator<Data> NAME_ORDER = new NameOrderComparator();

        public static class NameOrderComparator implements Comparator<Data> {
            public int compare(Data d1, Data d2) {
                return d1.name.compareTo(d2.name);
            }
        }
    }

    //메뉴 열거형
    enum Menu {
        ADD_FIRST("머리 노드 삽입"),
        ADD_LAST("꼬리 노드 삽입"),
        RMV_FIRST("머리 노드 삭제"),
        RMV_LAST("꼬리 노드 삭제"),
        CLEAR("모든 노드를 삭제"),
        SEARCH_NO("번호로 검색"),
        SEARCH_NAME("이름으로 검색"),
        NEXT("선택 노드로 이동"),
        PRINT_CRNT("선택 노드를 출력"),
        DUMP("모든 노드를 출력"),
        TERMINATE("종료");

        private final String message; //출력할 문자열

        static Menu MenuAt(int idx) { //서수가 idx인 열거를 반환
            for(Menu m : Menu.values()) {
                if(m.ordinal()==idx) return m;
            }

            return null;
        }

        Menu(String message) {
            this.message=message;
        }

        public String getMessage() {
            return message;
        }
    }

    //메뉴 선택
    static Menu SelectMenu() {
        int key;
        do {

        }while(key<Menu.ADD_FIRST.ordinal() || key>Menu.TERMINATE.ordinal());
    }
}