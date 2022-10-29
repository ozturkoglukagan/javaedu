public class SampQ {

    public static void main(String[] args) {
        int[] input = {15,2,3,-9,11,10,6};
        // ikiye bölünebilen sayıların indexlerini yazdır
        // eger index de 2nin katiysa bunlarin yanina nice yaz
       
        //for ile sayilari dön
        for (int i = 0; i < input.length; i++) {
             // eger 2ye bölünüyorsa indexı yazdır
             if (input[i] % 2==0) {
                System.out.print( i + " ");
                if (i % 2 == 0) {
                    System.out.print("nice!");
                }

             }
    
        }
       

    }
    
}
// public class SampleQuestion {
// 	public static void main(String[] args) {
		
// 		int[] input = {15,2,32,-9,11,10,6};
// 		
// 		for(int i=0; i<input.length; i++) {
// 			if(input[i]%2==0) {
// 				System.out.print(i +" ");
// 			}
// 			if(input[i]%2==0 && i%2==0) {
// 				System.out.print("Nice! ");
// 			}
			
// 		}
		
// 	}

// }