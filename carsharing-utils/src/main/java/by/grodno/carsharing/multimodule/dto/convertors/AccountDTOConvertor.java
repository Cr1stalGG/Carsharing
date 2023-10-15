package by.grodno.carsharing.multimodule.dto.convertors;

import by.grodno.carsharing.multimodule.dto.account.AccountMainInfoDTO;
import by.grodno.carsharing.multimodule.dto.account.security.AuthRequest;
import by.grodno.carsharing.multimodule.entity.Account;
import lombok.experimental.UtilityClass;

@UtilityClass
public class AccountDTOConvertor {
	public Account convertDTOToEntity(AuthRequest source) {
		return Account.builder()
				.mail(source.getMail())
				.password(source.getPassword())
				.build();
		}
	
	public AccountMainInfoDTO convertEntityToDTO(Account source) {
		return AccountMainInfoDTO.builder()
				.mail(source.getMail())
				.card(CardDTOConvertor.convertEntityToDTO(source.getCard()))
				.boughtCar(BoughtCarDTOConvertor.convertEntityToDTO(source.getBoughtCar()))
				.build();
	}
	
}
