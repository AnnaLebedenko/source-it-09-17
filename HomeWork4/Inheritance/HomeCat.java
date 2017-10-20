package HomeWork4.Inheritance;

/**
 * Created by ANNA on 20.10.2017.
 */
public class HomeCat extends Cat{
        private String nameOfOwner;
        private String breed;
        private String name;
        private String vaccination;
        private String numberOfCertificate;

        public static String BRITISH = "british";
        public static String MAINECOON = "mainecoon";
        public static String NONE = "none";

    @Override
    public String getColour() {
        if (this.breed == HomeCat.BRITISH)
            return "grey";
        else return super.getColour();
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public void setNameOfOwner(String nameOfOwner) {
        this.nameOfOwner = nameOfOwner;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVaccination() {
        return vaccination;
    }

    public void setVaccination(String vaccination) {
        this.vaccination = vaccination;
    }

    public String getNumberOfCertificate() {
        return numberOfCertificate;
    }

    public void setNumberOfCertificate(String numberOfCertificate) {
        this.numberOfCertificate = numberOfCertificate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        HomeCat homeCat = (HomeCat) o;

        if (!getNameOfOwner().equals(homeCat.getNameOfOwner())) return false;
        if (!getBreed().equals(homeCat.getBreed())) return false;
        if (!getName().equals(homeCat.getName())) return false;
        if (!getVaccination().equals(homeCat.getVaccination())) return false;
        return getNumberOfCertificate().equals(homeCat.getNumberOfCertificate());

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getNameOfOwner().hashCode();
        result = 31 * result + getBreed().hashCode();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getVaccination().hashCode();
        result = 31 * result + getNumberOfCertificate().hashCode();
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new HomeCat(this);
    }

    public HomeCat(String colour, String size, int age, String character, int weight, String nameOfOwner, String breed, String name, String vaccination, String numberOfCertificate) {
        super(colour, size, age, character, weight);
        this.nameOfOwner = nameOfOwner;
        this.breed = breed;
        this.name = name;
        this.vaccination = vaccination;
        this.numberOfCertificate = numberOfCertificate;
    }

    public HomeCat(HomeCat cat) {
        super(cat);
        this.nameOfOwner = cat.nameOfOwner;
        this.breed = cat.breed;
        this.name = cat.name;
        this.vaccination = cat.vaccination;
        this.numberOfCertificate = cat.numberOfCertificate;
    }

    public HomeCat() {
        this.nameOfOwner = "Vasya";
        this.breed = "British";
        this.name = "Murzik";
        this.vaccination = "complex";
        this.numberOfCertificate = "02754";
    }
}
