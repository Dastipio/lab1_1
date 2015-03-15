package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class Discount {
	
	private String cause;

	private BigDecimal cost;
	
	private String currency;

	public BigDecimal getValue() {
		return cost;
	}

	public void setValue(BigDecimal cost) {
		this.cost = cost;
	}
	
	public boolean equals(Object obj) {
		Discount other = (Discount)obj;
		if(other.cost != cost)
			return false;
		if(other.cause != cause)
			return false;
		if(other.currency != currency)
			return false;
		return true;
	}
}
