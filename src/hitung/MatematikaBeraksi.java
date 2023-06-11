package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Matematika adhy = new Matematika(5,7);
        
        System.out.println("Hasil penjumlahan: "+adhy.setPenjumlahan());
        System.out.println("Hasil pengurangan: "+adhy.setPengurangan());
        System.out.println("Hasil perkalian: "+adhy.setPerkalian());
        System.out.println("Hasil pembagian: "+adhy.setPembagian());
       
    }
}
