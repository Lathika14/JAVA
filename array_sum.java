import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array: ");
        int size=sc.nextInt();
        int arr[] =new int[size];
        System.out.println("Enter the array element : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int sum=0;
        for(int i: arr){
            sum+=i;
        }
       System.out.println(sum);
}
}
