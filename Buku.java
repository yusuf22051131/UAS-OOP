class Buku {
    private String idBuku;
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean status;

    public Buku(String idBuku, String judul, String penulis, int tahunTerbit) {
        this.idBuku = idBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.status = true;
    }

    public void tampilkanInfo() {
        System.out.println("ID Buku: " + idBuku);
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Status: " + (status ? "Tersedia" : "Dipinjam"));
    }

    public void ubahStatus(boolean status) {
        this.status = status;
    }

    public boolean isTersedia() {
        return status;
    }
}

class Anggota {
    private String idAnggota;
    private String nama;
    private String alamat;

    public Anggota(String idAnggota, String nama, String alamat) {
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.alamat = alamat;
    }

    public void tampilkanInfo() {
        System.out.println("ID Anggota: " + idAnggota);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
    }
}

// Kelas Peminjaman
class Peminjaman {
    private String idPeminjaman;
    private Anggota anggota;
    private Buku buku;
    private String tanggalPinjam;
    private String tanggalKembali;

    public Peminjaman(String idPeminjaman, Anggota anggota, Buku buku, String tanggalPinjam, String tanggalKembali) {
        this.idPeminjaman = idPeminjaman;
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
    }

    public void tampilkanDetailPeminjaman() {
        System.out.println("ID Peminjaman: " + idPeminjaman);
        anggota.tampilkanInfo();
        buku.tampilkanInfo();
        System.out.println("Tanggal Pinjam: " + tanggalPinjam);
        System.out.println("Tanggal Kembali: " + tanggalKembali);
    }
}


