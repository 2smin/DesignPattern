package _2_structural_pattern.DecoratorPattern.Decorator;


import _2_structural_pattern.DecoratorPattern.HttpAddressFilterService;

public class HttpAddressFilterDecorator implements HttpAddressFilterService {

    private HttpAddressFilterService httpAddressFilterService;

    public HttpAddressFilterDecorator(HttpAddressFilterService httpAddressFilterService) {
        this.httpAddressFilterService = httpAddressFilterService;
    }

    @Override
    public String getAddress(String address) {
        return httpAddressFilterService.getAddress(address);
    }
}
