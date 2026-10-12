package Classinterface;

public class Child extends Parent implements Interface{
	public int StringAdd(int a,int b) {
		return a+b;
	}
	
public void Stringlen(String name) {
	System.out.println(name.length());
}
}
