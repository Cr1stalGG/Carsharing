package by.grodno.carsharing.multimodule.entity;

import by.grodno.carsharing.multimodule.enumiration.CarType;
import by.grodno.carsharing.multimodule.enumiration.Color;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
public class Car extends BaseEntity<Long>{
	private CarType carType;
	private Color color;
	private double currency;
}
