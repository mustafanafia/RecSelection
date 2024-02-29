import java.util.Scanner;

public class test {
    
    public static boolean again(){
        Scanner kb = new Scanner(System.in);
        boolean ans = true;
        System.out.print("Again> <y/n> :");
        String resp = kb.next();
        resp = resp.toUpperCase();
        if ((resp.charAt(0))=='y') {ans = false;}
        return ans;
    }
        
    
    public static int getNumber(){
     Scanner kb = new Scanner(System.in);
     System.out.println("Enter a number: ");
     int num = kb.nextInt();
     return num;

    }
    
    
    
    public static void showArray(int[]list){
     System.out.println("\n\nThe List:\n");
     for (int i = 0; i<list.length;i++){
         System.out.print(list[i]+"\t");
         if ((i+1)%10==0)System.out.println("");
        }
        System.out.println("\n\n=============================\n\n");
    }
        
        
        
    
    public static void makeArray(int[]list){
     for (int i = 0; i<list.length; i++){
         list[i] = (int)(Math.random()*2000 +1);
        }
    }
    
        
        
        
    
   
          public static void selectionSort(int[] list){
          System.out.println("Calling the helper");
          selectionSort(list,0,list.length-1);
        }
        
        public static void selectionSort(int[] list,int low, int high) {
            System.out.println("Selection with low index:"+low+" and high index:" + high);
            if(low < high) {
                int smallestIndex = low;
                int min = list[low];
                for(int i = low+1;i<=high; i++){
                    if (list[i]<min) {
                        min = list[i];
                        smallestIndex = i;
                        System.out.println("Smallest is now: :"+min);
                    }
                }
                list[smallestIndex] = list[low];
                list[low]=min;
            }
        }
    
    public static int recursiveBinarySearch(int[] list, int key) {
    int low = 0;
    int high = list.length - 1;
    return recursiveBinarySearch(list, key, low, high);
  }

  private static int recursiveBinarySearch(int[] list, int key,
      int low, int high) {
    if (low > high)  // The list has been exhausted without a match
      return -low - 1;

    int mid = (low + high) / 2;
    if (key < list[mid])
      return recursiveBinarySearch(list, key, low, mid - 1);
    else if (key == list[mid])
      return mid;
    else
      return recursiveBinarySearch(list, key, mid + 1, high);
  }
    
    

    public static void main(String[] args) {
        boolean done = false;
        
        while(!done){
            int[]test=new int[50];
            makeArray(test);
            showArray(test);
            selectionSort(test);
            showArray(test);
            
            int num = getNumber();
            
            int ans = recursiveBinarySearch(test,num);
            if(ans>0){
                System.out.println("Found " + test[ans]+" at position :"+ans);
            }
            else { System.out.println("Not on list");}
            System.out.println("===========");
            
            done = again();
        }
    }
}

            