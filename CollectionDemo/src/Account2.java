
public class Account2{
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(accBal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + accNo;
		result = prime * result + ((custName == null) ? 0 : custName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account2 other = (Account2) obj;
		if (Double.doubleToLongBits(accBal) != Double.doubleToLongBits(other.accBal))
			return false;
		if (accNo != other.accNo)
			return false;
		if (custName == null) {
			if (other.custName != null)
				return false;
		} else if (!custName.equals(other.custName))
			return false;
		return true;
	}
	private int accNo;
	private String custName;
	private double accBal;
	public Account2(int accNo, String custName, double accBal) {
		super();
		this.accNo = accNo;
		this.custName = custName;
		this.accBal = accBal;
	}
	public int getAccNo() {
		return accNo;
	}
	public String getCustName() {
		return custName;
	}
	public double getAccBal() {
		return accBal;
	}


}
