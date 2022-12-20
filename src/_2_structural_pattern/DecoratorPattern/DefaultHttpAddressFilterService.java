package _2_structural_pattern.DecoratorPattern;

public class DefaultHttpAddressFilterService implements HttpAddressFilterService {
    @Override
    public String getAddress(String address) {
        return address;
    }

}
