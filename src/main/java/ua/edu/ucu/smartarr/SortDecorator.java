package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

import java.util.Arrays;
import java.util.stream.Stream;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator{

    public SortDecorator(SmartArray inputSmartArray, MyComparator cmp) {
        super(inputSmartArray);
        Stream distinctStream = Arrays.stream(smartArray.toArray()).sorted(cmp);
        smartArray = new BaseArray(distinctStream.toArray(Object[]::new));
    }

    @Override
    public String operationDescription() {
        return "executes sorting, based on MyComparator";
    }
}
