public class Hideout<T> {

    T hideout;

    public Hideout() {
    }

    public void putIntoHideout(T toHide) {
        hideout = toHide;
    }

    public T takeFromHideout() {

        T t = this.hideout;
        this.hideout = null;
        return t;
    }

    public boolean isInHideout() {
        return this.hideout != null;
    }
}
