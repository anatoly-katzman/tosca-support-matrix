package ak.asdc.tosca.support.matrix;

/**
 * Created by ak435s on 2/12/2017.
 */
public class InheritanceTraversalHandler extends BaseFeatureTraversalHandler {

    private FeaturePath contextPath;
    private FeaturesMatrix featuresMatrix;

    public InheritanceTraversalHandler(FeaturePath contextPath, FeaturesMatrix featuresMatrix) {
        this.contextPath = contextPath;
        this.featuresMatrix = featuresMatrix;
    }

    @Override
    public void onFeatureStart(Feature feature) {
        super.onFeatureStart(feature);
    }

    @Override
    public void onFeatureEnd(Feature feature) {
        super.onFeatureEnd(feature);
    }
}
