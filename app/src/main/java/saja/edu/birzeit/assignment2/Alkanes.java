package saja.edu.birzeit.assignment2;

import androidx.recyclerview.widget.RecyclerView;

public class Alkanes {
    private String name;
    private int image;
    private String data;

    public Alkanes(String name, String data, int image) {
        this.name = name;
        this.image = image;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
