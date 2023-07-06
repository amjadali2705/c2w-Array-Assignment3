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
            int sum=0;
            for(int j=1; j<arr[i]; j++){
                if(arr[i]%j==0){
                    sum+=j;
                }
            }
            if(sum==arr[i]){
                System.out.println("Perfect number "+arr[i]+" found at index: "+i);
            }
        }
    }
}