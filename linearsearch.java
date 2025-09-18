public class linearsearch {
   public static void main(String[]args){
    int[] arr= {20,80,33,66,69,65,88,90};
    int n = arr.length;
    int target = 88;

    boolean found = true;
    for(int i=0;i<n;i++){
        if(arr[i]==target){
            System.out.println("Element is: "+ i);
            found =true;
            break;
        }


    }
    if(!found){

        System.out.println("Element not found!");
    }
   } 
}
