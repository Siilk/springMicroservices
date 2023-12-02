package se.magnus.api.core.price;

public class Price {
    private final int productId;
    private final float fullPrice;
    private final float discountPrice;
    private final String serviceAddress;

    public Price() {
        this.productId = -1;
        this.fullPrice = 0;
        this.discountPrice = 0;
        this.serviceAddress = "";
    }

    public Price(int productId, float fullPrice, float discountPrice, String serviceAddress) {
        this.productId = productId;
        this.fullPrice = fullPrice;
        this.discountPrice = discountPrice;
        this.serviceAddress = serviceAddress;
    }

    public int getProductId() {
        return productId;
    }

    public float getFullPrice() {
        return fullPrice;
    }

    public float getDiscountPrice() {
        return discountPrice;
    }

    public String getServiceAddress() {
        return serviceAddress;
    }
}
