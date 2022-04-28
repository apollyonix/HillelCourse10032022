package ua.hillel.lesson12;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ProductUtil {
  public static void main(String[] args) {
    //product1
//    ProductPage.setProductId("id1");
//    ProductPage.setProductName("prod1");
//    ProductPage.setProductCategory("cat");

//    createProduct("id1", "name1", "cat");
    Product product1 = new Product();
    product1.name = "name1";
    product1.id = "id1";
    product1.category = "cat";
    product1.price = 12.46;
    createProductNew(product1);

    //product2
//    ProductPage.setProductId("id2");
//    ProductPage.setProductName("prod2");
//    ProductPage.setProductCategory("cat");
    createProductOld("id2", "name2", "cat", 12.66);

  }


  private static void createProductNew(Product product) {
    ProductPage.setProductId(product.id);
    ProductPage.setProductName(product.name);
    ProductPage.setProductCategory(product.category);
    if (product.price != 0) {
      ProductPage.setPrice(product.price);
    }
  }

  private static void createProductOld(String id, String name, String category, double price) {
    ProductPage.setProductId(id);
    ProductPage.setProductName(name);
    ProductPage.setProductCategory(category);
  }

  public static class Product {
    private String name, id, category;
    private double price;

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getId() {
      return id;
    }

    public void setId(String id) {
      this.id = id;
    }

    public String getCategory() {
      return category;
    }

    public void setCategory(String category) {
      this.category = category;
    }

    public double getPrice() {
      return price;
    }

    public void setPrice(double price) {
      this.price = price;
    }
  }
}
