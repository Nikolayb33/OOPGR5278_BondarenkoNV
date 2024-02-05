package Modules;

import Controllers.Interfaces.iModels;
import Modules.Domain.ComplexNum;

public class ComplexDel implements iModels{

    // поле

    //метод
    @Override
    public ComplexNum calculate(ComplexNum first, ComplexNum second) {
        
        // считаем действительную часть
        int NumeratorActual = (first.getActualPart()*second.getActualPart()+first.getImaginaryPart()*second.getImaginaryPart());
        int Denominator = second.getActualPart()*second.getActualPart() + second.getImaginaryPart()*second.getImaginaryPart();
        int actualPartRes = NumeratorActual/Denominator;

        
        // считаем мнимую часть
        int NumeratorImaginary = (first.getImaginaryPart()*second.getActualPart()-first.getActualPart()*second.getImaginaryPart());
        int imagePartRes = NumeratorImaginary/Denominator;

        // собираем комплексное число
        ComplexNum resultNum = new ComplexNum(actualPartRes, imagePartRes);
        // действительная и мнимая часть выведены в целочисленном виде
        return resultNum;
    }

    
}
