public class Assistant implements Person {
    private String name;
    private String id;

    public Assistant () {
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName () {
        return this.name;
    }

    public void setId (String id) {
        this.id = id;
    }

    public String getId () {
        return this.id;
    }
}
