package by.grodno.carsharing.multimodule.service;

import org.springframework.stereotype.Service;

import by.grodno.carsharing.multimodule.api.AccountService;
import by.grodno.carsharing.multimodule.repository.AccountRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService{
	private final AccountRepository accountRepository;

}
