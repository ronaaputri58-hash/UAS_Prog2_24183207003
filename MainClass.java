import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> listMhs = new ArrayList<>();
        ArrayList<Dosen> listDosen = new ArrayList<>();
        ArrayList<MataKuliah> listMK = new ArrayList<>();
        ArrayList<Nilai> listNilai = new ArrayList<>();

        int pilihan = -1;

        while (pilihan != 0) {
            System.out.println("\n=== SISTEM AKADEMIK ===");
            System.out.println("1. Input Data Mahasiswa");
            System.out.println("2. Input Data Dosen");
            System.out.println("3. Input Mata Kuliah");
            System.out.println("4. Input Nilai Mahasiswa");
            System.out.println("5. Tampilkan Data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); 

            if (pilihan == 1) {
                System.out.print("Masukkan Nama: ");
                String nm = input.nextLine();
                System.out.print("Masukkan NPM : ");
                String npm = input.nextLine();
                listMhs.add(new Mahasiswa(nm, npm));
            } 
            else if (pilihan == 2) {
                System.out.print("Masukkan Nama Dosen: ");
                String nmd = input.nextLine();
                System.out.print("Masukkan ID Dosen  : ");
                String id = input.nextLine();
                listDosen.add(new Dosen(nmd, id));
            } 
            else if (pilihan == 3) {
                System.out.print("Masukkan Kode MK: ");
                String kmk = input.nextLine();
                listMK.add(new MataKuliah(kmk));
            } 
            else if (pilihan == 4) {
                System.out.print("Nilai Tugas: ");
                double t = input.nextDouble();
                System.out.print("Nilai UTS  : ");
                double ut = input.nextDouble();
                System.out.print("Nilai UAS  : ");
                double ua = input.nextDouble();
                listNilai.add(new Nilai(t, ut, ua));
            } 
            else if (pilihan == 5) {
                System.out.println("\n--- TAMPILAN DATA ---");
                for (Mahasiswa m : listMhs) m.tampilInfo();
                for (Dosen d : listDosen) d.tampilInfo();
                for (MataKuliah mk : listMK) mk.tampilInfo();
                for (Nilai n : listNilai) {
                    System.out.println("Nilai Akhir: " + n.hitungNilaiAkhir());
                }
            } 
            else if (pilihan == 0) {
                System.out.println("Terima kasih, program selesai.");
            } 
            else {
                System.out.println("Pilihan tidak ada!");
            }
        }
        input.close();
    }
 }