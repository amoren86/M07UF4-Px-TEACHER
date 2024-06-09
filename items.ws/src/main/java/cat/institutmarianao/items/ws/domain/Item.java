package cat.institutmarianao.items.ws.domain;

public class Item {

	private String ref;
	private String name;
	private Integer maxStock;
	private Integer availableStock;

	public Item() {
		maxStock = 0;
	}

	public Item(String id, String name, int availableStock) {
		this.ref = id;
		this.name = name;
		this.maxStock = availableStock;
		this.availableStock = maxStock;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMaxStock() {
		return maxStock;
	}

	public void setMaxStock(Integer maxStock) {
		this.maxStock = maxStock;
	}

	public Integer getAvailableStock() {
		return availableStock;
	}

	public void setAvailableStock(Integer availableStock) {
		this.availableStock = availableStock;
	}

	public int decreaseStock() {
		if (this.availableStock > 0) {
			this.availableStock--;
		}
		return this.availableStock;
	}

	public int increaseStock() {
		if (this.availableStock < this.maxStock) {
			this.availableStock++;
		}
		return this.availableStock;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ref == null) ? 0 : ref.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Item [ref=" + ref + ", name=" + name + ", available stock=" + availableStock + "]";
	}
}
