package cat.institutmarianao.items.ws.repository.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import cat.institutmarianao.items.ws.domain.Item;
import cat.institutmarianao.items.ws.repository.ItemRepository;

public class InMemoryItemRepository implements ItemRepository {

	private final Map<String, Item> items = new HashMap<String, Item>();

	public InMemoryItemRepository() {
		Item cocaCola = new Item("1", "Coca-Cola", 15);
		Item orangeFanta = new Item("2", "Fanta Naranja", 15);
		items.put("1", cocaCola);
		items.put("2", orangeFanta);
	}

	@Override
	public Collection<Item> getAllItems() {
		return items.values();
	}

	@Override
	public Item decreaseStock(String ref) {
		Item reservation = this.items.get(ref);
		reservation.decreaseStock();
		return reservation;
	}

	@Override
	public Item increaseStock(String ref) {
		Item reservation = this.items.get(ref);
		reservation.increaseStock();
		return reservation;
	}
}
