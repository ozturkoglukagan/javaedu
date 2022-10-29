//Find the n^th largest integer in a given sequence
//n is the first given argument

public class ClassQ1 {
    //arguments olarak sayilari alicaz args[] 2 4 5 7 -1
    //bir kucuk uzunlukta bir arraye kopyala 4 5 7 -1
    //en büyük sayıyı bul 7, 
    //en büyük sayıyı sil 4 5 -1
    //bu silme işlemini n kere tekrarla
    public static void main(String[] args) {
        //args = argumentlerin bulundugu array
        //javac ClassQ1.java
        //java ClassQ1 3 4 5 7 -1
        //String[] args = {"3","4","5","7","-1"};
        //int[] copyArray = {4,5,7,-1}
        //array olusturalim
        int[] copyArray = new int[args.length - 1];
        //kopyalama
        for (int i = 0; i < copyArray.length; i++) {
            //copyArray arrayinin ilk indexine args arrayinin ikinci indexindeki degerini koymak
            copyArray[i] = Integer.parseInt(args[i+1]);
        }
        //en buyuk sayi olarak ilk sayiyiy belirle
        int biggest = copyArray[0];
        int biggestIndex;
        //copyarrayi don
        for (int i = 0; i < copyArray.length; i++) {
            //en buyugu guncelle
            if (copyArray[i]>biggest) {
                //biggest sayiyi guncelle
                biggest=copyArray[i];
                //en buyuk sayinin indexini kaydet
                biggestIndex=i;
            }
        }
        //7 sayisini en buyuk INTEGER.MaxValue;
        // en disa bir adet for at ve args[0] kadar dondur
        
        // //copyArrayi konsola yazdir
        // for (int i : copyArray) {
        //     System.out.println(i);
        // }
    }

}
