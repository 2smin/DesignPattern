package _3_behavioral_pattern.IteratorPattern.Sample1;

import java.util.Iterator;

public class Client {

    /*
    iterator pattern
    client에서 class의 내부 구조를 몰라도 iterator를 통해 item을 꺼내올수 있게 한다
    클래스 내에 iterator를 포함시켜서 메서드로 제공해준다.
    커스텀 sortingd을 위해 iterator로 next() 구현가능

     */
    public static void main(String[] args) {

        Post post1 = new Post(1,"index1");
        Post post2 = new Post(2,"hello world");
        Post post3 = new Post(3, "THIS IS TESTCODE");

        Board board = new Board();
        board.addPost(post1);
        board.addPost(post2);
        board.addPost(post3);

        Iterator<Post> it = board.defaultIterator();
        while (it.hasNext()){
            System.out.println(it.next().getContext());
        }

        System.out.println("=================");

        Iterator<Post> decIt = board.decreaseIterator();
        while(decIt.hasNext()){
            System.out.println(decIt.next().getContext());
        }
    }
}
