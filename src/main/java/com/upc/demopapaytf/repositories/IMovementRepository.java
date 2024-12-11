package com.upc.demopapaytf.repositories;

import com.upc.demopapaytf.entities.Movement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMovementRepository extends JpaRepository<Movement,Integer> {
    @Query(value = "Select number_account_banking as NumberAccountBanking,sum(amount_movement) as MoneyInvested \n" +
            "from movement \n" +
            "group by number_account_banking ",nativeQuery = true)
    public List<String[]> MoneyInvestedbyAccountBanking();

    @Query(value= "Select date_movement as DateMovement, count(date_movement) as Quantity\n" +
            "            from movement \n" +
            "            group by date_movement ",nativeQuery = true)
    public List<String[]> quantityMovementbyDate();

    @Query(value= "Select type_movement as Type_Movement,count (type_movement) as CountMovement \n" +
            "from movement \n" +
            "group by type_movement ",nativeQuery = true)
    public List<String[]> QuantityTypeMovement();

}