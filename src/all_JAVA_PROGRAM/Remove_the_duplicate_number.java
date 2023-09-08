package all_JAVA_PROGRAM;

public class Remove_the_duplicate_number {
	public static void main(String[] args) {
		int[] arr = new int [] {8,2,5,1,2,6,8,3,3,7,9,0};
		

		for(int i = 0 ; i < arr.length; i++){
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]){
					System.out.println("The duplicate values are: " + arr[i]);
				}
				
			
	}
}
	    System.out.print("The values without duplicates are: ");
	    for (int i = 0; i < arr.length; i++) {
	        boolean isDuplicate = false;
	        for (int j = i + 1; j < arr.length; j++) {
	            if (arr[i] == arr[j]) {
	                isDuplicate = true;
	                break;
	            }
	        }
	        if (!isDuplicate) {
	            System.out.print(arr[i] + " ");
	        }
	
	}
	}
}