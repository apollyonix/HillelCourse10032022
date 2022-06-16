package ua.hillel.rest;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

@Getter
@Setter
@NoArgsConstructor
public class Order {
  private Long id;
  private Long petId;
  private int quantity;
  private String shipDate;


}
