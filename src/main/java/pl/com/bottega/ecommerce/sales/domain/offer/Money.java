package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class Money {

	private BigDecimal totalCost;

	private String currency;

	private BigDecimal value;
	
	public Money(BigDecimal value){
		this.setValue(value);
	}

}
