package by.grodno.carsharing.multimodule.dto.car;

import by.grodno.carsharing.multimodule.enumiration.CarType;
import by.grodno.carsharing.multimodule.enumiration.Color;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CarCreationDTO {
	private CarType carType;
	private Color color;
	private double currency;
}
