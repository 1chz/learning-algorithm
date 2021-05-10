import java.util.Arrays;

public class ArrayList<E> {
    
    private E[] o;
    private int size = 0;
    
    public ArrayList() {
        this.o = (E[]) new Object[10];
    }
    
    public E get(int i) {
        if(i > size - 1) {
            throw new IndexOutOfBoundsException("Index is too big !");
        }
        return (E) o[i];
    }
    
    public int size() {
        return this.size;
    }
    
    public void add(E num) {
        if(size == o.length) {
            this.o = Arrays.copyOf(o, o.length + 10);
        }
        this.o[size] = num;
        size++;
    }
    
    public void add(int i, E num) {
        if(i > size - 1) {
            throw new IndexOutOfBoundsException("Index is too big !");
        }
        if(size == o.length) {
            this.o = Arrays.copyOf(o, o.length + 10);
        }
        for(int j = size - 1; j >= i; j--) {
            this.o[j + 1] = o[j];
        }
        this.o[i] = num;
        size++;
    }
    
    public void remove(int i) {
        if(i > size - 1) {
            throw new IndexOutOfBoundsException("Index is too big !");
        }
        for(int j = i + 1; j < size; j++) {
            this.o[j - 1] = o[j];
        }
        this.o[size] = null;
        size--;
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