package calc;

import java.util.Map;

public interface Expression {
    //int evaluate(Map<String, Integer> variables);

    //String toString();

    //int rank();
	
	<T> T accept(ExpressionVisitor<T> visitor);
}
