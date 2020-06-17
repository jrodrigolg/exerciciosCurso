package entities2;

public class Funcionario {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		double net_salary = this.grossSalary-this.tax;
		return net_salary;
	}
	
	public void increaseSalary(double percentage) {
		this.grossSalary += (percentage/100)*grossSalary;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}
	
	
}
