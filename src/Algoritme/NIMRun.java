package Algoritme;

public class NIMRun {
    public static void main(String[] args) {
        String nim = "12050113093";
        NIM noNim = new NIM();
        noNim.setNim(nim);
        System.out.println("Jenjang pendidikan = " +noNim.getjenjang());
        System.out.println("Tahun masuk = " +noNim.getTahun());
        System.out.println("Fakultas = " +noNim.getFakultas());
        System.out.println("Prodi = " +noNim.getProdi());
        System.out.println("Jenis kelamin = " +noNim.getJenisKelamin());
        System.out.println("Nomor Urut Mahasiswa = " +noNim.getNomorUrut());
    }
}
