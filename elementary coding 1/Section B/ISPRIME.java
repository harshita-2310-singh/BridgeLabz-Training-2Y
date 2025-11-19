import java.util.*;
public class ISPRIME{
    public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n =sc.nextInt();
   int flag=0;
   for(int i=1;i<=n;i++){

    if(n%i==0){
        flag++;
    }
   }

   if(flag==2){
    System.out.println("Prime Number");
   }
   
   else{
    System.out.println("Not a Prime Number");
   }
        
    }
    
}