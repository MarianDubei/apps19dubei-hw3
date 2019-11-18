package ua.edu.ucu.smartarr;

abstract class SmartArrayDecorator implements SmartArray {

    protected SmartArray smartArray;

    public SmartArrayDecorator(SmartArray inputSmartArray) {
        smartArray = inputSmartArray;
    }

    @Override
    public Object[] toArray() { // return array with SmartArray elements
        return smartArray.toArray();
    }

    @Override
    public int size() { // return SmartArray size
        return smartArray.size();
    }
}
