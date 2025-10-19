// L e e n a
// L e e n
// L e e
// L e
// L

import java.util.Scanner;
class Pattern10
{
	public static void main(String[] args)
	 {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the String :");
		String word= sc.nextLine();

		for(int i = word.length();i>0 ;i--)
		{
			for(int j =0; j<i;j++)
			{
				System.out.print(word.charAt(j)+ " ");
			}
			System.out.println();
		}
	}
}