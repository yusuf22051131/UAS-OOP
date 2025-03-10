public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Book1", "Pemrograman Berorientasi Objek", "kaka", 2025);
        Buku buku2 = new Buku("Book2", "Hewan melata", "wawan setiawan", 2026);

        Anggota anggota1 = new Anggota("A1", "MAULANA", "JL.LIMUSNUNGGAL");
        Anggota anggota2 = new Anggota("A2", "YUSUF", "JL.SAMUDRA HINDIA");

        System.out.println("Informasi Buku Sebelum Peminjaman:");
        buku1.tampilkanInfo();
        buku2.tampilkanInfo();

        System.out.println("\nMencoba meminjam buku...");
        if (buku1.isTersedia()) {
            Peminjaman peminjaman1 = new Peminjaman("PINJAM 100", anggota1, buku1, "2025-03-01", "2025-03-15");
            buku1.ubahStatus(false);
            System.out.println("Peminjaman berhasil!");
            peminjaman1.tampilkanDetailPeminjaman();
        } else {
            System.out.println("Buku tidak tersedia untuk dipinjam.");
        }

        System.out.println("\nInformasi Buku Setelah Peminjaman:");
        buku1.tampilkanInfo();

        System.out.println("\nMengembalikan buku...");
        buku1.ubahStatus(true);

        System.out.println("Buku telah dikembalikan dan status buku diubah menjadi tersedia.");
        buku1.tampilkanInfo();
    }
}
