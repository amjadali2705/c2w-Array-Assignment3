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
            int count=0;
            for(int j=2; j*j<=arr[i]; j++){
                if(arr[i]%j==0){
                    count++;
                }
            }
            if(count==0){
                System.out.println("Prime number "+arr[i]+" found at index: "+i);
            }
        }
    }
}