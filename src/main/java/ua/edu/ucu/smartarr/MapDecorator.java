package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

import java.util.Arrays;
import java.util.stream.Stream;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator{

    public MapDecorator(SmartArray inputSmartArray, MyFunction func) {
        super(inputSmartArray);
        Stream distinctStream = Arrays.stream(smartArray.toArray()).map(func);
        smartArray = new BaseArray(distinctStream.toArray(Object[]::new));
    }

    @Override
    public String operationDescription() {
        return "applies defined function MyFunction to each element of an array";
    }
}
