package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class Money {

	private String currency;

	private BigDecimal cost;

	public Money(BigDecimal cost) {
		this.setValue(cost);
	}
	

	public boolean equals(Object obj) {
		Money other = (Money) obj;
		if (other.getValue() != getValue())
			return false;
		if (other.currency != currency)
			return false;
		return true;
	}

	public BigDecimal getValue() {
		return cost;
	}

	public void setValue(BigDecimal cost) {
		this.cost = cost;
	}

	public Money subtract(Money finalCost) {
		return new Money(cost.subtract(finalCost.getValue()));
	}

	public Money multiply(Money finalCost) {
		return new Money(cost.multiply(finalCost.getValue()));
	}

	public int compare(Money totalCost) {
		return cost.compareTo(totalCost.cost);
	}

}