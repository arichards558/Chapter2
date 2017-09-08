package tutorials;
import javax.swing.JOptionPane;

public class SalaryDialog {

	public static void main(String[] args) {
		String wageString, dependentsString;
		double wage, weeklyPay;
		String hoursWorkedString;
		int dependents;
		 double HOURS_IN_WEEK;
		 hoursWorkedString = JOptionPane.showInputDialog(null, "How many hours did you work during this week? ", "Hourly Wage Dialog",  JOptionPane.INFORMATION_MESSAGE);
		 HOURS_IN_WEEK = Double.parseDouble(hoursWorkedString);
		wageString = JOptionPane.showInputDialog(null, "Enter employees hourly wage", "Salary dialog 1", 
				JOptionPane.INFORMATION_MESSAGE);
		weeklyPay = Double.parseDouble(wageString)  *
				HOURS_IN_WEEK;
		dependentsString = JOptionPane.showInputDialog(null, "How many dependents?", "Salary Dialog 2",
				JOptionPane.QUESTION_MESSAGE);
		dependents = Integer.parseInt(dependentsString);
		JOptionPane.showMessageDialog(null,  "Weekly salary is $" +
		weeklyPay + "\nDeductions will be made for " + dependents + " dependents");
		
				

	}

}
