package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;
import java.util.Date;

public class ProductSnapshot {

	// product

	private BigDecimal productPrice;

	private String productId;

	private String productName;

	private Date productSnapshotDate;

	private String productType;

	public ProductSnapshot(BigDecimal productPrice, String productId,
			String productName, Date productSnapshotDate, String productType) {
		super();
		this.productPrice = productPrice;
		this.productId = productId;
		this.productName = productName;
		this.productSnapshotDate = productSnapshotDate;
		this.productType = productType;
	}

	public String getProductId() {
		return productId;
	}

	public BigDecimal getProductPrice() {
		return productPrice;
	}

	public String getProductName() {
		return productName;
	}

	public Date getProductSnapshotDate() {
		return productSnapshotDate;
	}

	public String getProductType() {
		return productType;
	}


	
	

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			OfferItem other = (OfferItem) obj;
			if (discount == null) {
				if (other.discount != null)
					return false;
			} else if (!discount.equals(other.discount))
				return false;
			if (productName == null) {
				if (other.productName != null)
					return false;
			} else if (!productName.equals(other.productName))
				return false;
			if (productPrice == null) {
				if (other.productPrice != null)
					return false;
			} else if (!productPrice.equals(other.productPrice))
				return false;
			if (productId == null) {
				if (other.productId != null)
					return false;
			} else if (!productId.equals(other.productId))
				return false;
			if (productType != other.productType)
				return false;
			if (quantity != other.quantity)
				return false;
			if (totalCost == null) {
				if (other.totalCost != null)
					return false;
			} else if (!totalCost.equals(other.totalCost))
				return false;
			return true;
		}
		
	}
}
