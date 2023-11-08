public class Identification implements Cloneable {
    private int id;

    public Identification(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Identification{" +
                "id=" + id +
                '}';
    }
}
