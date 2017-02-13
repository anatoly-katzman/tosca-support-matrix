package ak.asdc.tosca.support.matrix;

import java.util.Map;

/**
 * Created by ak435s on 2/9/2017.
 */
public class InheritedTraversal {
    private FeatureTraversalHandler traversalHandler;

    public InheritedTraversal(FeatureTraversalHandler traversalHandler) {
        this.traversalHandler = traversalHandler;
    }

    public void traverse( Feature feature) {
        traversalHandler.onFeatureStart( feature);
        traverseInheritedFeatures(feature);
        traversalHandler.onFeatureEnd( feature);
    }

    private void traverseInheritedFeatures(Feature feature) {
        Map<String, Feature> inheritedFeatures = feature.getInheritedFeatures();
        for (Feature inheritedFeature : inheritedFeatures.values()) {
            traverse (inheritedFeature);
        }
    }
}
