package grewal.example.ajayk.factofun;

/**
 * Created by ajayk on 2017-07-17.
 */

public class ItemsInRows {
    private String titles;
    private int imageid;

    public ItemsInRows(String titles, int imageid) {
        this.titles = titles;
        this.imageid = imageid;
    }

    public String getTitles() {
        return titles;
    }

    public void setTitles(String titles) {
        this.titles = titles;
    }

    public int getImageid() {
        return imageid;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }
}
