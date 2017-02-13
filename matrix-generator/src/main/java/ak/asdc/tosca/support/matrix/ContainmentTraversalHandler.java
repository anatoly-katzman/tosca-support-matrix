package ak.asdc.tosca.support.matrix;

/**
 * Created by ak435s on 2/12/2017.
 */
public class ContainmentTraversalHandler extends BaseFeatureTraversalHandler {
    private FeaturePath contextPath;
    private FeaturesMatrix featuresMatrix;

    public ContainmentTraversalHandler(FeaturePath contextPath, FeaturesMatrix featuresMatrix) {
        this.contextPath = contextPath;
        this.featuresMatrix = featuresMatrix;
    }

    @Override
    public void onFeatureStart(Feature feature) {
        super.onFeatureStart(feature);
        contextPath.push(feature.getName());
        featuresMatrix.add(contextPath, feature);
    }

    @Override
    public void onFeatureEnd(Feature feature) {
        super.onFeatureEnd(feature);
        contextPath.pop();
    }

    public FeaturesMatrix getFeaturesMatrix() {
        return featuresMatrix;
    }
}
