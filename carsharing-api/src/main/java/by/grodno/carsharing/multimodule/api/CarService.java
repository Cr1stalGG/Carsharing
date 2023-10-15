package by.grodno.carsharing.multimodule.api;

import java.util.List;	

import by.grodno.carsharing.multimodule.dto.car.BoughtCarMainInfoDTO;
import by.grodno.carsharing.multimodule.dto.car.CarMainInfoDTO;

public interface CarService {
	String buyCar(long accountId, long carId);
	CarMainInfoDTO getMainInfo(long carId);
	BoughtCarMainInfoDTO getBoughtCar(long accountId);
	List<CarMainInfoDTO> getAllCars();
}
