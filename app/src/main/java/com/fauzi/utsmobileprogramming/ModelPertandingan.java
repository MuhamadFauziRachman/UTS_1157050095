package com.fauzi.utsmobileprogramming;

public class ModelPertandingan {
    private String timSatu;
    private String timDua;
    private int logoTimSatu;
    private int logoTimDua;
    private String berita;

    public ModelPertandingan(String timSatu, String timDua, int logoTimSatu, int logoTimDua, String berita) {
        this.timSatu = timSatu;
        this.timDua = timDua;
        this.logoTimSatu = logoTimSatu;
        this.logoTimDua = logoTimDua;
        this.berita = berita;
    }

    public String getTimSatu() {
        return timSatu;
    }

    public void setTimSatu(String timSatu) {
        this.timSatu = timSatu;
    }

    public String getTimDua() {
        return timDua;
    }

    public void setTimDua(String timDua) {
        this.timDua = timDua;
    }

    public int getLogoTimSatu() {
        return logoTimSatu;
    }

    public void setLogoTimSatu(int logoTimSatu) {
        this.logoTimSatu = logoTimSatu;
    }

    public int getLogoTimDua() {
        return logoTimDua;
    }

    public void setLogoTimDua(int logoTimDua) {
        this.logoTimDua = logoTimDua;
    }

    public String getBerita() {
        return berita;
    }

    public void setBerita(String berita) {
        this.berita = berita;
    }
}
