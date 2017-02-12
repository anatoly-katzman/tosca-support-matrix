package ak.asdc.tosca.support.matrix;

/**
 * Created by ak435s on 2/9/2017.
 */
public class GenerateSupportMatrix {

    private Feature constraints = new Feature("constraint").contains( new String[] {
            "equal", "greater_than", "greater_or_equal", "less_than", "less_or_equal",
            "in_range", "valid_values", "length", "min_length", "max_length", "pattern"
    });

    public static void main(String[] args) {
        new GenerateSupportMatrix().generateMatrix();
    }

    private void generateMatrix() {

        System.out.println("Hi you");
    }
}
