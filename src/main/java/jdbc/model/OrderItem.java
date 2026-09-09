package jdbc.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class OrderItem {

    private Long id;
    private Long orderId;
    private Long productId;
    private Integer quantity;
    private BigDecimal subtotal;
    private Timestamp createdAt;

    public OrderItem() {}

    public OrderItem(Long id, Long orderId, Long productId, Integer quantity, BigDecimal subtotal, Timestamp createdAt) {
        this.id = id;
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
        this.subtotal = subtotal;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", subtotal=" + subtotal +
                ", createdAt=" + createdAt +
                '}';
    }
}
