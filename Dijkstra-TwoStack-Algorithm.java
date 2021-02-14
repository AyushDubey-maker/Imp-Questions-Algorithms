import java.util.Scanner;
import java.util.Stack;

public class dijkstraTwoStackAlgorithm {

	private static final String StdIn = null;

	public static void main(String[] args) {
		Stack<Double> vals=new Stack<Double>();
		Stack<String> ops=new Stack<String>();
		 Scanner scanner = new Scanner(System.in);
		{
			String s=StdIn.toString();
			if (s.equals("(")) {
				
			}
			else if(s.equals("+")) {
				ops.push(s);
			}
			else if(s.equals("*")) {
				ops.push(s);
			}
			else if(s.equals(")")) {
				String op=ops.pop();
				if(op.equals("+")) {
					vals.push(vals.pop()+vals.pop());
					
				}
				else if(op.equals("*")){
					vals.push(vals.pop()*vals.pop());
				}
				else {
					vals.push(Double.parseDouble(s));
					
				}
				System.out.println(vals.pop());
			}
			
		}

	}

}
