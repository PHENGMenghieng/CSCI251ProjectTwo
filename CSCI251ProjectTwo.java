/*
 * CSCI251ProjectTwo: Use MyStack and MyQueue to write a project that check if a sentence is palindrome
 * Hieng
 * CSCI 251 Project Two
 */
import java.util.Scanner;

public class CSCI251ProjectTwo
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        String sentence;
        String again;
        do{
            System.out.println("Enter a sentence, I will tell you if it is a palindrome: ");
            sentence = input.nextLine();
            if(isPalindrome(sentence))
                System.out.println("\"" + sentence + "\" is a palindrome!");
            else
                System.out.println("\"" + sentence + "\" is not a palindrome!");
            System.out.println("Do you want another test (\"YES\" or \"NO\"): ");
            again = input.nextLine();
        }while(again.equalsIgnoreCase("YES"));
        
    }
    
    public static boolean isPalindrome(String sentence)
    {
        MyStack<Character> s = new MyStack<Character>();
        MyQueue<Character> q = new MyQueue<Character>();
        for(int i = 0; i < sentence.length(); i++)
        {
            char c = sentence.charAt(i);
            if(Character.isLetter(c))
            {
                c = Character.toUpperCase(c);
                s.push(c); 
                q.push(c); 
            }
        }
        while(!s.isEmpty()){

            if(!q.peek().equals(s.peek()))
                return false;
            s.pop();
            q.pop();
        }
        return true;
    }
}
