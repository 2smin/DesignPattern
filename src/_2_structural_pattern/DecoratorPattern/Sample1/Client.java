package _2_structural_pattern.DecoratorPattern.Sample1;

import _2_structural_pattern.DecoratorPattern.Sample1.Decorator.AddSuffixAddressDecorator;
import _2_structural_pattern.DecoratorPattern.Sample1.Decorator.TrimHttpAddressDecorator;

public class Client {

    private static boolean isAddSuffixOn = true;
    private static boolean isTrimAdressOn = false;

    public static void main(String[] args) {

        /*
        기존 기능에 추가로 넣을 기능이 있을 때
        다양한 기능 조합에 대해 여러 class 를 만들고 상속시키기 보다는
        각 기능을 가진 class들을 wrapping 해서 client가 조합할 수 있도록 한다.
         */

        HttpAddressFilterService httpAddressFilterService = new DefaultHttpAddressFilterService();

        if(isAddSuffixOn){
            httpAddressFilterService = new AddSuffixAddressDecorator(httpAddressFilterService);
        }

        if(isTrimAdressOn){
            httpAddressFilterService = new TrimHttpAddressDecorator(httpAddressFilterService);
        }

        String finAdress = httpAddressFilterService.getAddress("http://github.com/2smin");
        System.out.println(finAdress);
    }
}
