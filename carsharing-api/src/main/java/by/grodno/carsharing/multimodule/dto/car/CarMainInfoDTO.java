package by.grodno.carsharing.multimodule.dto.car;

import by.grodno.carsharing.multimodule.enumiration.CarType;
import by.grodno.carsharing.multimodule.enumiration.Color;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CarMainInfoDTO {
	private CarType carType;
	private Color color;
	private double currency;
}
