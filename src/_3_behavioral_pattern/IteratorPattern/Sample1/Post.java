package _3_behavioral_pattern.IteratorPattern.Sample1;

public class Post {

    private int index;
    private String context;

    public Post(int index, String context) {
        this.index = index;
        this.context = context;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
