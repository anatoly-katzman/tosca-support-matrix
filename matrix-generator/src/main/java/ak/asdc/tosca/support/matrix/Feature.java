package ak.asdc.tosca.support.matrix;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ak435s on 2/9/2017.
 */
public class Feature {
    private String name;
    private Map<String, Feature> inheritedFeatures = new LinkedHashMap();
    private Map<String, Feature> containedFeatures = new LinkedHashMap<>();

    public Feature(String name) {
        this.name = name;
    }

    public Feature inherits(Feature inheritedFeature) {
        inheritedFeatures.put( inheritedFeature.name, inheritedFeature);
        return this;
    }

    public Feature inherits(List<Feature> inheritedFeatures) {
        for (Feature inheritedFeature : inheritedFeatures) {
            this.inheritedFeatures.put( inheritedFeature.name, inheritedFeature);
        }
        return this;
    }

    public Feature contains(Feature containedFeature) {
        containedFeatures.put( containedFeature.name, containedFeature);
        return this;
    }

    public Feature contains(List<Feature> containedFeatures) {
        for (Feature containedFeature : containedFeatures) {
            this.containedFeatures.put( containedFeature.name, containedFeature);
        }
        return this;
    }

    public Feature contains(String[] containedFeatureNames) {
        for (String containedFeatureName : containedFeatureNames) {
            Feature containedFeature = new Feature( containedFeatureName);
            this.containedFeatures.put( containedFeature.name, containedFeature);
        }
        return this;
    }

    public Feature getContainedFeature(String featureName) {
        return containedFeatures.get( featureName);
    }

    public String getName() {
        return name;
    }
}
