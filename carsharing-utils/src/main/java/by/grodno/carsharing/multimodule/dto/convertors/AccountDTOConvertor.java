package by.grodno.carsharing.multimodule.dto.convertors;

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
	
}
