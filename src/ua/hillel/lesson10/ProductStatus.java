package ua.hillel.lesson10;

public enum ProductStatus {
  DRAFT("Draft"),
  ACTIVE("Active"),
  OUT_OF_SALE("Out of Sale"),
  DISCOUNT("Discount");

  private String status;

  private ProductStatus(String status) {
    this.status = status;
  }

  public String getStatus() {
    return this.status;
  }
}
