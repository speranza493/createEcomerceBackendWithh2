package com.example.demo.DTO;

public class PhotoDTO {

    private int intero;
    private String ciccio;
    private String paperino;

    public PhotoDTO() {
    }

    public PhotoDTO(int intero, String ciccio, String paperino) {
        this.intero = intero;
        this.ciccio = ciccio;
        this.paperino = paperino;
    }

    public int getIntero() {
        return intero;
    }

    public void setIntero(int intero) {
        this.intero = intero;
    }

    public String getCiccio() {
        return ciccio;
    }

    public void setCiccio(String ciccio) {
        this.ciccio = ciccio;
    }

    public String getPaperino() {
        return paperino;
    }

    public void setPaperino(String paperino) {
        this.paperino = paperino;
    }
}
