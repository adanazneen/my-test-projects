package girls_who_code_java;

public class LearningObjects {

	public static void main(String[] args) {
//	int9 name = 25;
//	String thing = "hello";
//	boolean boo = true;
	adder something = new adder();
	adder something2 = new adder("hi life");
	int happy = something.add(1,2);
	System.out.println(happy);
	System.out.println(something.serialnum);
	System.out.println(something2.serialnum);
	
	}
// we need to talk about public vs private. get into mutators
}
class adder {
	public String serialnum;
	public adder(String _serialnum) {
		System.out.println("the contructor ran");
		serialnum = _serialnum;
	}
	public adder() {
	}
	public int add(int a, int b) {
		return a+b;
	}
}
