package ak.asdc.tosca.support.matrix;

import java.util.Stack;

/**
 * Created by ak435s on 2/12/2017.
 */
public class FeaturePath {
    public static final String PATH_SEPARATOR = "/";

    private Stack<String> names = new Stack<>();

    public FeaturePath() {
    }

    public FeaturePath( FeaturePath context, String localName) {
        names.addAll(context.names);
        names.push( localName);
    }

    public String asString() {
        StringBuilder sb = new StringBuilder();
        for (String name : names) {
            sb.append(PATH_SEPARATOR + name);
        }
        return sb.toString();
    }

    public void push(String name) {
        names.push( name);
    }

    public String pop() {
        return names.pop();
    }
}
