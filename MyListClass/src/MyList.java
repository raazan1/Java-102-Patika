public class MyList<T> {
    private int capacty;
    private T[] Array;
    private int lengthCount;

    public MyList() {
        setCapacty(10);
        setArray((T[]) new Object[getCapacty()]);

    }
    public MyList(int capacty){
        setCapacty(capacty);
        setArray((T[]) new Object[getCapacty()]);
    }
    public void remove(int index){
        if(getArray()[index] != null){
            getArray()[index] = null;
            for (int i = index + 1; i <= size(); i++) {
                getArray()[i - 1] = getArray()[i];
            }
        }

    }
    public boolean isEmpty(){
        for (int i = 0; i < capacty; i++) {
            if(getArray()[i] != null){
                lengthCount++;
                return true;
            }
            i = capacty;
        }
        return false;
    }

    public int getCapacty() {
        return capacty;
    }
    public void clear(){
        for (int i = 0; i < capacty; i++) {
            if(getArray()[i] != null){
                getArray()[i] = null;
            }
        }
    }

    public void setCapacty(int capacty) {
        this.capacty = capacty;
    }

    public T[] getArray() {
        return Array;
    }

    public void setArray(T[] array) {
        Array = array;
    }

    public int getLengthCount() {
        return lengthCount;
    }

    public void setLengthCount(int lengthCount) {
        this.lengthCount = lengthCount;
    }
    public T[] Array() {
        return this.Array;
    }
    public void Array(Object[] array) {
        this.Array = (T[]) array;
    }

    public void add(T data){
        if(size()>=getCapacty()){
            CapactyDouble();
        }
        this.Array()[size()] = data;
    }
    public void CapactyDouble(){
        setCapacty(getCapacty()*2);
    }
    public int size() {
        int count = 0;
        for (int i = 0; i < getCapacty(); i++) {
            if (getArray()[i] != null)
                count++;
        }
        return count;
    }


    public int get(int indis){
        if(getArray()[indis] != null){
            return (int) getArray()[indis];
        }
        return 0;
    }
}
