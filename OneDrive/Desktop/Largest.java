public class Largest {
   public static void main(String args[]){
      int temp, size;
      int array[] = {};
      size = array.length;
      if(size>0) {

      for(int i = 0; i<size; i++ ){
         for(int j = i+1; j<size; j++){

            if(array[i]>array[j]){
               temp = array[i];
               array[i] = array[j];
               array[j] = temp;
            }
         }
      }
      System.out.println("second largest number is:: "+array[size-2]);}
      else {
    	  System.out.println("Size is 0");
      }
   }
}
