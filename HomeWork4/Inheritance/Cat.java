package HomeWork4.Inheritance;

/**
 * Created by ANNA on 20.10.2017.
 */
public class Cat {
    protected String colour;
    protected String size;
    protected int age;
    protected String character;
    protected int weight;

    public static String SMALL = "small";
    public static String MEDIUM = "medium";
    public static String BIG = "big";

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if(correctSize(size))
            this.size = size;
        else this.size = null;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(correctAge(age))
        this.age = age;
        else System.out.println("you inputed wrong age");
    }
    public void setAge(float age){
        this.setAge((int) age);
    }
    public void setAge(double age){
        this.setAge((int) age);
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(correctWeight(weight))
            this.weight = weight;
        else System.out.println("you inputed wrong weight");
    }
    private boolean correctSize(String size){
       return  size == "big"|| size == "small" || size == "medium";
    }
    private boolean correctAge(int age){
        return age > 0;
    }
    private boolean correctWeight(int weight){
       return weight > 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        if (getAge() != cat.getAge()) return false;
        if (getWeight() != cat.getWeight()) return false;
        if (!getColour().equals(cat.getColour())) return false;
        if (!getSize().equals(cat.getSize())) return false;
        return getCharacter().equals(cat.getCharacter());

    }

    @Override
    public int hashCode() {
        int result = getColour().hashCode();
        result = 31 * result + getSize().hashCode();
        result = 31 * result + getAge();
        result = 31 * result + getCharacter().hashCode();
        result = 31 * result + getWeight();
        return result;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Cat(this);
    }

    public Cat(String colour, String size, int age, String character, int weight) {
        this.colour = colour;
        this.size = size;
        this.age = age;
        this.character = character;
        this.weight = weight;
    }

    public Cat() {
        this.colour = "white";
        this.size = "medium";
        this.age = 1;
        this.character = "sweet";
        this.weight = 5;
    }

    public Cat(Cat cat){
        this.colour = cat.colour;
        this.size = cat.size;
        this.age = cat.age;
        this.character = cat.character;
        this.weight = cat.weight;
    }
}
