package _2_structural_pattern.AdapterPattern.Sample1;

public class LoginHandler {

    public LoginHandler(UserDetailService userDetailService) {
        this.userDetailService = userDetailService;
    }

    UserDetailService userDetailService;

    public boolean login(String userName, String password){

        UserDetail userDetail = userDetailService.loadUser(userName);

        if(userDetail.getPassword().equals(password)){
            return true;
        }else{
            return false;
        }
    }
}
