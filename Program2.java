import java.io.*;
class Core2Web{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter size of array ");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];
        
        System.out.println("Enter elements of array");
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Output: ");
        
        for(int i=0; i<arr.length; i++){
            int rev = 0;
            int temp = arr[i];
            while(temp!=0){
                int rem = temp%10;
                rev = rev*10+rem;
                temp/=10;
            }
            System.out.print(rev+" ");
        }
    }
}