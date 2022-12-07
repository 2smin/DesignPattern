package ProtoTypePattern;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {


        GithubRepository githubRepository = new GithubRepository();
        githubRepository.setRepoNum("123");
        githubRepository.setUser("2smin");

        GithubIssue githubIssue = new GithubIssue();
        githubIssue.setIssueName("mainIssue");
        githubIssue.setMessage("issue occured");
        githubIssue.setGithubRepository(githubRepository);


        System.out.println(githubIssue.toString());

        GithubIssue githubIssue1 = (GithubIssue) githubIssue.clone();

        System.out.println(githubIssue == githubIssue1);
        System.out.println(githubIssue.equals(githubIssue1));
        System.out.println(githubIssue.getClass()==githubIssue1.getClass());
        System.out.println(githubIssue.getGithubRepository() == githubIssue1.getGithubRepository());
    }
}
