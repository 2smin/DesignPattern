package _2_structural_pattern.DecoratorPattern.Decorator;

import _2_structural_pattern.DecoratorPattern.HttpAddressFilterService;

public class TrimHttpAddressDecorator extends HttpAddressFilterDecorator{

    public TrimHttpAddressDecorator(HttpAddressFilterService httpAddressFilterService) {
        super(httpAddressFilterService);
    }

    @Override
    public String getAddress(String address) {
        return super.getAddress(trimAddress(address));
    }

    public String trimAddress(String address){
        return address.replace("http://", "");
    }
}
