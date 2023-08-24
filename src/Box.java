public class Box <T> {
    private T name;

    public Box(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
    public static <T>Box<T>method(Box<T>box){
        System.out.println(box);
        return box;
    }

    @Override
    public String toString() {
        return "Box{" +
                "name=" + name +
                '}';
    }
}
