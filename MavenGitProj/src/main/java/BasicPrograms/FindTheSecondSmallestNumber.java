package BasicPrograms;

public class FindTheSecondSmallestNumber {

	public static void main(String[] args) {
		  int temp, size;
	      int array[] = {20, 15 ,25, 63, 96, 57};
	     // Arrays.sort(array);
	      size = array.length;

	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){
	            if(array[i]>array[j]){
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	         System.out.println(array[i]);
	      }
	      System.out.println("2nd Smallest element of the array is:: "+array[1]);

	}

}
