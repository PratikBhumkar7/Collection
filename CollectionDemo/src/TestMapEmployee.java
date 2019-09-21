import java.util.*;
public class TestMapEmployee {

	public static void main(String[] args) {
		Map<String,Employee> emp=accept();
		display(emp);

	}
	public static Map<String,Employee> accept()
	{
		Map<String,Employee> emp =new HashMap<String,Employee>();
		emp.put("emp111",new Employee("Ramesh",40000));
		emp.put("emp101",new Employee("Suresh",50000));
		emp.put("emp201",new Employee("Ganesh",25000));
		emp.put("emp202",new Employee("Mahesh",2000));
		return emp;
	}
	public static void display(Map<String,Employee>map)
	{
		Set<String> st = map.keySet();
		
		for(String s:st){
			Employee e=map.get(s);
			System.out.println(s+"\t==>"+e.getEname()+"\t"+e.getEsal());
		}
			
	}

}
