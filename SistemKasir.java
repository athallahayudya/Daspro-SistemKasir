import java.util.Scanner;

public class SistemKasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama_barang;
        int harga_barang, jml_bnyk_barang;
        double presentase_diskon = 0.1 ,total_belanja ,total_hrg_barang, diskon, total_belanja2;
        
        System.out.println("Masukkan Nama Barang: ");
        nama_barang = input.next();
        System.out.print("Masukkan Jumlah Banyak Barang: ");
        jml_bnyk_barang = input.nextInt();
        System.out.print("Masukkan Harga Barang: ");
        harga_barang = input.nextInt();

        total_hrg_barang = harga_barang *jml_bnyk_barang;

        total_belanja = total_hrg_barang;
        diskon = presentase_diskon * total_belanja;

        total_belanja2 = total_belanja - diskon;


        if (total_belanja >= 50000) {
            System.out.println("Anda mendapat diskon 10% sehingga total belanja anda menjadi "+total_belanja2);
        } else {
            System.out.println("Total belanjaan anda " + total_belanja);
        }

    }
}