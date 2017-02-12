package ak.asdc.tosca.support.matrix;

/**
 * Created by ak435s on 2/9/2017.
 */
public class FeatureTraversal {
    private Feature root;
    private FeatureTraversalHandler handler;

    public FeatureTraversal(Feature root, FeatureTraversalHandler handler) {
        this.root = root;
        this.handler = handler;
    }

    public void traverse() {

    }
}
