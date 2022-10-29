public class Reverse {
    public static void main(String[] args) {
        //args.lengthi kaydetmis
        int size = args.length;
        //values adinda boş bir array olusturmus 
        double[] values = new double[size];

        //args = {"1","5","2","3"}; = 4-1
        //values = {3,2,5,1}
        for (int i = 0; i < size; i++) {
            //
            values[i] = Double.parseDouble(args[size - 1 - i]);
        }


        //yeni olusturdugumuz arrayi basar
        for (int i = 0; i < size; i++) {
            System.out.print(values[i]+" ");
        }


        System.out.println();
        System.out.println("Done!");
    }
}