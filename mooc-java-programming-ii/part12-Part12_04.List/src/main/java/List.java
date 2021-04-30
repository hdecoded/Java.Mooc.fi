public class List<Type> {

    private Type[] values;
    private int firstFreeIndex;

    public List() {
        this.values = (Type[]) new Object[10];
    }

    public void add(Type type) {
        if (firstFreeIndex == this.values.length) {
            grow();
        }
        this.values[this.firstFreeIndex] = type;
        firstFreeIndex++;
    }

    private void grow() {
        int newSize = this.values.length + (this.values.length / 2);
        Type[] newValues = (Type[]) new Object[newSize];
        for (int i = 0; i < this.values.length; i++) {
            newValues[i] = this.values[i];
        }
        this.values = newValues;
    }

    public boolean contains(Type Value) {
        return indexOfValue(Value) >= 0;
    }

    public void remove(Type Value) {
        int index = indexOfValue(Value);
        if(index <0){
            return;
        }
        moveToLeft(index);
        this.firstFreeIndex--;
    }

    public void moveToLeft(int fromindex) {
        for (int i = fromindex; i < firstFreeIndex - 1; i++) {
            this.values[i] = this.values[i + 1];
        }
    }

    public int indexOfValue(Type Value) {
        for (int i = 0; i < this.firstFreeIndex -1; i++) {
            if (this.values[i].equals(Value)) {
                return i;
            }
        }
        return -1;
    }

    public Type value(int index){
        if(index < 0 || index >= this.firstFreeIndex){
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.firstFreeIndex + "]");
        }

        return this.values[index];
    }

    public int size(){
        return this.values.length;
    }
}