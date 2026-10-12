package Collections;
import java.util.ArrayList;

public class List {
	//arraylist
	// linkedlist
	//vector
	
	public void ArrayList() {
		// allows duplicates folows index insertion, 
		ArrayList<Integer> arrlist=new ArrayList<>();
		arrlist.add(10);
		arrlist.add(25);
		arrlist.add(35);
		
		System.out.println(arrlist);
		arrlist.set(1, 95);
		System.out.println(arrlist);
		arrlist.remove(0);
		System.out.println(arrlist);
		System.out.println(arrlist.size());
	}
	public void Arraylist2() {
		ArrayList<String> name=new ArrayList<>();
		name.add("Shree");
		name.add("anu");
		name.add("kumar");
		name.add("lakshmi");
		name.add("kumar");
		System.out.println(name.size());
		System.out.println(name);
		name.set(1, "krishna");
		System.out.println(name);
		System.out.println(name.remove(1));
		System.out.println(name);
		System.out.println(name.contains("Shree"));
		System.out.println(name.getFirst());
		System.out.println(name.getLast());
		System.out.println(name.isEmpty());// same as string method
		System.out.println(name.indexOf("kumar"));
		System.out.println(name.lastIndexOf("kumar"));
		name.clear();
		System.out.println(name);
	}
	
	public void stdarraylist() {
		
		
		ArrayList<Studentinfo> student=new ArrayList<>();
		student.add(new Studentinfo("shree",25,"PSR"));
		student.add(new Studentinfo("Lakshmi",23,"psg"));
		System.out.println("name "+student.get(0).getStdname()+"age "+student.get(0).getAge()+" clg "+student.get(0).getClg());
		System.out.println("name "+student.get(1).getStdname()+"age "+student.get(1).getAge()+" clg "+student.get(1).getClg());
		student.set(0, new Studentinfo("ARUNA",27,"vels"));
		student.set(1,new Studentinfo("priya",student.get(1).getAge() ,student.get(1).getClg()));
		for(Studentinfo s:student) {// here we are not giving any datatype we are giving cls name becoz we are looping the class
        	if(s.getStdname()=="Lakshmi") {
        		s.setStdname("krish");
        	}
        	System.out.println(s.getStdname()+ s.getAge()+s.getClg());
        }
        
	}
	
	public void Bankarr() {
		ArrayList<Bank> bank=new ArrayList<Bank>();
		bank.add(new Bank("shree",25000));
		bank.add(new Bank("krishna",20000));
		for(Bank b:bank) {
			System.out.println("acc holder name: "+b.getAccname()+" acc balance "+ b.getBalance());
		}
		bank.set(0, new Bank("shrelakshmi",bank.get(0).getBalance()));
		System.out.println(bank.get(0).getAccname()+bank.get(0).getBalance());
		for(Bank b:bank) {
			if(b.getBalance()==25000) {
				b.setBalance(50000);
			}
			System.out.println(bank.get(0).getAccname()+bank.get(0).getBalance());
		}
		
	}

	
	
	public static void main(String[] args) {
		List list=new List();
		list.ArrayList();
		list.Arraylist2();
		list.stdarraylist();
		list.Bankarr();
		
	}
	

}
