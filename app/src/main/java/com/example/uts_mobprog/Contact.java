package com.example.uts_mobprog;

public class Contact
{
    String name;
    String nation, element;
    int image;

    public Contact(String name, String nation, String element, int image) {
        this.name = name;
        this.nation = nation;
        this.element = element;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
