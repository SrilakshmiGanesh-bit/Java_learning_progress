package Stringsnfmethod;
//String and math methods
public class Main {
	public static void main(String[] args) {
		String name="shree";
		String names="shree";
		String s1=" ";
		System.out.println(name.codePointAt(0));
		System.out.println(name.charAt(4));
		System.out.println(name.concat(" lakshmi"));
		System.out.println(name.replaceAll("e", "a"));// it works based on reged
		System.out.println(name.replace("a", "e"));// it works based on data
		System.out.println(name.replaceFirst("e", "a"));
		System.out.println(name.repeat(5));
		System.out.println(name.contains("e"));
		System.out.println(name.substring(2,5));
		System.out.println(name.trim());
		System.out.println(name.compareToIgnoreCase(names));
		System.out.println(name.equals(names));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.compareTo(names));
		System.out.println("blank "+s1.isBlank());// not blank;// only checks letter present or not, does not consider space as letter
		System.out.println(name.isEmpty());// not empty atleast something present or not it checks atleast space, it consider spac a s letter	
		System.out.println(name.matches(names));//
		System.out.println(name.equals(names));//
		String replaceg="123 is my lucky num";
		System.out.println();
		
		
		// math method
		System.out.println(Math.PI);
		System.out.println(Math.E);
		System.out.println(Math.abs(-3));// neg to pos
		System.err.println("floor"+Math.floor(5.9));// 0.0-0.9 shows the small num
		System.out.println(Math.round(5.5)); //0.0to 0.4 shows the small after next num
		System.out.println(Math.ceil(5.9));// from 0.0 to 0.9 it shows the big num 
		System.out.println(Math.random());
		System.out.println(Math.floor(Math.random()*5));
		System.out.println(Math.min(5, 10));
		System.out.println(Math.max(10, 100));
		System.out.println(Math.addExact(5, 25));
		System.out.println(Math.pow(2, 5));
		System.out.println(Math.addExact(5,4));
		//powexact is not working in  my java rectify it ...
		
		
	}

}
