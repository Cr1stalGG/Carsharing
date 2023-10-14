package by.grodno.carsharing.multimodule.dto.account;

import by.grodno.carsharing.multimodule.dto.car.BoughtCarMainInfoDTO;
import by.grodno.carsharing.multimodule.dto.card.CardMainInfoDTO;
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
public class AccountMainInfoDTO {
	private String mail;
	private CardMainInfoDTO card;
	private BoughtCarMainInfoDTO boughtCar;
}
