package cat.institutmarianao.items.ws.service;

import java.util.List;

import cat.institutmarianao.items.ws.domain.Item;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public interface ItemServiceEndpoint {

	@WebMethod
	List<Item> getAllItems();

	@WebMethod
	Item increaseStock(String itemRef);

	@WebMethod
	Item decreaseStock(String itemRef);
}
