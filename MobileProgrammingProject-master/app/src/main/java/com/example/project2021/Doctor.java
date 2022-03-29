package com.example.project2021;

public class Doctor {
    int image;
    String name;
    String opis;

    public Doctor(int image, String name, String opis) {
        this.image = image;
        this.name = name;
        this.opis = opis;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
}
