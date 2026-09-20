package DataStructures.LegacyVsNew;

import java.util.Scanner;
import java.util.Stack;

/*

 */

public class StackExample {
    public static void main(String[] args){
        Stack<Character> bracket = new Stack<Character>();
        Scanner sc = new Scanner(System.in);
        boolean palindrome = false;
        String input= sc.next();
        input = input.trim();
        char[] splitInput = input.toCharArray();
        for(int i =0; i < input.length(); i++){
            if(splitInput[i] == '(') {
                bracket.push('(');
            }else if (splitInput[i]=='{') {
                bracket.push('{');
            }else if (splitInput[i]=='[') {
                bracket.push('[');
            }else if (splitInput[i]==')') {
                if(bracket.empty()){
                    bracket.push(')');
                    palindrome=false;
                }else if (bracket.peek() == '(') {
                    bracket.pop();
                    //palindrome=true;
                }else {
                    palindrome = false;
                }
            }else if (splitInput[i]=='}') {
                if (bracket.empty()) {
                    bracket.push('}');
                    palindrome = false;
                } else if (bracket.peek() == '{') {
                    bracket.pop();
                   // palindrome = true;
                } else {
                    palindrome = false;
                }
            }else if (splitInput[i]==']') {
                if (bracket.empty()) {
                    bracket.push(']');
                    palindrome = false;
                } else if (bracket.peek() == '[') {
                    bracket.pop();
                    //palindrome = true;
                } else {
                    palindrome = false;
                }
            }
        }
        if(bracket.isEmpty()){

            System.out.println("true" + bracket.size());
        }else {
            System.out.print("false");
            System.out.println(bracket.size());
        }
    }
}
