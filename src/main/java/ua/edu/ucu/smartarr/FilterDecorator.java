package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

import java.util.Arrays;
import java.util.stream.Stream;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator{

    public FilterDecorator(SmartArray inputSmartArray, MyPredicate pr) {
        super(inputSmartArray);
        Stream distinctStream = Arrays.stream(smartArray.toArray()).filter(pr);
        smartArray = new BaseArray(distinctStream.toArray(Object[]::new));
    }

    @Override
    public String operationDescription() {
        return "deletes elements of an array, that don't satisfy a condition given in MyPredicate";
    }
}
