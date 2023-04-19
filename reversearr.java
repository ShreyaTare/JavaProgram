import java.util.Scanner;
class reversearr{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter value of Array:");
        for(int i=0;i<size;i++){
           
           arr[i]=sc.nextInt();
        }
        System.out.print("Original Array:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
        System.out.print("print Array in reverse:");
        for(int i = arr.length-1; i >= 0; i--){
            System.out.println(arr[i]+" ");
        }
        
    }
}
    

