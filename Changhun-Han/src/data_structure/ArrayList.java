package src.data_structure;

import java.util.Arrays;

public class ArrayList<E> {

    private static final int DEFAULT_CAPACITY = 10;

    private int size;
    private E[] o;

    public ArrayList() {
        this.size = 0;
        this.o = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public ArrayList(int capacity) {
        this.size = 0;
        this.o = (E[]) new Object[capacity];
    }

    public E get(int index) {
        if(index > size - 1) {
            throw new IndexOutOfBoundsException("Index is too big !");
        }
        return o[index];
    }

    public int size() {
        return this.size;
    }

    public void add(E e) {
        if(size == o.length) {
            this.o = Arrays.copyOf(o, o.length + DEFAULT_CAPACITY);
        }
        this.o[size++] = e;
    }

    public void add(int index, E e) {
        if(index > size - 1) {
            throw new IndexOutOfBoundsException("Index is too big !");
        }
        if(size == o.length) {
            this.o = Arrays.copyOf(o, o.length + DEFAULT_CAPACITY);
        }
        for(int i = size - 1; i >= index; i--) {
            this.o[i + 1] = o[i];
        }
        this.o[index] = e;
        size++;
    }

    public void remove(int index) {
        if(index > size - 1) {
            throw new IndexOutOfBoundsException("Index is too big !");
        }
        for(int i = index + 1; i < size; i++) {
            this.o[i - 1] = o[i];
        }
        this.o[size--] = null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        for(int i = 0; i < this.size; i++) {
            if(i == this.size - 1) {
                sb.append(this.o[i].toString() + " ");
                break;
            }
            sb.append(this.o[i].toString() + ", ");
        }
        return sb.append("]").toString();
    }

}

class Test {

    public static void main(String[] args) throws NoSuchFieldException {
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("============================= add(E num) =============================");
        for(int i = 0; i < 15; i++) {
            list.add(i);
            System.out.print(i + " ");
        }
        System.out.println("\n============================= add(E num) =============================");

        System.out.println("============================= get(int i) =============================");
        System.out.println("get = " + list.get(2));
        System.out.println("============================= get(int i) =============================");

        System.out.println();

        System.out.println("size = " + list.size());
        System.out.println("toString = " + list.toString());
        System.out.println();

        System.out.println("============================= add(int i, E num) =============================");
        list.add(0, 20);
        System.out.println("add(" + 0 + ", " + 20 + ")");
        System.out.println("============================= add(int i, E num) =============================");
        System.out.println();

        System.out.println("toString = " + list.toString());
        System.out.println();

        System.out.println("============================= remove(int i) =============================");
        list.remove(3);
        System.out.println("remove(" + 3 + ")");
        System.out.println("============================= remove(int i) =============================");
        System.out.println();

        System.out.println("size = " + list.size());
        System.out.println("toString = " + list.toString());
        System.out.println();

        System.out.println("============================= array type =============================");
        System.out.println("type = " + list.get(0).getClass());
        System.out.println("============================= array type =============================");
    }

}
