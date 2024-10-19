
class Interpreter {
    public static Expression parse(String expression) {
        String[] tokens = expression.split(" ");
        Expression result = new NumberExpression(Integer.parseInt(tokens[0]));
        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            Expression next = new NumberExpression(Integer.parseInt(tokens[i + 1]));
            result = new OperationExpression(result, next, operator);
        }
        return result;
    }

}
