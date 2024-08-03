package edu.miu.cs.cs425.repository;

//import org.springframework.data.jpa.repository.JpaRepository;
import edu.miu.cs.cs425.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

//import Ecom.Model.CartItem;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Integer> {

    @Transactional
    @Modifying
    @Query("DELETE FROM CartItem ci WHERE ci.cart.cartId = :cartId AND ci.product.productId = :productId")
    public void removeProductFromCart(@Param("cartId") Integer cartId, @Param("productId") Integer productId);

    @Transactional
    @Modifying
    @Query("DELETE FROM CartItem ci WHERE ci.cart.cartId = :cartId ")
    public void removeAllProductFromCart(@Param("cartId") Integer cartId);

}