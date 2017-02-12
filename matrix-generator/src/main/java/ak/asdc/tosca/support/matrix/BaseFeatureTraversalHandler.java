package ak.asdc.tosca.support.matrix;

/**
 * Created by ak435s on 2/9/2017.
 */
public class BaseFeatureTraversalHandler implements FeatureTraversalHandler {
    @Override
    public void onFeatureStart(Feature feature) {
        System.out.println("onFeatureStart: " + feature.getName());
    }

    @Override
    public void onFeatureEnd(Feature feature) {
        System.out.println("onFeatureEnd: " + feature.getName());
    }
}
