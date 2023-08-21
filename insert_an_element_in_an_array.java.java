import java.util.Scanner;
public class insert_an_element_in_an_array
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("enter size of array - ");
int n = sc.nextInt();  
      
int a[]= new int[n];
int b[]=new int[n+1];

System.out.println("enter elements");
for(int i=0; i<n; i++){
a[i]=sc.nextInt();
}
System.out.print("enter element you want to add - ");
int add=sc.nextInt();

System.out.print("enter index where you want to add - ");
int index = sc.nextInt();
int k=0;
for(int i=0; i<n; i++){
if(i==index){
b[index]=add;
}
else{
b[k]=a[i];
}
k++;
}
System.out.println("array after addition of " +add+ " = " );
for(int i=0;i<n;i++){
System.out.println(b[i]);
}
}}