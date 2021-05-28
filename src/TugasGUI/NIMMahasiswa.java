package TugasGUI;


public class NIMMahasiswa {
    private String nma;
    private String nim;


    public void setNama(String nama) {
        this.nma = nama;
    }

    public String getNma() {
        return nma;
    }


    public void setNim(String nim){
        this.nim = nim;
    }

    public String getjenjang() {
        char kodeJenjang = nim.charAt(0);
        if (kodeJenjang == '1') {
            return "S1(Sarjana)";
        } else if (kodeJenjang == '2') {
            return "S2(Magister)";
        } else if (kodeJenjang == '3') {
            return "S3(Doktor)";
        } else {
            return "UNKNOWN";
        }
    }
    public String getTahun(){
        String kodeTahun = nim.substring(1,3);
        if  (kodeTahun.equals("19")) {
            return "2019";
        }else if (kodeTahun.equals("20")) {
            return "2020";
        }else if (kodeTahun.equals("21")) {
            return "2021";
        }else {
            return "UNKNOWN";
        }
    }
    public String getFakultas(){
        char kodeFakultas = nim.charAt(3);
        if (kodeFakultas == '1'){
            return "Tarbiyah dan Keguruan";
        }else if (kodeFakultas == '2'){
            return "Syari'ah dan Hukum";
        }else if (kodeFakultas == '3'){
            return "Ushuluddin";
        }else if (kodeFakultas == '4'){
            return "Dakwah dan Komunikasi";
        }else if (kodeFakultas == '5'){
            return "Sains dan Teknologi";
        }else if (kodeFakultas == '6') {
            return "Psikologi";
        }else if (kodeFakultas == '7'){
            return "Ekonomi dan Ilmu Sosial";
        }else if (kodeFakultas == '8'){
            return "Pertanian dan Peternakan";
        }else{
            return "UNKNOWN";
        }
    }
    public String getProdi(){
        String kodeProdi = nim.substring(4,6);
        if (kodeProdi.equals("01")){
            return "Teknik Informatika";
        }else if (kodeProdi.equals("02")){
            return "Teknik Industri";
        }else if (kodeProdi.equals("03")){
            return "Sistem Informasi";
        }else if (kodeProdi.equals("04")){
            return "Matematika";
        }else if (kodeProdi.equals("05")){
            return "Teknik Elektro";
        }else{
            return "UNKNOWN";
        }
    }
    public String getJenisKelamin(){
        char kodeJk = nim.charAt(6);
        if (kodeJk == '1'){
            return "Laki-Laki";
        }else if (kodeJk == '2'){
            return "Perempuan";
        }else{
            return "UNKNOWN";
        }
    }
    public String getNomorUrut(){
        return nim.substring(7,11);
    }

}
