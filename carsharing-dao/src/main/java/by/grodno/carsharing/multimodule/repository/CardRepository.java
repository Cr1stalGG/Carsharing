package by.grodno.carsharing.multimodule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import by.grodno.carsharing.multimodule.entity.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, Long>{

}
