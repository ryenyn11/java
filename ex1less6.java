package lesson6;

public class ex1 {
	class Person{
		private String name;
		private int age;
		private String address;
		
		public Person(String name, int age, String address) {
			this.name=name;
			this.age=age;
			this.address=address;
			
		}
		public void display() {
			System.out.println("nhan vien "+name+","+age+ "tuoi, dia chi "+address);
		}		
	}
	public class Employee extends Person{
		private float salary;
		private float rate;
		 public Employee(String name, int age, String address, float salary, float rate) {
			 super(name, age, address);
			 this.salary=salary;
		 }


			 public float totalSalary(){
				 return salary*rate;
			 }
			 public void display(){
				 super.display();
				 System.out.println("co tong luong la: "+totalSalary());
			 }
		 
	}
	
	public static void main(String[] args) {
		Employee B = new Employee("Dung", 30, "Quang Nam",11050f ,3.66f);
		B.display();
		
	}

}
