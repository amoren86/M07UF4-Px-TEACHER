package cat.institutmarianao.items.ws.repository;

import java.util.Collection;

import cat.institutmarianao.items.ws.domain.Item;

public interface ItemRepository {
	Collection<Item> getAllItems();

	Item decreaseStock(String ref);

	Item increaseStock(String ref);
}
