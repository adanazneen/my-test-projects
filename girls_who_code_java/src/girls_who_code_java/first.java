package girls_who_code_java; // remove this if you give this code to anyone else OTHERWISE IT WON'T WORK

public class first {
	
	public static void main(String[] args) {
		
		Animal myanimal = new Animal("elephant");
		System.out.println(myanimal);
		
		Animal myanimal2 = new Animal(" ");
		//myanimal2.name = "cat";
		myanimal2.setName("cat");
		System.out.println(myanimal2.getName());
		
	}
}

class Animal {
	private String name;
	public Animal(String _name) {
		this.name = _name;
	}
	public String toString()
	{
		return this.name;
	}
	
	public void setName(String thing) {
		this.name = thing;
		
	}
	
	public String getName() {
		return this.name;

	}
	
}