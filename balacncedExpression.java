import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String exe = scn.nextLine();
        
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<exe.length();i++){
            char ch = exe.charAt(i);
            if(exe.charAt(i)=='('||exe.charAt(i)=='{'||exe.charAt(i)=='['){
                st.push(ch);
            }
            else if(ch==')'){
                if(st.size()==0|| st.peek()!='('){
                    System.out.print("false");
                    return ;
                }
                else{
                    st.pop();
                }
            }
            else if(ch=='}'){
                if(st.size()==0|| st.peek()!='{'){
                    System.out.print("false");
                    return ;
                }else{
                    st.pop();
                }
                
            }
            else if(ch==']'){
            if(st.size()==0|| st.peek()!='['){
                System.out.print("false");
                    return ;
                }
                else{
                    st.pop();
                }
            }
            
            
            
        }
        
        if (st.size() == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
       
        

    }
