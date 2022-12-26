package _2_structural_pattern.FacadePattern.Sample1;

public class UserService {

    private UserInfo userInfo;

    public String signUpNewUser(UserInfo userInfo){

        this.userInfo = userInfo;

        if(insertIntoDatabase()){
            return "SUCCESS";
        }else{
            return "FALSE";
        }
    }

    public boolean insertIntoDatabase(){

        String userName = userInfo.getName();
        String password = userInfo.getPassword();

        //custom logic ... pstmt, conn, insert query, commit, close;

        return true;
    }
}
