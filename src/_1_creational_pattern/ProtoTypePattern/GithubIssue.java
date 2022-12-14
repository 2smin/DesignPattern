package _1_creational_pattern.ProtoTypePattern;

import java.util.Objects;

public class GithubIssue implements Cloneable{

    private int issueNum;

    private String issueName;

    private String message;

    private _1_creational_pattern.ProtoTypePattern.GithubRepository githubRepository;

    public int getIssueNum() {
        return issueNum;
    }

    public void setIssueNum(int issueNum) {
        this.issueNum = issueNum;
    }

    @Override
    public String toString() {
        return "GithubIssue{" +
                "issueNum=" + issueNum +
                ", issueName='" + issueName + '\'' +
                ", message='" + message + '\'' +
                ", githubRepository=" + githubRepository +
                '}';
    }

    public String getIssueName() {
        return issueName;
    }

    public void setIssueName(String issueName) {
        this.issueName = issueName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public _1_creational_pattern.ProtoTypePattern.GithubRepository getGithubRepository() {
        return githubRepository;
    }

    public void setGithubRepository(_1_creational_pattern.ProtoTypePattern.GithubRepository githubRepository) {
        this.githubRepository = githubRepository;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GithubIssue that = (GithubIssue) o;
        return issueNum == that.issueNum && Objects.equals(issueName, that.issueName) && Objects.equals(message, that.message) && Objects.equals(githubRepository, that.githubRepository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(issueNum, issueName, message, githubRepository);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        _1_creational_pattern.ProtoTypePattern.GithubRepository githubRepository = new _1_creational_pattern.ProtoTypePattern.GithubRepository();
        githubRepository.setRepoNum(this.githubRepository.getRepoNum());
        githubRepository.setUser(this.githubRepository.getUser());

        GithubIssue githubIssue = new GithubIssue();
        githubIssue.setGithubRepository(githubRepository);
        githubIssue.setIssueNum(this.issueNum);
        githubIssue.setIssueName(this.issueName);
        githubIssue.setMessage(this.message);
        return githubIssue;
    }
}
