package by.grodno.carsharing.multimodule.entity;

import java.util.List;

import by.grodno.carsharing.multimodule.enumiration.RoleConstant;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString
public class Role extends BaseEntity<Long>{
	@Builder.Default
	private RoleConstant role = RoleConstant.ROLE_USER;
	@Transient
	@ManyToMany(mappedBy = "roles", cascade = CascadeType.ALL)
	private List<Account> accounts;
}
