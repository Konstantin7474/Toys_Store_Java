public class Participant implements Comparable<Participant>{
    private String name;
    private int id;
    private static int totalCount = 0;


    public Participant(String name) {
        this.name = name;
        this.id = totalCount++;
    }

    public Participant() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Participant other) {
        return Integer.compare(this.id, other.id);
    }
}




