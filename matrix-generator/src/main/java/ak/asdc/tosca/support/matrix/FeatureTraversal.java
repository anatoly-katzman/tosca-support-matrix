package ak.asdc.tosca.support.matrix;

/**
 * Created by ak435s on 2/9/2017.
 */
public class FeatureTraversal {
    private Feature feature;
    private FeatureTraversalHandler containmentTraversalHandler;
    private FeatureTraversalHandler inheritanceTraversalHandler;

    public FeatureTraversal(Feature root,
                            FeatureTraversalHandler containmentTraversalHandler,
                            FeatureTraversalHandler inheritanceTraversalHandler) {
        this.feature = root;
        this.containmentTraversalHandler = containmentTraversalHandler;
        this.inheritanceTraversalHandler = inheritanceTraversalHandler;
    }

    public void traverse() {
        traverseInheritance();
        traverseContainment();
    }

    private void traverseContainment() {
        containmentTraversalHandler.onFeatureStart( feature);
        traverseInheritance();
        containmentTraversalHandler.onFeatureEnd( feature);
    }

    private void traverseInheritance() {
        inheritanceTraversalHandler.onFeatureStart( feature);
        inheritanceTraversalHandler.onFeatureEnd( feature);
    }
}
