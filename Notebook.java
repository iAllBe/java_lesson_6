public class Notebook {
    static int startId = 1;
    int id;
    private String name;
    Integer yearEdition;
    Integer weight;

    public Notebook(String name, Integer yearEdition, Integer weight) {
        id = startId;
        this.name = name;
        this.yearEdition = yearEdition;
        this.weight = weight;
        this.id = startId;
        startId++;
    }

    @Override
    public String toString() {
        return "id: " + id + ", Имя: " + name + ", год: " + yearEdition + ", вес: " + weight;
    }

    public Integer getWeight() {
        return weight;
    }

    public Integer getYearEdition() {
        return yearEdition;
    }
}
