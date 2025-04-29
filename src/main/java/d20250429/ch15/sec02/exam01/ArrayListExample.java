package d20250429.ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Board> list = new ArrayList<>();

        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));
        list.add(new Board("제목4", "내용4", "글쓴이4"));
        list.add(new Board("제목5", "내용5", "글쓴이5"));

        System.out.println("ArrayList에 저장된 요소의 개수: " + list.size());
        System.out.println();

        System.out.println(list.get(2).getSubject() + "\t"
                + list.get(2).getContent() + "\t"
                + list.get(2).getWriter());
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getSubject() + "\t"
                    + list.get(i).getContent() + "\t"
                    + list.get(i).getWriter());
        }
        System.out.println();

        list.remove(2);
        list.remove(2);

        for (Board b : list) {
            System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
        }
    }
}
