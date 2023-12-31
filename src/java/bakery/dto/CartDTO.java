/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bakery.dto;

/**
 *
 * @author Kle
 */
public class CartDTO {
    private int cartId;
    private CustomerDTO customerId;

    public CartDTO() {
    }

    public CartDTO(int cartId, CustomerDTO customerId, int quantity) {
        this.cartId = cartId;
        this.customerId = customerId;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public CustomerDTO getCustomerId() {
        return customerId;
    }

    public void setCustomerId(CustomerDTO customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "CartDTO{" + "cartId=" + cartId + ", customerId=" + customerId + '}';
    }   
    
}
