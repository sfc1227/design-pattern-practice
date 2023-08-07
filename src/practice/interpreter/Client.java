package practice.interpreter;

public class Client {

    // "Robert"와 "John" expression을 Or로 연결한 expression
    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
    
        return new OrExpression(robert, john);
    }

    // "Julie"와 "Married" expression을 And로 연결한 expression
    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main (String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        // OrExpression
        Context ic = new Context("John");
        System.out.println("John is male? " + isMale.interpret(ic));
        
        // AndExpression
        Context ic2 = new Context("Married Julie");
        System.out.println("Julie is a married women? " + isMarriedWoman.interpret(ic2));

        // OrExpression
        Context ic3 = new Context("Lucy");
        System.out.println("Lucy is male? " + isMale.interpret(ic3));
    }
}
