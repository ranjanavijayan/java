import java.util.Scanner;
class matrixAddition
{
  public static void main(String arg[])
  {
  int r1,r2,c1,c2;
  int a[][] = new int[10][10];
  int b[][] = new int[10][10];
  int c[][] = new int[10][10];
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number of row in 1st metrix:");
  r1=sc.nextInt();
  System.out.println("Enter the number of column in 1st metrix:");
  c1=sc.nextInt();
  System.out.println("Enter the number of row in 2nd metrix:");
  r2=sc.nextInt();
  System.out.println("Enter the number of column in 2nd metrix:");
  c2=sc.nextInt();
  if(r1!=c2)
    System.out.println("The addition is not possible");
    System.exit(0);
     
  System.out.println("Enter the elements:");
  for(int i=0;i<r1;i++)
   {
    for(int j=0;j<c1;j++)
    {
      a[i][j]=sc.nextInt();
     }
    }
  System.out.println("The 1st matrix:");
  for(int i=0;i<r1;i++)
   {
    for(int j=0;j<c1;j++)
    {
      System.out.print(a[i][j]+" ");
     }
    System.out.println();
    }
  
  System.out.println("Enter the elements:");
  for(int i=0;i<r2;i++)
   {
    for(int j=0;j<c2;j++)
    {
      b[i][j]=sc.nextInt();
     }
    }
    System.out.println("The 2nd matrix:");
  for(int i=0;i<r2;i++)
   {
    for(int j=0;j<c2;j++)
    {
       System.out.print(b[i][j]+" ");
     }
      System.out.println();
    }
  for(int i=0;i<r1;i++)
   {
    for(int j=0;j<c1;j++)
    {
       c[i][j]=a[i][j]+b[i][j];
     }
    }

   System.out.println("Sum of the two matrices are:");
  for(int i=0;i<r1;i++)
   {
    for(int j=0;j<c1;j++)
    {
       System.out.print(c[i][j]+" ");
     }
     System.out.println();
    }
}
}