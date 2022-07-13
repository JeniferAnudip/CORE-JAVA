class operators
{
	public static void main(String[] args)
	{
		int a = 10, b = 5;
		String x = "Thank", y = "Thank";
		int ar[] = { 1, 2, 3 };
		int br[] = { 1, 2, 3 };
		Boolean condition = true;

		System.out.println("a == b :" + (a == b));//false
		System.out.println("a < b :" + (a < b));//false
		System.out.println("a <= b :" + (a <= b));//false
		System.out.println("a > b :" + (a > b));//true
		System.out.println("a >= b :" + (a >= b));//true
		System.out.println("a != b :" + (a != b));//true
		System.out.println("x == y : " + (x == y));//true
		System.out.println("condition==true :" + (condition == true));//true
	}
}