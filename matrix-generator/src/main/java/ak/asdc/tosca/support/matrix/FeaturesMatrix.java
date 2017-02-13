package ak.asdc.tosca.support.matrix;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ak435s on 2/12/2017.
 */
public class FeaturesMatrix {
    private Map<FeaturePath, Feature> features = new LinkedHashMap<>();

    public List<String> asStrings() {
        List<String> result = new ArrayList<>();
        for (FeaturePath featurePath : features.keySet()) {
            result.add (featurePath.asString());
        }
        return result;
    }

    public void add (FeaturePath path, Feature feature) {
        features.put( path, feature);
    }
}
