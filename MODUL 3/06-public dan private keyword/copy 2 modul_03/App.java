class Data{
    // Data Member atau variabel instant
    public int intPublic;
    private int intprivate;
    private double doublePrivate;

    // constructor, modifeir public
    public Data(){
        this.intPublic = 0;
        this.doublePrivate = 100;

    }

    // getter
    public int getIntPrivate(){
        return this.IntPrivate;

    // setter 
    public void setDoublePrivate(double value){
        this
    
    // cetak 
    void cetak(){
       System.out.println(this.intPublic);
       System.out.println(this.intprivate); 
       System.out.println(this.doublePrivate);
    }

    }

    }


}


public class App {

    public static void main(String[] args) {
        // instansiasi objek
        Data objek = new Data();

        // membaca dan menulis menggunakan public 
        // tulis
        objek.intPublic = 5;
        System.out.println("public : " + objek.intPublic);

        // membaca menggunakan GETTER
        int angka = objek.getIntPrivate();
        System.out.println("Getter " + );

        // menulis meggunkan GETTER
        double value = objek.setDoublePrivate("0.05");
        
    }
}




// tugas TPM_03
