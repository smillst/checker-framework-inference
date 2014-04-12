package checkers.inference;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import checkers.inference.model.Constraint;

/**
 * Constraint manager holds constraints that are generated by InferenceVisitor.
 *
 * @author mcarthur
 *
 */
public class ConstraintManager {

    private Set<Constraint> constraints = new HashSet<>();

    public Set<Constraint> getConstraints() {
        return constraints;
    }

    public void add(Constraint constraint) {
        constraints.add(constraint);
    }
}
