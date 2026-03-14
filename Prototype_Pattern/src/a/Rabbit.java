package a;

public class Rabbit implements Cloneable {

    private int age;
    private Person owner;

    public Rabbit(int age, Person owner) {
        this.age = age;
        this.owner = owner;
    }

    public int getAge() {
        return age;
    }

    public Person getOwner() {
        return owner;
    }

    @Override
    public Rabbit clone() {

        try {

            Rabbit cloned = (Rabbit) super.clone();

            cloned.owner = owner.clone();

            return cloned;

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException();
        }
    }

    @Override
    public String toString() {
        return "Rabbit age=" + age +
                ", owner=" + owner.getName();
    }
}
