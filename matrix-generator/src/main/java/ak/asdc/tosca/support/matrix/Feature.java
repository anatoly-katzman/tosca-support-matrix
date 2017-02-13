package ak.asdc.tosca.support.matrix;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ak435s on 2/9/2017.
 */



/*

Matrix building logic:

Traverse containment:
    - on start (context-path, matrix):
        -- push the local feature name to the path
        -- get the full feature name
        -- matrix += full name
        -- create a sub-matrix
        -- traverse inheritance ???????
            <-- full name of the current node
            --> matrix of inherited features
        -- merge the inherited matrix to the Matrix

    - on end:
        -- pop name of the path


Traverse inheritance:
    - on start
        -- traverse containment
    - on end


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

    public Map<String, Feature> getContainedFeatures() {
        return containedFeatures;
    }

    public Feature getContainedFeature(String featureName) {
        return containedFeatures.get( featureName);
    }

    public Map<String, Feature> getInheritedFeatures() {
        return inheritedFeatures;
    }

    public String getName() {
        return name;
    }
}
