// 1
// 3 2
// 6 5 4
// 10 9 8 7
// 15 14 13 12 11

class Pattern12
{
	public static void main(String[] args) 
	{
		      int a =0;
          for(int i =1; i<=5; i++)
          {
            a = i+a;
            int b =a;
          	for(int j =1;j<=i;j++)
          		{
          			System.out.print(a-- +" ");
          		}
              a=b;
             System.out.println();
         }
	}
}


// ********************* OR   *******************

// class Pattern11
// {
// 	public static void main(String[] args)
// 	 {
// 		int start = 1;

// 		for(int i =1; i<=5; i++)
// 		{
// 			int end = start +i-1;

// 			for (int j = end ; j>=start; j--){
// 				System.out.print(j+ " ");
// 			}
// 			start = end + 1;
// 			System.out.println();
// 		}
// 	}
// }