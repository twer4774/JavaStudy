package Custom.vehicle;

public enum Size {
 SMALL("small"),
 NORMAL("normal"),
 BIG("big");

 private String size;

    Size(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}
