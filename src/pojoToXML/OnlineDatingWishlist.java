package pojoToXML;
import java.util.*;

import javax.xml.bind.annotation.*;

@XmlRootElement
public class OnlineDatingWishlist {

	@XmlElementWrapper(name = "premium users")
	@XmlElement(name = "user")
	List<User> users;

	public OnlineDatingWishlist() {

	}

	// public List<User> getUsers() {
	// return users;
	// }

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public OnlineDatingWishlist(List<User> users) {
		super();
		this.users = users;
	}
}
