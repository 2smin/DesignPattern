package _2_structural_pattern.FacadePattern.Sample1;

public class Client {

    public static void main(String[] args) {


        UserInfo userInfo = new UserInfo();
        userInfo.setName("LSM");
        userInfo.setUserId("2smin");
        userInfo.setPassword("1234");
        userInfo.setPhoneNumber(0000000000);

        UserService userService = new UserService();

        String result = userService.signUpNewUser(userInfo);

        System.out.println(result);
    }
}

