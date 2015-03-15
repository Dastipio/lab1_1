package pl.com.bottega.ecommerce.sales.domain.offer;

import java.util.Date;

public class ProductSnapshot {
	
	private String Id;

	private Money Price;

	private String Name;

	private Date SnapshotDate;

	private String Type;

	public ProductSnapshot(String id, Money price, String name,
			Date snapshotDate, String type, String currency) {
		super();
		this.Id = id;
		this.Price = price;
		this.Name = name;
		this.SnapshotDate = snapshotDate;
		this.Type = type;
	}



	public String getProductName() {
		return Name;
	}

	public Date getProductSnapshotDate() {
		return SnapshotDate;
	}

	public String getProductType() {
		return Type;
	}


	public String getProductId() {
		return Id;
	}

	public Money getProductPrice() {
		return Price;
	}
	@Override
	public boolean equals(Object obj) {
		ProductSnapshot other = (ProductSnapshot) obj;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (Price == null) {
			if (other.Price != null)
				return false;
		} else if (!Price.equals(other.Price))
			return false;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (Type != other.Type)
			return false;
		return true;
	}
}