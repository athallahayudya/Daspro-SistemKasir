import java.util.Scanner;
public class menu1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ulang;
        int pilih;

        do { 
        System.out.println("============PILIHAN MENU============");
        System.out.println("1. Riwayat transaksi");
        System.out.println("2. Hapus riwayat transaksi");  
        System.out.println("=================================");
        System.out.print("Pilih menu: ");
        pilih = sc.nextInt();

        switch(pilih){
            case 1:
                System.out.println("Cek riwayat transaksi ");
                break;
            case 2:
                System.out.println("Hapus transaksi");
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
            }

            System.out.println("\n");
            System.out.println("Ingin memilih menu lain? (y/t)");
            ulang = sc.next().charAt(0);
            System.out.println("\n");
            
        } while (ulang != 't');
        System.out.println("terimakasih");

    }
}
    