package by.grodno.carsharing.multimodule.dto.card;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CardCreationDTO {
	private String cardNumber;
	private double cash;
}
