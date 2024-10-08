package edu.miu.cs.cs425.repository;


import edu.miu.cs.cs425.model.Shipper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ShipperRepository extends JpaRepository<Shipper, Integer> {

}
