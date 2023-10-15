package by.grodno.carsharing.multimodule.dto.convertors;

import by.grodno.carsharing.multimodule.dto.car.BoughtCarMainInfoDTO;
import by.grodno.carsharing.multimodule.entity.BoughtCar;
import lombok.experimental.UtilityClass;

@UtilityClass
public class BoughtCarDTOConvertor {
	public BoughtCarMainInfoDTO convertEntityToDTO(BoughtCar source) {
		return BoughtCarMainInfoDTO.builder()
					.carType(source.getCarType())
					.color(source.getColor())
					.dateOfBuying(source.getDateOfBuying())
					.time(source.getTime())
					.build();
	}
}
