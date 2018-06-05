import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.next();
        ArrayList<String> str=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='+' || s.charAt(i)=='-'|| s.charAt(i)=='*'|| s.charAt(i)=='/'){
                int j=s.indexOf(s.charAt(i));
                String hours = s.substring(0, j);
                String minute =s.substring(j + 1);
                str.add(hours);
                str.add(" "+s.charAt(i));
                s=minute; 
                i=0;  
        }
    }
            str.add(s);
        evalRPN(str);
       }

    public static void evalRPN(ArrayList<String> tokens) {
        int returnValue = 0;
        String c;
        Stack<String> stack = new Stack<String>();
        for (int i=0;i<tokens.size();i++) {
            if (!(tokens.get(i)==" +" ||tokens.get(i)==" -" ||tokens.get(i)==" *" ||tokens.get(i)==" /"  )) {
                System.out.print(tokens.get(i));
            }  
              else{ switch (tokens.get(i)) {
                    case " +":
                        if(!stack.empty()&&(stack.peek()==" -" ||  stack.peek()==" *" || stack.peek()==" /")){
                            System.out.print(tokens.get(i));
                            c=stack.pop();
                        }
                        else
                            stack.push(tokens.get(i));  
                        break;
                    case " -":
                        if(!stack.empty()&&( stack.peek()==" +" || stack.peek()==" *" || stack.peek()==" /")){
                            System.out.print(tokens.get(i));
                        }
                        else
                            stack.push(tokens.get(i)); 
                        break;
                    case " *":
                        if(!stack.empty()&&(stack.peek()==" +" || stack.peek()==" -")){
                            stack.push(tokens.get(i)); 
                            
                        }
                        break;
                    case " /":
                        if(!stack.empty()&&(stack.peek()==" +" || stack.peek()==" -")){
                            c=stack.pop();
                            System.out.print(c);
                        }
                        break;
                }
            }
        }   
    }
    //returnValue = Integer.valueOf(stack.pop());
    //return returnValue;
}