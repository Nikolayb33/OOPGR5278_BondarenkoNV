package Modules;

import java.util.List;

import Controllers.Interfaces.iModels;
import Modules.Domain.ComplexNum;

public class ComplexMul implements iModels{


    // метод
    @Override
    public ComplexNum calculate(ComplexNum first, ComplexNum second) {
        ComplexNum resultNum = new ComplexNum(first.getActualPart()*second.getActualPart() - first.getImaginaryPart()*second.getImaginaryPart(), 
        first.getImaginaryPart()*second.getActualPart() + first.getActualPart()*second.getImaginaryPart());
        return resultNum;
    }
    
}
