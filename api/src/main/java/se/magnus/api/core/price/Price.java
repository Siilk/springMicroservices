package se.magnus.api.core.price;

public class Price {
    private final int productId;
    private final float fullPrice;
    private final float discountPrice;

    public Price() {
        this.productId = -1;
        this.fullPrice = 0;
        this.discountPrice = 0;
    }

    public Price(int productId, float fullPrice, float discountPrice) {
        this.productId = productId;
        this.fullPrice = fullPrice;
        this.discountPrice = discountPrice;
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
}
