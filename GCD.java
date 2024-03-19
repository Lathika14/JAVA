import java.util.Scanner;
public class lcmGcd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
       int gcd=1;
       int min=(n1>n2)? n2:n1;
       while(min>1){
           if(n1%min==0 && n2%min==0){
               gcd=min;
               break;
           }
           min--;
       }
       System.out.println("This is a gcd number :" +gcd);
    }
}
