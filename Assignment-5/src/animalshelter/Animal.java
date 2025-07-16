package src.animalshelter;

public abstract class Animal {
    private final String name;
    private int order;

    public Animal(String name) {
        this.name = name;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getOrder() {
        return order;
    }

    public String getName() {
        return name;
    }

    public boolean isOlderThan(Animal a) {
        return this.order < a.getOrder();
    }
}