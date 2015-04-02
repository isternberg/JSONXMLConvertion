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

	public OnlineDatingWishlist(List<User> users) {
		super();
		this.users = users;
	}
}
