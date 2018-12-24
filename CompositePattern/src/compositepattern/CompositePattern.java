package compositepattern;

public class CompositePattern {
    
    public static void main(String[] args) {
        
        Employee CEO = new Employee("Elbetel","CEO", 30000);

        Employee headSales = new Employee("Selam","Head Sales", 20000);

        Employee headMarketing = new Employee("Eyosias","Head Marketing", 20000);

        Employee clerk1 = new Employee("Abigya","Marketing", 10000);
        Employee clerk2 = new Employee("Girum","Marketing", 10000);
        
        Employee salesExecutive1 = new Employee("Dagemawi","Sales", 10000);
        Employee salesExecutive2 = new Employee("Helina","Sales", 10000);

        CEO.add(headSales);
       CEO.add(headMarketing);

        headSales.add(salesExecutive1);
       headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        
        
        System.out.println("###################################");
         clerk1.getAllBosses();
        System.out.println("###################################");
        headSales.getLowerEmployee();
        
        System.out.println("###################################");
        System.out.println("Employees lower than the CEO include : ");
        CEO.getLowerEmployee();
        
       System.out.println("###################################");
      System.out.println("The Salary of all employees below Sales (including) : " + headSales.getAllEmployeeSalary());		
    }
    
}
