package com.training;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
public class UserService {

	public static void main(String[] args) {
		int id;
		String name,email;
	UserImpl user=new UserImpl();
	Scanner scan =new Scanner(System.in);
	int choice;
	do {
		System.out.println("no1: add user");
		System.out.println("no2: delete user ");
		System.out.println("no3: search user");
		System.out.println("no4: display all userslist");
		System.out.println("Press 0 to Exit");
		System.out.println("Enter your choice");
		choice=scan.nextInt();
		switch(choice) {
		case 1:user.adduser();
		break;
		case 2:	System.out.print("Enter user id(delete) ");
		user.deleteuser(scan.nextInt());
		break;
		case 3:System.out.print("Enter user id(search) ");
		System.out.println("Employee found at index : "+user.searchuser(scan.nextInt()));
		break;
		case 4:user.displayuser();
		case 0:break;
		};
	}while(choice!=0);
	
	}
}