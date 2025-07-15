package com.example.BaseClasses;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cartItemId;
    @ManyToOne
    private Cart cart;
    @ManyToOne
    private ItemVariant itemVariant;
    private Integer quantity;
    public CartItem( Cart cart, com.example.BaseClasses.ItemVariant itemVariant,
            Integer quantity) {
        
        this.cart = cart;
        this.itemVariant = itemVariant;
        this.quantity = quantity;
    }
    public CartItem(){

    }
    public Integer getCartItemId() {
        return cartItemId;
    }
    public void setCartItemId(Integer cartItemId) {
        this.cartItemId = cartItemId;
    }
    public Cart getCart() {
        return cart;
    }
    public void setCart(Cart cart) {
        this.cart = cart;
    }
    public ItemVariant getItemVariant() {
        return itemVariant;
    }
    public void setItemVariant(ItemVariant itemVariant) {
        this.itemVariant = itemVariant;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return "CartItem [cartItemId=" + cartItemId + ", cart=" + cart + ", itemVariant=" + itemVariant + ", quantity="
                + quantity + "]";
    }

    
   
    
}
