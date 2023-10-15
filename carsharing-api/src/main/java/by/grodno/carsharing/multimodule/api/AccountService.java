package by.grodno.carsharing.multimodule.api;

import by.grodno.carsharing.multimodule.dto.account.AccountMainInfoDTO;
import by.grodno.carsharing.multimodule.dto.account.security.AuthRequest;
import by.grodno.carsharing.multimodule.dto.account.security.AuthResponse;

public interface AccountService {
	AuthResponse registration(AuthRequest request);
	AuthResponse authentication(AuthRequest request);
	
	AccountMainInfoDTO getAccount(long accountId);
	
}
