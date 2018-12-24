package compositepattern;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.Iterator;

public class Employee {
    
            private Employee boss; 
            private String name;
            private String dept;
            private int salary;
            private List<Employee> subordinates;

            // constructor
            public Employee(String name,String dept, int sal) {
               this.name = name;
               this.dept = dept;
               this.salary = sal;
               subordinates = new ArrayList<Employee>();
            }

            public String getName() {
                 return name;
            }
            public int getSalary() {
                 return salary;
            }
            public String dept() {
                 return dept;
            }
            public String setBoss(Employee boss) {
                
                 this.boss = boss;
                 System.out.println("The boss of "+ name+" is "+ boss.getName());
                return null;
            }
            public Employee getBoss() {
                 return this.boss;
            }

            public void getAllBosses() {
//                this.boss = boss; 
//                System.out.println(this.boss.getName()); 

//                boolean b = Boolean.parseBoolean(boss);
                if (this.boss != null ) {
                 
                     System.out.println(this.boss.getName()); 
                     this.boss.getAllBosses(); 
                 }  
            }


            public int getAllEmployeeSalary() {
                 int totalSalary = salary;
                 if(true){
                    
                             for (Iterator<Employee> it = subordinates.iterator(); it.hasNext();) {
                                 Employee item;
                                 item = it.next();
                                 totalSalary = totalSalary + item.getAllEmployeeSalary();
                             }
                }
                         return totalSalary; 
            }
                    
            

            public void getLowerEmployee(){
             
                int a = subordinates.size();
              if (a>0) {
                    for (Iterator<Employee> it = subordinates.iterator(); it.hasNext();) {
                        Employee element = it.next();
                        System.out.println(element.name);
                          element.getLowerEmployee();
                    }
                 }
            }

             public Employee setEmployeeBoss(Employee e) {
                     e.setBoss(this);
                return null;
             }

            public void add(Employee e) {
               subordinates.add(e);
               e.setBoss(this);
            }

            public void remove(Employee e) {
               subordinates.remove(e);
            }

            public List<Employee> getSubordinates(){
              return subordinates;
            }

             @Override
            public String toString(){
               return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary+" ]");
            }   
    
}
