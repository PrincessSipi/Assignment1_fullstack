public class Practice{

	public static void main(String[] args){
		// loops

		//for(int i = 0; i<=5; i++){
			//System.out.println("*");
		//}

		//int i = 0;
		//while(i < 5){
			//System.out.println("*");
			//i++;
		//}

		//do{
			//System.out.println("*");
			//i++;
		//}while(i < 5);

		//for(int i = 0; i<=5; i++){
			//for(int j = 0; j<=5; j++){
				//System.out.print("*");
			//}
			//System.out.println();
		//}

		//for(int i = 0; i<=5; i++){
			//for(int j = 0; j<=i; j++){
				//System.out.print("*");
			//}
			//System.out.println();
		//}
		int n = 10;
		//for(int i = 0; i<n; i++){
			//for(int j = 0; j<n; j++){
				//if(i == 0 || i == n-1 || j == 0|| j == n-1){
					//System.out.print("*");
				//}
				//else{
					//System.out.print(" ");
				//}
			//}
			//System.out.println();
		//}
		
		//for(int i = 0; i<n; i++){
			//for(int j = 0; j<n; j++){
				//if(i == (n-1)/2 || j == 0|| j == n-1){
					//System.out.print("*");
				//}
				//else{
				//	System.out.print(" ");
				//}
			//}
			//System.out.println();
		//}


		//for(int i = 0; i<n; i++){
			//for(int j = 0; j<n; j++){
			//	if(i == 0 || i == (n-1)/2 || j == 0|| j == n-1){
			//		System.out.print("*");
			//	}
			//	else{
			//		System.out.print(" ");
			//	}
		//	}
		//	System.out.println();
		//}

		//for(int i = 0; i<n; i++){
		//	for(int j = 0; j<n; j++){
		//		if(i == 0 && j != 0 && j != n-1 || j == 0 && i > 0 || i == (n - 1)/ 2 || j == n -1 && i != 0){
		//			System.out.print("*");
		//		}
		//		else{
		//			System.out.print(" ");
		//		}
		//	}
		//	System.out.println();
	//	}

		for(int i = 0; i<n; i++){
			for(int j = 0; j<n; j++){
				if(j == 0 || i == 0 && j != n-1 || i == n-1 && j != n-1 || j == n-1 && i != 0 && i != n -1 ){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}