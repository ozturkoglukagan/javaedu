// java q1 2 4 65 7 9 6 8 49
// tek sayilari iceren bir array ve cift sayilarii ceren bir array olustur ve bunlari yazdir
public class q1{

    public static void main(String[] args) {
        //argsdakinleri bir arraye kopyala
        int[] beste = new int[args.length];
        //args lengi don ve elemanlari kopyala
        for (int i = 0; i < args.length; i++) {
            beste[i]=Integer.parseInt(args[i]);
        }

        for (int i : beste) {
            System.out.println(i);
        }
        
        //tek sayi count
        int oddCount= 0;
        //cift sayi count
        int evenCount= 0;

        //args arrayini donelim 
        for (int i = 0; i < args.length; i++) {
            int temp = Integer.parseInt(args[i]);
            //division control
            if (temp % 2 == 0) {
                evenCount++;
            } else{
                oddCount++;
           }
        }


        //tek sayi icerne array
        int[] oddArray = new int[oddCount];//3
        //cift asyi iceren array
        int[] evenArray = new int[evenCount];//6
        int oddIndex=0;
        int evenIndex=0;

        //tekrar argsi donuyorum ve evense o arraya oddsa o arraya koyuyorum
        for (int i = 0; i < args.length; i++) {//9
            int temp = Integer.parseInt(args[i]);
            //division control
            if (temp % 2 == 0) {
                //bunu evenArraye ekleyecem
                evenArray[evenIndex]=temp;
                evenIndex++;
            }else {
                //bunu oddArraye ekleyecem
                oddArray[oddIndex]=temp;
                oddIndex++;
            }
        }

        
        //for each 
        
        for (int x : evenArray) {
            System.out.println("These numbers are even: " + x);
        }

        for (String kelime : args) {
            System.out.println(kelime);
            //kelime = args[0];
            kelime = "hassan";
        }



    }


}