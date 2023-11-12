public class tes {
//    public static void main(String[] args) {
//        int panjang = 10;
//        int lebar = 6;
//        int hasil = 0;
//
//        hasil = panjang*lebar;
//        System.out.println("Jadi luas putra adalah " + hasil);
//
//    }
    public static void main(String[] args) {
        int alas = 15;
        int tinggi = 23;
        double luas= 0.5 * alas * tinggi;

        if(luas % 2 == 0){
            System.out.println("luas" + luas + "Genap");
        }else{
            System.out.println("Luas" + luas + "Ganjil");
        }
    }
}

