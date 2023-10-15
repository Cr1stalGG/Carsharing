package by.grodno.carsharing.multimodule.service;

import org.springframework.stereotype.Service;

import by.grodno.carsharing.multimodule.api.AdminService;
import by.grodno.carsharing.multimodule.dto.car.CarCreationDTO;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService{@Override
	public String addCar(CarCreationDTO carDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteCar(long carId) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
