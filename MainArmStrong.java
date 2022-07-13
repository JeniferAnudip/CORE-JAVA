class ArmstrongNo
{	
   public void armstrongCalc()
   {	

     for(int i=1;i<10000;i++)
     {
	int b=i;
	int arm=i;
	int count=0;
	int sum=0;
	int Rem;
	while(b>0)	
	{	
		count++;
		b/=10;
	}
	while(arm>0)		
	{			
		Rem=arm%10;
		sum=sum+calc(Rem,count);	
		arm/=10;	
	}
	
	if(i==sum)		
	{System.out.println("ARMSTRONG NO");			
		System.out.println(i);		
	}		
	
     }		
  }
  public int calc(int r,int c)	
  {	
	int m=1;	
 	for(int i=1;i<=c;i++)	
	{	
		m*=r;
	
	}	
	return m;	
  }	

}
class MainArmStrong
{
	public static void main(String[] a)
	{
		ArmstrongNo an=new ArmstrongNo();
		an.armstrongCalc();
		
	}
}