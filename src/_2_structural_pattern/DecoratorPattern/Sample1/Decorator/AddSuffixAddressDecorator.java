package _2_structural_pattern.DecoratorPattern.Sample1.Decorator;

import _2_structural_pattern.DecoratorPattern.Sample1.HttpAddressFilterService;

public class AddSuffixAddressDecorator extends HttpAddressFilterDecorator{

    public AddSuffixAddressDecorator(HttpAddressFilterService httpAddressFilterService) {
        super(httpAddressFilterService);
    }

    @Override
    public String getAddress(String address) {
        return super.getAddress(addSuffix(address));
    }

    public String addSuffix(String address){
        return address + "//SUFFIX-SAMPLE";
    }
}
