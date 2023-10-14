package by.grodno.carsharing.multimodule.dto.card;

import by.grodno.carsharing.multimodule.dto.account.AccountMainInfoDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CardMainInfoDTO {
	private String cardNumber;
	private double cash;
	
	private AccountMainInfoDTO owner;
}
