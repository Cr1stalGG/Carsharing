package by.grodno.carsharing.multimodule.service;

import java.util.List;

import org.springframework.stereotype.Service;

import by.grodno.carsharing.multimodule.api.CarService;
import by.grodno.carsharing.multimodule.dto.car.BoughtCarMainInfoDTO;
import by.grodno.carsharing.multimodule.dto.car.CarMainInfoDTO;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService{@Override
	public String buyCar(long accountId, long carId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CarMainInfoDTO getMainInfo(long carId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoughtCarMainInfoDTO getBoughtCar(long accountId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CarMainInfoDTO> getAllCars() {
		// TODO Auto-generated method stub
		return null;
	}

}
