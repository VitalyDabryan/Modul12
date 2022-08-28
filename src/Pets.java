import java.util.Objects;

public class Pets {
    String animalBreed, name;
    int weight;

    public Pets(String animalBreed, String name, int weight) {
        if (animalBreed == null || name == null || weight <= 0)
            throw new IllegalArgumentException();
        this.animalBreed = animalBreed;
        this.name = name;
        this.weight = weight;
    }

    public String getAnimalBreed() {        return animalBreed;    }

    public String getName() {        return name;    }

    public int getWeight() {        return weight;    }

    @Override
    public String toString() {
        return "Pets{" +
                "animalBreed='" + animalBreed + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pets pets = (Pets) o;
        return animalBreed.equals(pets.animalBreed) && name.equals(pets.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalBreed, name);
    }

//    @Override
    public int compareTo(Pets o) {
        return this.weight - o.weight ;
    }
}
