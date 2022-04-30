import java.util.Stack;

public class ParenthesesChecker {

    public boolean ArePair (char opening, char closing)

    {
        //If opening and closings are pair:
        if(opening == '(' && closing == ')') return true;
        else if(opening == '{' && closing == '}') return true;
        else if(opening == '[' && closing == ']') return true;
        else return opening == '<' && closing == '>';
        //otherwise false
    }
    //method to check parentheses
    public boolean checkParentheses(String string) {

        //declaring the stack
        Stack<Character> StackOfC = new Stack<>();

        //traversing the string
        for (int i = 0; i < string.length(); i++) {

            //c = value at particular index when looping
            char c = string.charAt(i);

            if (c == '(' || c == '{' || c == '[' || c == '<') {
                //push into stack
                StackOfC.push(c);}

            //if condition above proves false,execute:
             else if (c == ')' || c == '}' || c == ']' || c == '>') {
                //given above 'c' values, there are 2 possible cases

                if (StackOfC.empty() || !ArePair(StackOfC.peek(), c))
                    //if stack empty or, we find that top of stack is not a pair of c,
                    //return false
                    return false;

                //otherwise, we must pop it
                else {

                 StackOfC.pop();

                 }
             }
        }
        // if stack of c is empty, return true, else return false
        return StackOfC.empty();
      }
   }


