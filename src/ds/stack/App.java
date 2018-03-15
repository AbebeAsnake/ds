package ds.stack;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack theStack = new Stack(10);
theStack.push('A');
theStack.push('B');
theStack.push('C');
theStack.push('D');
while(!theStack.isEmpty()) {
	char value = theStack.pop();
	
	System.out.println(value);
}
System.out.println(reverseString("HELLO"));
	}
	
public static String reverseString(String str) {
int stackSize = str.length();//get the max stack size
Stack theStack = new Stack(stackSize);// we make the stack

for(int j=0;j<str.length();j++) {
	char ch = str.charAt(j);
	theStack.push(ch);
}
String result = "";
while(!theStack.isEmpty()) {
	char ch = theStack.pop();
	result = result + ch;
}
return result;
	}

}
