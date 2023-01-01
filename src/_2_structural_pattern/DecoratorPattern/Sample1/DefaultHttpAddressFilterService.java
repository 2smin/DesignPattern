package _2_structural_pattern.DecoratorPattern.Sample1;

public class DefaultHttpAddressFilterService implements HttpAddressFilterService {
    @Override
    public String getAddress(String address) {
        return address;
    }

}
