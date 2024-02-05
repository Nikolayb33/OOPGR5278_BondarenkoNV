package Controllers.Interfaces;

import Modules.Domain.ComplexNum;

public interface iView {

    // методы 
    public String operator();
    public ComplexNum firstOperand();
    public ComplexNum secondOperand();
    public String result(ComplexNum result);

}
