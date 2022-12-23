public class Human{
    
    //Ismi
    //ID numarasi = 11 
    //boyu
    //kilosu
    //yas

    //Kalıp oluşturma işlemi 
    //private ve public ile degistirmenin onune gecilebilir
    //Attributes = Özellik
    String name;
    long ID;
    int height;
    double weight;
    int age;
    boolean miniman;
    
    //Constructor - yapı (bir objeyi olusturmak icin hangi degerlere ihtiyacim var)
    public Human(String n, int h, double w){
        this.name = n;
        this.height = h;
        this.weight = w;
        if (h<50) {
            this.miniman= true;
        }else{
            this.miniman=false;
        }
        
    }
    //ismail
    //180
    //80

    //behaviour = davranis


}