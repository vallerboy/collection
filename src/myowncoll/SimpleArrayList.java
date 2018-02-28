package myowncoll;

import java.util.ArrayList;
import java.util.Arrays;

public class SimpleArrayList<T> {

    private static final int GROW_CAP = 5;
    private final static int INIT_CAP = 10;

    private Object[] array;


    private int size;

    public SimpleArrayList(){
        this(INIT_CAP);
    }

    public SimpleArrayList(int initCap){
        array = new Object[initCap];
        size = 0;
    }

    public boolean add(T e){
        if(size >= array.length - 1){
            growArrayLength();
        }
        array[size++] = e;
        return true;
    }

    public void remove(T e){
        int foundIndex = -1;
        for (int i = 0; i < size; i++) {
            if(array[i].equals(e) && foundIndex == -1){
                foundIndex = i;
                array[i] = null;
                    continue;
            }
            if(foundIndex != -1){
                array[i - 1] = array[i];
            }
        }
        size--;
    }

    public void printList(){
        Object o;
        for (int i = 0; i < size; i++) {
            o = array[i];

            if(o != null)
            System.out.println(o.toString());
        }
    }

    private void growArrayLength() {
        array = Arrays.copyOf(array, array.length + GROW_CAP);
    }


}


