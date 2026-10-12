package AccessModifiers;
// public can call in different package  same packages diff class diff packae diff classes
public class Subclass extends Publicclass{
	public void Collect() {
		// name is already defined as public so we can reassign
		name="kumar";
		System.out.println("name: "+name);
		
	}

}
