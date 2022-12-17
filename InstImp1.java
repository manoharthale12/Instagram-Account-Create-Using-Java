package interfaces;

public class InstImp1 implements Instagram {
	
	String name;
	int pass;
	String email;
	public InstImp1() {
	
	}
	InstImp1(String name,int pass,String email)
	{
		this.name=name;
		this.pass=pass;
		this.email=email;
		System.out.println("Account Created! ");
		Instagram.Walcome(name);
	}
	@Override
	public void post(String text) {
		System.out.println(text);
		System.out.println("Posted!");
		
	}
	@Override
	public void Comment(String s, String name) {
		System.out.println(s);
		System.out.println(name);
		System.out.println("Comment!");
		
		
		}
	@Override
	public void Message(String Name, String text) {
		System.out.println(Name);
		System.out.println("Sent");
		System.out.println(text);
		
		
	}
	@Override
	public void Story(String type) {
	System.out.println(type);
	System.out.println("Story Posted!");
		
	}

}
