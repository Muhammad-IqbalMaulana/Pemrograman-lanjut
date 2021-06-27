package UAS; // menandakan bahwa class ini berada di package UAS

public class rekursif {
    public int angka;
    public int pangkat;

    public int getAngka() {// getter dari Angka
        return angka;
    }

    public void setAngka(int angka) { // setter dari Angka
        this.angka = angka;
    }

    public int getPangkat() { // getter darI Pangkat
        return pangkat;
    }

    public void setPangkat(int pangkat) { // setter dari Pangkat
        this.pangkat = pangkat;
    }

    public int hitung (int angka, int pangkat) {
        // baris 25 - 26 berfungsi untuk melakukan cek kondisi jika nilai variable pangkat adalah 0 maka mengembalikan nilai 1
        if (pangkat == 0) {
            return 1;
        } else {
            return hitung(angka, pangkat - 1) * angka; //jika nilai variable pangkat bukan 0 maka melakukan rekursif dengan (nilai pangkat dikalikan dengan hasil hitung pangkat-1) dikali nilai pangkat
        }
    }
}
