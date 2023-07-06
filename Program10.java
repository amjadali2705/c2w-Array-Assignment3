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
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Second Minimum: "+arr[1]);
    }
}
