import java.util.ArrayList;

public class MyList<T extends Number> {
    ArrayList<T> myArrayList = new ArrayList<T>();

    public void add(T addToArrList) {
        myArrayList.add(addToArrList);
    }


    @Override
    public String toString() {
        return "myArrList:" +
                myArrayList + ";";
    }

    public T getMaxVal() {
        T maxVal = myArrayList.get(0);

        for (int i = 0; i < myArrayList.size(); i++) {
            if (myArrayList.get(i).longValue() > maxVal.longValue()) {
                maxVal = myArrayList.get(i);
            }
        }

        return maxVal;
    }

    public T getMinVal() {
        T minVal = myArrayList.get(0);

        for (int i = 0; i < myArrayList.size(); i++) {
            if (myArrayList.get(i).longValue() < minVal.longValue()) {
                minVal = myArrayList.get(i);
            }
        }

        return minVal;
    }
}
