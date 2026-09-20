package DataStructures.DataStrucImp;

import java.util.*;
class StackBrackets{
    /*The class can also be referred to as the subclass of Vector.*/

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        boolean palindrome = true;
        String inputValue = null;

        while (sc.hasNext()) {
            Stack<Character> stack = new Stack<Character>();
            String input=sc.next();
            inputValue = input;

            //Complete the code

            char[] charValue = inputValue.toCharArray();
            for(int i=0; i < inputValue.length(); i++){
                if(charValue[i]=='('){
                    stack.push(charValue[i]);
                }else if (charValue[i]=='{'){
                    stack.push(charValue[i]);
                }else if (charValue[i]=='['){
                    stack.push(charValue[i]);
                }else if (charValue[i]==')'){
                    if(stack.empty()){
                        palindrome = false;
                    }else if(stack.peek()=='('){
                        stack.pop();
                    } else {
                        palindrome = false ;
                    }
                }else if (charValue[i]=='}') {
                    if(stack.empty()){
                        palindrome = false;
                    } else if (stack.peek() == '{'){
                        stack.pop();
                    }else {
                        palindrome = false;
                    }
                }else if (charValue[i] == ']'){
                    if(stack.empty()){
                        palindrome = false;
                    } else if (stack.peek() == '['){
                        stack.pop();
                    }else {
                        palindrome = false;
                    }
                }
            }
            if(stack.empty()){
                System.out.println("true");
            }
            else {         System.out.println("false");
            }
        }

    }

}