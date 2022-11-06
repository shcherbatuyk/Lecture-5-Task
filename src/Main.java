public class Main {
    public static void main(String[] args) {

        MyList<Long> myList = new MyList<>();

        myList.add(100L);
        myList.add(145L);
        myList.add(1000L);
        myList.add(1L);
        myList.add(999L);

        System.out.println(myList.toString());
        System.out.println("MaxVal: " + myList.getMaxVal());
        System.out.println("MinVal: " + myList.getMinVal());

    }
}