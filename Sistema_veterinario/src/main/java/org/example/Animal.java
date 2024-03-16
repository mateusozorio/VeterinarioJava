package org.example;

public class Animal {

    //OBRIGATÓRIO
    private int idAnimal;
    //OBRIGATÓRIO
    private String DescricaoAnimal;
    //OBRIGATÓRIO
    private String racaAnimal;

    public Animal() {
    }

    public Animal(int idAnimal, String DescricaoAnimal, String racaAnimal) {
        this.idAnimal = idAnimal;
        this.DescricaoAnimal = DescricaoAnimal;
        this.racaAnimal = racaAnimal;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getDescricaoAnimal() {
        return DescricaoAnimal;
    }

    public void setDescricaoAnimal(String descricaoAnimal) {
        DescricaoAnimal = descricaoAnimal;
    }

    public String getRacaAnimal() {
        return racaAnimal;
    }

    public void setRacaAnimal(String racaAnimal) {
        this.racaAnimal = racaAnimal;
    }
}









































