package ua.hillel.lesson12;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class ProductUtilTest {
  public static void main(String[] args) {
    ProductUtil.Product product = new ProductUtil.Product();
    product.setId("id1");


    CatalogPage catalogPage = new CatalogPage();
    catalogPage.setFilter("id");
    catalogPage.applyFilter();

    CatalogPage.ProductTable productTable = catalogPage.new ProductTable();
    productTable.getCategory();


  }
}
