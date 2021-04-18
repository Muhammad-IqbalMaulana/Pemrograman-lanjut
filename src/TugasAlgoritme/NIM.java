package TugasAlgoritme;

public class NIM {
    private String nim;
    public String getNim() {
        return nim;
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
            char kodeTahun = nim.charAt(2);
            if (kodeTahun == '9'){
                return "2019";
            }else if (kodeTahun == '0'){
                return "2020";
            }else if (kodeTahun == '1'){
                return "2021";
            }else{
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
        }else if (kodeFakultas == '6'){
            return "Psikologi";
        }else if (kodeFakultas == '7'){
            return "Pertanian dan Peternakan";
        }else{
            return "UNKNOWN";
        }
    }
    public String getProdi(){
        char kodeProdi = nim.charAt(5);
        if (kodeProdi == '1'){
            return "Teknik Informatika";
        }else if (kodeProdi == '2'){
            return "Teknik Industri";
        }else if (kodeProdi == '3'){
            return "Sistem Informasi";
        }else if (kodeProdi == '4'){
            return "Matematika";
        }else if (kodeProdi == '5'){
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
    public int getNomorUrut(){
        char kodeNu = nim.charAt(7,8);
        //char kodeNu1 = nim.charAt();
        return kodeNu;
       /* return kodeNu1;
        return 9;
        return 10;*/
    }
}
