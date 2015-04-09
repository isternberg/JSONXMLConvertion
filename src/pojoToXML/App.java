package pojoToXML;

import java.io.*;
import java.util.*;

import converters.*;

public class App {

	private static final String WISHLIST_XML = "./wishlist.xml";
	private static final String WISHLIST_JSON = "./wishlist.json";

	public static void main(String[] args) throws PojoConvertorException,
			IOException {

		List<User> myWishlist = new ArrayList<>();

		User user1 = new User("Brandon", 29, "Women", "female");
		User user2 = new User("Branda", 29, "men", "female");
		User user3 = new User("Steve", 27, "men", "male");
		myWishlist.add(user1);
		myWishlist.add(user2);
		myWishlist.add(user3);
		OnlineDatingWishlist wishlist = new OnlineDatingWishlist(myWishlist);

		PojoConverter<OnlineDatingWishlist> xmlConverter = new ToXmlConverter<>();
		PojoConverter<OnlineDatingWishlist> jsonConvertor = new ToJsonConverter<>();

		String xml = xmlConverter.convertPojo(OnlineDatingWishlist.class,
				wishlist);
		String json = jsonConvertor.convertPojo(OnlineDatingWishlist.class,
				wishlist);

		// Write to System.out
		System.out.println(xml);
		System.out.println(json);
		// Write to File
		FileWriter xmlFileWriter = new FileWriter(new File(WISHLIST_XML));
		xmlFileWriter.write(xml);
		xmlFileWriter.close();
		FileWriter jsonFileWriter = new FileWriter(new File(WISHLIST_JSON));
		jsonFileWriter.write(json);
		jsonFileWriter.close();

	}
}