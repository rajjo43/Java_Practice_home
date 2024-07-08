package self_study;

class Value{
	private int a;  //data hiding
    public void setvalue(int x) { //data abstraction
		a=x;
	}
    public int getvalue() {
		return ++a;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		Value obj = new Value();
		obj.setvalue(43);
		System.out.println(obj.getvalue());

	}

}
