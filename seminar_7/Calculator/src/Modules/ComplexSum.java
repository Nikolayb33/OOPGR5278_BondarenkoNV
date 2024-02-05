package Modules;

import Controllers.Interfaces.iModels;
import Modules.Domain.ComplexNum;

public class ComplexSum implements iModels{
 

    // метод
    @Override
    public ComplexNum calculate(ComplexNum first, ComplexNum second) {
        ComplexNum resultNum = new ComplexNum(first.getActualPart()+second.getActualPart(),
         first.getImaginaryPart()+second.getImaginaryPart());
        return resultNum;
    }
}
