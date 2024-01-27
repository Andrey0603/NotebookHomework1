

public class Notebook {
    // Поля класса Notebook
    private String model;
    private int ramGb;
    private int hddGb;
    private String os;
    private String color;
    
    // Конструктор класса Notebook
    public Notebook(String model, int ramGb, int hddGb, String os, String color) {
        this.model = model;
        this.ramGb = ramGb;
        this.hddGb = hddGb;
        this.os = os;
        this.color = color;
    }
    
    // Методы класса Notebook
    // Геттеры для получения значений полей
    public String getModel() {
        return model;
    }
    
    public int getRamGb() {
        return ramGb;
    }
    
    public int getHddGb() {
        return hddGb;
    }
    
    public String getOS() {
        return os;
    }
    
    public String getColor() {
        return color;
    }
}