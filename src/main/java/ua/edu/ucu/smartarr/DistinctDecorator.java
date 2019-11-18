package ua.edu.ucu.smartarr;

import java.util.Arrays;
import java.util.stream.Stream;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator{

    public DistinctDecorator(SmartArray inputSmartArray) {
        super(inputSmartArray);
        Stream distinctStream = Arrays.stream(smartArray.toArray()).distinct();
        smartArray = new BaseArray(distinctStream.toArray(Object[]::new));
    }

    @Override
    public String operationDescription() {
        return "removes duplicates from an array";
    }
}
