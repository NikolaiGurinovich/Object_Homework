import java.util.Objects;

public class User implements Cloneable {

    private int age;
    private String name;

    Identification identification;

    public User(int age, String name, Identification identification) {
        this.age = age;
        this.name = name;
        this.identification = identification;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", identification=" + identification +
                '}';
    }

    protected Object clone(String cloneType) throws CloneNotSupportedException {
        if (cloneType.toLowerCase().equals("lightclone")) {
            lightClone();
            return super.clone();
        } else if (cloneType.toLowerCase().equals("deepclone")) {
            deepClone();
            return deepClone();
        } else return "null";
    }

    private Object lightClone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Object deepClone() throws CloneNotSupportedException {
        User userClone = (User) super.clone();
        userClone.identification = (Identification) this.identification.clone();
        return userClone;
    }
}
