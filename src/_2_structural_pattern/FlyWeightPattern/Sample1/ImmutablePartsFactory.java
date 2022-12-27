package _2_structural_pattern.FlyWeightPattern.Sample1;

import java.util.HashMap;
import java.util.Map;

public class ImmutablePartsFactory {

    private Map<String,ImmutableParts> cache = new HashMap<String,ImmutableParts>();

    public ImmutableParts getParts(String pacs){

        if(cache.containsKey(pacs)){
            return cache.get(pacs);
        }else{
            String[] split = pacs.split(":");
            ImmutableParts immutableParts = new ImmutableParts(split[0],split[1]);
            cache.put(pacs,immutableParts);
            return immutableParts;
        }
    }
}
