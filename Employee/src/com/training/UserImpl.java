package com.training;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class UserImpl {
	private List list = new ArrayList();
	public int searchuser(int id) {
		ListIterator itr = list.listIterator();
		int count=0;
		while(itr.hasNext()) {
			if(((User) itr.next()).getId()==id) {
				return count;
			}
			count++;
		}
		return -1;
	}


	public void adduser() {
		Scanner scan = new Scanner(System.in);
			System.out.println("Enter user ID, Name and email :");
			int id=scan.nextInt();
			String name = scan.next();
			String email = scan.next();
			if(searchuser(id)>-1) {
				System.out.println("\nuser id already exists, add unsucessful");
			}else {
				User user = new User(id,name,email);
				list.add(user);
			}
	}
	public void deleteuser(int id) {
		int index = searchuser(id);
		if(index==-1) {
			System.out.println("user does not exist");
		}else {
			list.remove(index);
			System.out.println("user deleted");
		}
	}
	public void displayuser() {
		if(list.isEmpty()) {
			System.out.println("No Employees in list");
		}else {
			ListIterator itr = list.listIterator();
			while(itr.hasNext()) {
				System.out.println((User)itr.next());
			}
		}
	}
}
