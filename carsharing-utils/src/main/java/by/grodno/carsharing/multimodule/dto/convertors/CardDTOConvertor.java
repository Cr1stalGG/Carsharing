package by.grodno.carsharing.multimodule.dto.convertors;

import by.grodno.carsharing.multimodule.dto.card.CardMainInfoDTO;
import by.grodno.carsharing.multimodule.entity.Card;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CardDTOConvertor {
	public CardMainInfoDTO convertEntityToDTO(Card source) {
		return CardMainInfoDTO.builder()
				.cardNumber(source.getCardNumber())
				.cash(source.getCash())
				.owner(AccountDTOConvertor.convertEntityToDTO(source.getOwner()))
				.build();
	}
}
