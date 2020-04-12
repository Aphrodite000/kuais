import java.util.*;
public class Solution {
    /*
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack<Character> stack=new Stack<>();
        int a=0;
        int b=0;
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
                b++;
            }
            if(s.charAt(i)==')'){
                if(!stack.isEmpty()){
                    stack.pop();
                    a++;
                    b--;

                }else{
                    c++;

                }
            }
        }
        //b=stack.size();
        System.out.println(a+" "+b+" "+c);
    }
    */
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int m=sc.nextInt();
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(i);
        }
        int j=k-1;//k值的下标  j就是报数为1的元素下标
        while(!list.isEmpty()){
            if(j+m-1>list.size()-1){//j>list.size
                j=j+m-1-list.size()-1-1;

            }else{
                j=j+m-1;
            }
            list.remove(new Integer(list.get(j)));
            //j=m+1;
            //j=j+m-1;
            if(list.size()==1){
                break;
            }
        }
        System.out.println(list.get(0));
    }
}

