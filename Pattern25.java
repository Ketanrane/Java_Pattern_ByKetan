//1
//2 6
//3 7 10
//4 8 11 13
//5 9 12 14 15

class Pattern25
{
  public static void main(String[] args) 
  {           
          
         for(int i =1; i<=5; i++)                               
          {
          	int num =4;
          	int a = i+num--;
          	for (int j=1; j<=i; j++) {
          		if (j==1) 
          			
          		System.out.print(i+" ");
            	else{
            		 
            		System.out.println(a+" ");
            		a=a+num--;
            	}
          		
          		
          	}
          	System.out.println();
          }
      }
  }
     
           