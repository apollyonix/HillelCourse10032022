package ua.hillel.lesson12;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class CatalogPage {
  public void setFilter(String filter) {}

  public void applyFilter() {}

  public class ProductTable {
    private String id, name, category;
    private double price;
    public ProductTable() {
      //parse real table
    }

    public String getId() {
      return id;
    }

    public String getName() {
      return name;
    }

    public String getCategory() {
      return category;
    }

    public double getPrice() {
      return price;
    }
  }
}
