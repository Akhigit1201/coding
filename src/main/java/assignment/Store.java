package assignment;

public class Store {
    private String storeId;

    public Store(String storeId) {
        this.storeId = String.format("%04d",Integer.parseInt(storeId));
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    @Override
    public String toString() {
        return "Store{" +
                "storeId='" + storeId + '\'' +
                '}';
    }
}
