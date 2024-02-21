public class Create_toy {
    int id;
    String name;
    int lossRate;

    public Create_toy(int id, String name, int lossRate){
        this.id = id;
        this.name = name;
        this.lossRate = lossRate;
    }

    @Override
    public String toString() {
        return "Create_toy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lossRate=" + lossRate +
                '}';
    }
}
