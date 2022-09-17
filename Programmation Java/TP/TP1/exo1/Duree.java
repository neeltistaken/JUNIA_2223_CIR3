package exo1;

public class Duree {
    private int heure;
    private int minute;
    private int seconde;

    /**
     * Constructeur heure minute seconde
     * 
     * @param heure
     * @param minute
     * @param seconde
     */
    public Duree(int heure, int minute, int seconde) {
        this.heure = heure;
        this.minute = minute;
        this.seconde = seconde;
    }

    public Duree(double time) {
        int heure = (int) time;
        int minute = (int) Math.round((time - heure) * 60);
        this.heure = heure;
        this.minute = minute;
    }

    public int getHeure() {
        return this.heure;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSeconde() {
        return this.seconde;
    }

}
