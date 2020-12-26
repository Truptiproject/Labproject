
public class Employee extends Object{
	
	private int empId;												//datamembers should be private
	private String empName;
	
	public Employee(int empId,String empName)						//parametrized constructor
	{
		this.empId=empId;
		this.empName=empName;
	}
	@Override
	public String toString() {					//overriding object class method it is implicitely present in Object class
		return "Employee[empId="+empId+",empName="+empName+"]";
	}
	
	public boolean equals(Object o)				//equals method return boolean value
	{
		Employee e=(Employee)o;
		if((this.empId == e.empId) && (this.empName.equals(e.empName))) //for int use comparison operator & for string use equals
		{
			return true;
		}
		else
			return false;
	}
	
	public int hashCode()				//hashcode is a method of object class which implicitely take an integer value
	{
		return empId;
	}
	public static void main(String[] args)
	{
		Employee e1=new Employee(1,"abc");
		Employee e2=new Employee(2,"abc");
		
//		Employee e3 = e2;	//when we are creating third object which is equal to e2 then if condition will satisfy
		
//	if(e3 != e2)
//		{
//			System.out.println("Are equal");
//		}
//	else
//			System.out.println("Are not equal");
		
		if(e1.equals(e2))
		{
			System.out.println("Objects are equal");
		}
		else
			System.out.println("Objects are not equal");
		
		System.out.println("e1= "+e1.hashCode());
		System.out.println("e2= "+e2.hashCode());
		
	}
	
}
