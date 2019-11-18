package ua.edu.ucu.smartarr;

import java.util.Arrays;

// Base array for decorators
public class BaseArray implements SmartArray{
    private Object[] elements;

    public BaseArray(Object[] inputElements){
        elements = Arrays.copyOf(inputElements, inputElements.length);
    }

    @Override
    public Object[] toArray() { // return array with SmartArray elements
        return elements;
    }

    @Override
    public String operationDescription() { // return current operation name applied to SmartArray
        return "base array";
    }

    @Override
    public int size() { // return SmartArray size
        return elements.length;
    }
}