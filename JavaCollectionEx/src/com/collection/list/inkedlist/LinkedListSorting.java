package com.collection.list.inkedlist;

import java.util.LinkedList;

import com.model.Employee;

import java.util.Collections;
import java.util.Iterator;

public class LinkedListSorting {

	public static void main(String[] args) {

		LinkedList<Employee> empList=new LinkedList<>();
		
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
