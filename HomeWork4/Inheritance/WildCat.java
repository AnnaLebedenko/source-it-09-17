package HomeWork4.Inheritance;

/**
 * Created by ANNA on 20.10.2017.
 */
public class WildCat extends Cat {
    private String home;
    private String victim;
    private float dangerLevel;
    private int lifeLength;
    private String uniqCharacter;

    public static float LOW = 1;
    public static float HIGH = 10;
    public static float MEDIUM = 5;

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getVictim() {
        return victim;
    }

    public void setVictim(String victim) {
        this.victim = victim;
    }

    public float getDangerLevel() {
        return dangerLevel;
    }

    public void setDangerLevel(float dangerLevel) {
        if(correctDangerLevel(dangerLevel))
        this.dangerLevel = dangerLevel;
        else System.out.println("Input correct value");
    }

    public int getLifeLength() {
        return lifeLength;
    }

    public void setLifeLength(int lifeLength) {
        if(correctLifeLength(lifeLength))
        this.lifeLength = lifeLength;
        else System.out.println("Input correct value");
    }

    public String getUniqCharacter() {
        return uniqCharacter;
    }

    public void setUniqCharacter(String uniqCharacter) {
        this.uniqCharacter = uniqCharacter;
    }
    private boolean correctDangerLevel(float dangerLevel){
        return dangerLevel >= 0;
    }
    private boolean correctLifeLength(int lifeLength){
        return lifeLength > 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        WildCat wildCat = (WildCat) o;

        if (Float.compare(wildCat.getDangerLevel(), getDangerLevel()) != 0) return false;
        if (getLifeLength() != wildCat.getLifeLength()) return false;
        if (!getHome().equals(wildCat.getHome())) return false;
        if (!getVictim().equals(wildCat.getVictim())) return false;
        return getUniqCharacter().equals(wildCat.getUniqCharacter());

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getHome().hashCode();
        result = 31 * result + getVictim().hashCode();
        result = 31 * result + (getDangerLevel() != +0.0f ? Float.floatToIntBits(getDangerLevel()) : 0);
        result = 31 * result + getLifeLength();
        result = 31 * result + getUniqCharacter().hashCode();
        return result;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new WildCat(this);
    }

    public WildCat(String colour, String size, int age, String character, int weight, String home, String victim, float dangerLevel, int lifeLength, String uniqCharacter) {
        super(colour, size, age, character, weight);
        this.home = home;
        this.victim = victim;
        this.dangerLevel = dangerLevel;
        this.lifeLength = lifeLength;
        this.uniqCharacter = uniqCharacter;
    }

    public WildCat(WildCat cat) {
        super(cat);
        this.home = cat.home;
        this.victim = cat.victim;
        this.dangerLevel = cat.dangerLevel;
        this.lifeLength = cat.lifeLength;
        this.uniqCharacter = cat.uniqCharacter;
    }

    public WildCat() {
        super();
        this.home = "forest";
        this.victim = "mouse";
        this.dangerLevel = 5;
        this.lifeLength = 15;
        this.uniqCharacter = "none";
    }
}
