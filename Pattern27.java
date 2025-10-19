
//1
//2 6
//3 7 10
//4 8 11 13
//5 9 12 14 15
class Pattern27
{
	public static void main(String[] args) 
	{
		int num = 1;
		for (int i =1;i<=5 ;i++ ) 
		{
			for (int j =1; j<=i ;j++ )
			 {
				System.out.print(num+ " ");
				num++;
			}
			System.out.println();
		}
	}
}