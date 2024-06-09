package cat.institutmarianao.items.ws.service.impl;

import java.util.ArrayList;
import java.util.List;

import cat.institutmarianao.items.ws.domain.Item;
import cat.institutmarianao.items.ws.repository.ItemRepository;
import cat.institutmarianao.items.ws.repository.impl.InMemoryItemRepository;
import cat.institutmarianao.items.ws.service.ItemServiceEndpoint;
import jakarta.jws.WebService;

@WebService(serviceName = "ItemService", endpointInterface = "cat.institutmarianao.items.ws.service.ItemServiceEndpoint")
public class ItemServiceEndpointImpl implements ItemServiceEndpoint {

	private final ItemRepository itemRepository = new InMemoryItemRepository();

	@Override
	public List<Item> getAllItems() {
		return new ArrayList<>(itemRepository.getAllItems());
	}

	@Override
	public Item increaseStock(String itemRef) {
		return itemRepository.increaseStock(itemRef);
	}

	@Override
	public Item decreaseStock(String itemRef) {
		return itemRepository.decreaseStock(itemRef);
	}

}