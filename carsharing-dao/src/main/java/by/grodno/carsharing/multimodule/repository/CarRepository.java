package by.grodno.carsharing.multimodule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import by.grodno.carsharing.multimodule.entity.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long>{

}
