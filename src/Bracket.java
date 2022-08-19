import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        Stack<String> bracketStack=new Stack<>();
        String operation="(– b + (b2 – 4*a*c)^0.5) / 2*a    ";
        String operationWithoutSpace=operation.replaceAll(" ","");
        String [] operationArray=operationWithoutSpace.split("");

        boolean isWell=true;
        for (String sym:operationArray) {
            if(sym.equals("(")) bracketStack.push(sym);
            if(sym.equals(")")) {
                if(bracketStack.isEmpty()) {
                    isWell=false;
                    break;
                } else bracketStack.pop();
            }
        }
        if(!bracketStack.isEmpty()) isWell=false;
        if(isWell) System.out.println("Use bracket well!");
        else System.out.println("Use bracket badly");
    }
}
