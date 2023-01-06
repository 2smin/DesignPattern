package _3_behavioral_pattern.IteratorPattern.Sample1;

import java.util.*;

public class Board {

    private List<Post> postList = new ArrayList<>();

    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }


    public void addPost(Post post){
        postList.add(post);
    }

    public Iterator<Post> defaultIterator(){
        Iterator<Post> iterator = postList.listIterator();
        return iterator;
    }

    public Iterator<Post> decreaseIterator(){
        return new DecreaseIterator(getPostList());
    }


    public class DecreaseIterator implements Iterator<Post>{

        private Iterator<Post> it;

        public DecreaseIterator(List<Post> postList){
            Collections.sort(postList, new Comparator<Post>() {
                @Override
                public int compare(Post o1, Post o2) {
                    if(o1.getIndex() < o2.getIndex()){
                        return 1;
                    }
                    return -1;
                }
            });

            this.it = postList.iterator();
        }

        @Override
        public boolean hasNext() {
            return it.hasNext();
        }

        @Override
        public Post next() {
            return it.next();
        }
    }
}
