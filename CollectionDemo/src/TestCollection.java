import java.util.*;
public class TestCollection {

	public static void main(String[] args) {
		List<Account1> lst=getData();
		display(lst);
	}
	
		
	
	public static List<Account1>getData()
	{Account1 a1=new Account1(101,"ram",100000);
	 Account1 a2=new Account1(102,"sham",200000);
	 Account1 a3=new Account1(103,"sam",300000);
	 
	 List<Account1>lst=new LinkedList<Account1>();
	 lst.add(a1);
	 lst.add(a2);
	 lst.add(a3);
	return lst;
	 
		
	}
	public static void display(List<Account1> lst) {
		for(Account1 a:lst)
		{
			System.out.println(a.getAccNo()+"\t"+a.getCustName()+"\t"+a.getAccBal());
		}
	}
}
