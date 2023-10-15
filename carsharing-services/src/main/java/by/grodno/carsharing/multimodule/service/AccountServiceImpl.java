package by.grodno.carsharing.multimodule.service;

import org.springframework.stereotype.Service;

import by.grodno.carsharing.multimodule.api.AccountService;
import by.grodno.carsharing.multimodule.dto.account.AccountMainInfoDTO;
import by.grodno.carsharing.multimodule.dto.account.security.AuthRequest;
import by.grodno.carsharing.multimodule.dto.account.security.AuthResponse;
import by.grodno.carsharing.multimodule.repository.AccountRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService{
	private final AccountRepository accountRepository;

	@Override
	public AuthResponse registration(AuthRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AuthResponse authentication(AuthRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountMainInfoDTO getAccount(long accountId) {
		// TODO Auto-generated method stub
		return null;
	}

}
