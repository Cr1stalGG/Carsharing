package by.grodno.carsharing.multimodule.api;

import by.grodno.carsharing.multimodule.dto.card.CardCreationDTO;
import by.grodno.carsharing.multimodule.dto.card.CardMainInfoDTO;

public interface CardService {
	String putMoney();
	String addCard(CardCreationDTO cardDTO);
	CardMainInfoDTO getCard(long cardId);
}
