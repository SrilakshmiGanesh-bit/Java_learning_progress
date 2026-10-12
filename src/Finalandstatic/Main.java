package Finalandstatic;

public class Main {
	public static void main(String[] args) {
		//final
		Final finalclass=new Final();
		finalclass.finalmethod();
		finalclass.finalmethod(5);
		// we can access but not reassign see for example salry in 
		String salary = "55000";
		System.out.println(finalclass.salary);
		
		//static
		Staticclass.team();
		Staticclass.team(5, 8);
		// values can be reaassing only given using globally
		// locally we cannot reassign;
		
		// staticnad final
		// cannot reassing final , but static can reassing but both given togetermeans cannot reasign
		System.out.println(Staticfinalclass.data);
		
		// final sttic example
		
		System.out.println("name is "+Statfinal.name);
		Statfinal.nameslength();
		// override in the static
		Staticoverride over=new Staticoverride();
		over.datas();
		Staticoverride overchild=new Child();
		overchild.datas();
		
		
	}
	// static=> we dont want tot create object to call we can use classname directly
	// we can combine static and final keyword but we can access using class name


}
