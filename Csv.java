public class Csv {
    private String[] items;

    public Csv(String csvString) {
        this.items = csvString.split(",");
    }

    public String get(int index) {
        return items[index];
    }

    public int getInt(int index) {
        return Integer.parseInt(items[index]);
    }

    public double getDouble(int index) {
        return Double.parseDouble(items[index]);
    }

    public int size() {
        return items.length;
    }
}
