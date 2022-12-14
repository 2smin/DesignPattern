package AdapterPattern;

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
