package DemoTbale;

public class Word {
    private int id;
    private String viet_tat, viet_day_du;

    public Word(int id, String viet_tat, String viet_day_du) {
        this.id = id;
        this.viet_tat = viet_tat;
        this.viet_day_du = viet_day_du;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getViet_tat() {
        return viet_tat;
    }

    public void setViet_tat(String viet_tat) {
        this.viet_tat = viet_tat;
    }

    public String getViet_day_du() {
        return viet_day_du;
    }

    public void setViet_day_du(String viet_day_du) {
        this.viet_day_du = viet_day_du;
    }

}
