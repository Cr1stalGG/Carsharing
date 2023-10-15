package by.grodno.carsharing.multimodule.service;

import org.springframework.stereotype.Service;

import by.grodno.carsharing.multimodule.api.CardService;
import by.grodno.carsharing.multimodule.dto.card.CardCreationDTO;
import by.grodno.carsharing.multimodule.dto.card.CardMainInfoDTO;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService{@Override
	public String putMoney() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addCard(CardCreationDTO cardDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CardMainInfoDTO getCard(long cardId) {
		// TODO Auto-generated method stub
		return null;
	}

}
