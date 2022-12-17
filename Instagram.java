package interfaces;

public interface Instagram {
	public static void Walcome(String a)
	{
		System.out.println("Walcome "+a+" In Instagram");
	}
	void post(String text);
	void Comment(String s,String name);
	void Message(String Name,String text);
	void Story(String type);

}
