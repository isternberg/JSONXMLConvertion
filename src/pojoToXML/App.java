package pojoToXML;

import java.io.*;
import java.util.*;

import javax.xml.bind.*;

public class App {

	private static final String WISHLIST_XML = "./wishlist-jaxb.xml";

	public static void main(String[] args) throws JAXBException, IOException {

		List<User> myWishlist = new ArrayList<>();

		User user1 = new User("Brandon", 29, "Women", "male");
		User user2 = new User("Branda", 29, "men", "female");
		User user3 = new User("Steve", 27, "men", "male");
		myWishlist.add(user1);
		myWishlist.add(user2);
		myWishlist.add(user3);
		OnlineDatingWishlist wishlist = new OnlineDatingWishlist(myWishlist);

		// create JAXB context and instantiate marshaller
		JAXBContext context = JAXBContext
				.newInstance(OnlineDatingWishlist.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

		// Write to System.out
		marshaller.marshal(wishlist, System.out);

		// Write to File
		marshaller.marshal(wishlist, new File(WISHLIST_XML));
	}
}