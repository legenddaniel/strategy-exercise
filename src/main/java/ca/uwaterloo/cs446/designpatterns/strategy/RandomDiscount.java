public class RandomDiscount implements Discount {
	
	private double percentage;
	
	public RandomDiscount() {
		this.percentage = Math.random() * 49 + 1;
	}

	@Override
	public double compute(double fullPrice) {
		return fullPrice * (1-this.percent/100);
	}
}