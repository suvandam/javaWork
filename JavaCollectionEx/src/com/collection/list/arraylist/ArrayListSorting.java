package com.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.model.Employee;

public class ArrayListSorting {

	public static void main(String[] args) {

		ArrayList<Employee> empList=new ArrayList<>();
		
		empList.add(new Employee(102,"Ram"));
		empList.add(new Employee(101,"John"));
		empList.add(new Employee(103,"Mike"));
		
		Collections.sort(empList);
		
		for(Iterator<Employee> itr=empList.iterator();itr.hasNext();) {
			Employee e=itr.next();
			System.out.println(e.getEmpId()+" - "+e.getEmpName());
		}
		
		empList.sort(Employee.empNameComp);
		//or this way
		//Collections.sort(empList, Employee.empNameComp);
		
		for(Iterator<Employee> itr=empList.iterator();itr.hasNext();) {
			Employee e=itr.next();
			System.out.println(e.getEmpId()+" - "+e.getEmpName());
		}
	}

}
