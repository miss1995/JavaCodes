package LoopDemo;

public static void main(String[] args) 
{   
int n,i,m=0,flag=0;    
System.out.println("Enter the number to check prime:");       
{   
for(i=2;i<=n/2;i++)    
{    
if(n%i==0)    
{    
System.out.println("Number is not prime");    
flag=1;    
break;    
}    
}    
if(flag==0)    
printf("Number is prime");     
}
 } 
}