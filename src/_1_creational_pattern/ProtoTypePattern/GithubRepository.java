package _1_creational_pattern.ProtoTypePattern;

public class GithubRepository {

    private String user;
    private String repoNum;

    @Override
    public String toString() {
        return "GithubRepository{" +
                "user='" + user + '\'' +
                ", repoNum='" + repoNum + '\'' +
                '}';
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getRepoNum() {
        return repoNum;
    }

    public void setRepoNum(String repoNum) {
        this.repoNum = repoNum;
    }
}
