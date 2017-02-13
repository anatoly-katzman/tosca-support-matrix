package ak.asdc.tosca.support.matrix;

import java.util.Map;

/**
 * Created by ak435s on 2/9/2017.
 */
public class ContainmentTraversal {
    private FeatureTraversalHandler traversalHandler;

    public ContainmentTraversal(FeatureTraversalHandler traversalHandler) {
        this.traversalHandler = traversalHandler;
    }

    public void traverse( Feature feature) {
        traversalHandler.onFeatureStart( feature);
        traverseContainedFeatures(feature);
        traversalHandler.onFeatureEnd( feature);
    }

    private void traverseContainedFeatures(Feature feature) {
        Map<String, Feature> containedFeatures = feature.getContainedFeatures();
        for (Feature containedFeature : containedFeatures.values()) {
            traverse (containedFeature);
        }
    }
}
