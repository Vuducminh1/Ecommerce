package WebProject.WebProject.entity;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.*;

@Entity
@Data // lombok giúp generate các hàm constructor, get, set v.v.
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
@Getter
@Setter
public class User {
	@Id()
//	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private String id;
	
	@Column(name = "login_Type", columnDefinition = "varchar(8)")
	private String login_Type;
	
	@Column(name = "role", columnDefinition = "varchar(5)")
	private String role;
	
	@Column(name = "password",columnDefinition = "varchar(25)")
	private String password;
	
	@Column(name = "full_Name", columnDefinition = "varchar(25)")
	private String full_Name;

	@Column(name = "avatar", columnDefinition = "varchar(100)")
	private String avatar;
	
	@Column(name = "email", columnDefinition = "varchar(25)")
	private String email;
	
	@Column(name = "phone_Number", columnDefinition = "varchar(20)")
	private String phone_Number;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<Order> order;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<Cart> cart;
}
