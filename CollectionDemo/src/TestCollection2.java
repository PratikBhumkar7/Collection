import java.util.*;
public class TestCollection2 {

	public static void main(String[] args) {
		Set<Account2> hst=getData();
		display(hst);

	}

	public static Set<Account2>getData()
	{
		Account2 a1=new Account2(101, "Joash", 50000);
		Account2 a2=new Account2(102, "Smith", 20000);
		Account2 a3=new Account2(103, "Ileana", 70000);
		Account2 a4=new Account2(103, "Ileana", 70000);

		
		Set<Account2> hst=new HashSet<Account2>();
		hst.add(a1);
		hst.add(a2);
		hst.add(a3);
		hst.add(a4);
		
		return hst;

	}
	
	public static void display(Set<Account2> hst)
	{
		for(Account2 a:hst)
		{
			System.out.println(a.getAccNo()+"\t"+a.getCustName()+"\t"+a.getAccBal());
		}
	}
}
