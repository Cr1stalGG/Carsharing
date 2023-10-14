package by.grodno.carsharing.multimodule.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public class BaseEntity<T extends Number> {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private T id;
}
