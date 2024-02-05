package Modules.Domain;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

public class ComplexNum {
    //поля
    private int actualPart;
    private int imaginaryPart;
    private String operator;
    private List<Integer> сomplexNumber = new ArrayList<>();

    //конструктор
    public ComplexNum(int actualPart, int imaginaryPart) {
        this.actualPart = actualPart;
        this.imaginaryPart = imaginaryPart;
        if (this.imaginaryPart > 0){
            this.operator = "+";
            
        }
        if (this.imaginaryPart < 0){
            this.operator = "-";
        }
        this.сomplexNumber.add(actualPart);
        this.сomplexNumber.add(imaginaryPart);
    }

    // геттеры и сеттеры
    public int getActualPart() {
        return actualPart;
    }

    public void setActualPart(int actualPart) {
        this.actualPart = actualPart;
        this.сomplexNumber.removeFirst();
        this.сomplexNumber.addFirst(actualPart);

    }

    public int getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(int imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
        this.сomplexNumber.removeLast();
        this.сomplexNumber.addLast(imaginaryPart);
    }

    public List<Integer> getСomplexNumber() {
        return сomplexNumber;
    }

    // вывод в строку
    @Override
    public String toString() {
        return System.out.printf("%d %s %di\n", this.actualPart, this.operator, Math.abs(this.imaginaryPart)).toString();
    }    

    
}
