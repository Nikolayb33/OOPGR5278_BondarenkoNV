package Views;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import Controllers.Interfaces.iCalculator;
import Controllers.Interfaces.iView;
import Modules.Domain.ComplexNum;

public class ViewCalc implements iView{


    // поле контроллера
    private iCalculator contr;


    // сеттер для контроллера
    public void setContr(iCalculator contr) {
        this.contr = contr;
    }

    // получение опреатора
    @Override
    public String operator() {
        System.out.println("Введите оператор +, *, /");
        String op = System.console().readLine();
        if (op.equals("+") == true || op.equals("*") == true || op.equals("/") == true)  {
            return op;
        }
        else {
            return "Ошибка оператора";
        }
    }


    // ввод первого числа
    public List<Integer> inputFirstOperand(){
        List<Integer> cmp = new ArrayList<>();
    
        System.out.println("Введите первое комплексное число. Формат ввода:a +bi");
        String complex_1 = System.console().readLine();
        for (String s: complex_1.split(" ")){
            if (s.endsWith("i")){
                String b = s.replace("i", "");
                
                try {
                    Integer c = Integer.parseInt(b);
                    cmp.add(c);    
                } catch (NumberFormatException e) {
                    break;
                }
                
            }
            else{
                try {
                    Integer b = Integer.parseInt(s);
                    cmp.add(b);    
                } catch (NumberFormatException e) {
                    break;
                }      
            }
        }
        return cmp;    
    }

    // получение первого комплексного числа
    @Override
    public ComplexNum firstOperand(List<Integer> cmp) {
        Integer actualOperand = cmp.getFirst();
        Integer imaginaryOperand = cmp.getLast();
        ComplexNum first_operand = new ComplexNum(actualOperand, imaginaryOperand);
    return first_operand;
}

    // ввод второго числа
    public List<Integer> inputSecondOperand(){
        List<Integer> cmp = new ArrayList<>();
    
        System.out.println("Введите второе комплексное число. Формат ввода:a +bi");
        String complex_1 = System.console().readLine();
        for (String s: complex_1.split(" ")){
            if (s.endsWith("i")){
                String b = s.replace("i", "");
                
                try {
                    Integer c = Integer.parseInt(b);
                    cmp.add(c);    
                } catch (NumberFormatException e) {
                    break;
                }
                
            }
            else{
                try {
                    Integer b = Integer.parseInt(s);
                    cmp.add(b);    
                } catch (NumberFormatException e) {
                    break;
                }      
            }
        }
        return cmp;    
    }
    // получение второго комплексного числа
    @Override
    public ComplexNum secondOperand(List<Integer> cmp) {
        int actualOperand = cmp.getFirst();
        int imaginaryOperand = cmp.getLast();
        ComplexNum second_operand = new ComplexNum(actualOperand, imaginaryOperand);
        return second_operand;
    }

    @Override
    public String result(ComplexNum cNum) {
        System.out.println("-----------------------------\nРезультат равен:");
        
        return cNum.toString();
    }

    //метод запускающий программу в клиентском коде
    public void ViewRun()
    {
        contr.run();
    }
    
}
