package Quiz3;

public class Konsul {
    int jasa;
    int team;

    void viewjasa() {
        System.out.println("*Nama Poli*");
        System.out.println("1. Gigi");
        System.out.println("2. Anak");
        System.out.println("3. Umum");
    }

    public String getJasa() {
        String hasil = null;

        if (this.jasa == 1) {
            hasil = "Gigi";
        } else if (this.jasa == 2) {
            hasil = "Anak";
        } else if (this.jasa == 3) {
            hasil = "Umum";
        }

        return hasil;
    }

    public void setJasa(int jasa) {
        this.jasa = jasa;
    }

    void viewteam() {
        System.out.println("*Nama Dokter*");
        System.out.println("1. drg. Ahmad Afandi");
        System.out.println("2. dr. Aris Wicaksono, Sp.A.");
        System.out.println("3. dr. Alfia Putri");
    }

    public String getTeam() {
        String hasil = "";

        if (this.team == 1) {
            hasil = "drg. Ahmad Afandi";
        } else if (this.team == 2) {
            hasil = "dr. Aris Wicaksono, Sp.A.";
        } else if (this.team == 3) {
            hasil = "dr. Alfia Putri";
        }

        return hasil;
    }
}
