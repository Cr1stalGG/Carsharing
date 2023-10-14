package by.grodno.carsharing.multimodule.dto.car;

import java.sql.Date;
import java.sql.Time;

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
public class BoughtCarMainInfoDTO {
	private CarType carType;
	private Color color;
	private Time time;
	private Date dateOfBuying;
}
