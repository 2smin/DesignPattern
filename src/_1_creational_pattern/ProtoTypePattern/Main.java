package _1_creational_pattern.ProtoTypePattern;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {


        _1_creational_pattern.ProtoTypePattern.GithubRepository githubRepository = new _1_creational_pattern.ProtoTypePattern.GithubRepository();
        githubRepository.setRepoNum("123");
        githubRepository.setUser("2smin");

        _1_creational_pattern.ProtoTypePattern.GithubIssue githubIssue = new _1_creational_pattern.ProtoTypePattern.GithubIssue();
        githubIssue.setIssueName("mainIssue");
        githubIssue.setMessage("issue occured");
        githubIssue.setGithubRepository(githubRepository);


        System.out.println(githubIssue.toString());

        _1_creational_pattern.ProtoTypePattern.GithubIssue githubIssue1 = (_1_creational_pattern.ProtoTypePattern.GithubIssue) githubIssue.clone();

        System.out.println(githubIssue == githubIssue1);
        System.out.println(githubIssue.equals(githubIssue1));
        System.out.println(githubIssue.getClass()==githubIssue1.getClass());
        System.out.println(githubIssue.getGithubRepository() == githubIssue1.getGithubRepository());
    }
}
