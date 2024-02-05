package Controllers.Interfaces;

import java.util.List;

import Modules.Domain.ComplexNum;


public interface iView {

    // методы 
    public String operator();
    public List<Integer> inputFirstOperand();
    public ComplexNum firstOperand(List<Integer> cmp);
    public List<Integer> inputSecondOperand();
    public ComplexNum secondOperand(List<Integer> cmp);
    public String result(ComplexNum result);

}
