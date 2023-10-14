package by.grodno.carsharing.multimodule.dto.account.security;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class AuthRequest {
	private String mail;
	private String password;
}
