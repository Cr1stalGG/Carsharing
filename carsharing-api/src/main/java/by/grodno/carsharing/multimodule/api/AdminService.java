package by.grodno.carsharing.multimodule.api;

import by.grodno.carsharing.multimodule.dto.car.CarCreationDTO;

public interface AdminService {
	String addCar(CarCreationDTO carDTO);
	String deleteCar(long carId);
}
