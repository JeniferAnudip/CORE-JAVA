class Example
{
	static byte no=45;
	Example() //constructor
	{
		System.out.println("Constructor"+no);
	}
	public void display(int age)
	{
		byte month=7;
		System.out.println("Instance Method"+no);
		
	}
	public static void wish()
	{
		System.out.println("static Method"+no);
		
	}
}
class MainVariable
{
	static
	{
		System.out.println("STATIC Block..");
	}
	public static void main(String a[])
	{
		Example b=new Example();
		b.display(5);
		Example.wish();
		//System.out.println("MAIN METHOD...a[2]"+a[2]);
	}


}