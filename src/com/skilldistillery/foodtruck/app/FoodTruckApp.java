package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	public Scanner kb = new Scanner(System.in);
	

	public static void main(String[] args) {

		FoodTruckApp app = new FoodTruckApp();
		System.out.println("---------Food Truck App------------");
		FoodTruck[] FoodTrucks = new FoodTruck[5];
		app.run(FoodTrucks);

	}

	private void run(FoodTruck[] fleet) {
		
		
		
		for (int truck = 0; truck < fleet.length; truck++) {
			
			System.out.print("Please enter the food truck name, or enter QUIT: ");
			String name = kb.nextLine();
			
				if (name.equals("QUIT") || name.equals("quit") || name.equals("Quit")) {
					MenuOptions(fleet);
					break;
				}
				
					System.out.print("What type of food does " + name + " serve? ");
					String foodType = kb.nextLine();
					System.out.println();
					
						
					System.out.print("Please enter a rating for " + name + " from 1 to 5: ");
					int rating = kb.nextInt();
					kb.nextLine();
					
					fleet[truck] = new FoodTruck(name, foodType, rating);
					
					if (truck == fleet.length) {
						MenuOptions(fleet);
						break;
					}
		}
	
		kb.close();			
					
	}
	
			
		
			private void MenuOptions(FoodTruck[] fleet) {
				if (fleet[0] == null) {
					quitOption();
				}
				else {
					System.out.println("______________________________________________________");
					System.out.println("|    1. List all existing food trucks.               |");
					System.out.println("|    2. See the average rating of all food trucks.   |");
					System.out.println("|    3. Display the highest rated food truck.        |");
					System.out.println("|    4 Quit the program                              |");
					System.out.println("|____________________________________________________|");
					int choice = kb.nextInt();
					
					switch (choice) {
					case 1: 
						existingFoodTrucks(fleet);
						break;
					case 2:
						averageRating(fleet);
						break;
					case 3:
						highestRated(fleet);
						break;
					case 4:
						default:
							quitOption();
							break;
						
						
					}
				}
			}
		
		
			
			
			private void existingFoodTrucks(FoodTruck[] fleet) {
				for (int i = 0; i < fleet.length; i++) {
					if (fleet[i] != null) {
						System.out.println(fleet[i].toString());
					}
					else {
						break;
					}
				}
				MenuOptions(fleet);
			}
			
			
			private void averageRating(FoodTruck[] fleet) {
				double average = 0;
				double total = 0;
				double x = 0;
				for (int i = 0; i < fleet.length; i++)
					if (fleet[i] != null) {
						total = total + fleet[i].getRating();
						x = i + 1;
						System.out.println(fleet[i].toString());
						} 
					else {
						average = total / x;
						System.out.println("Food trucks average rating: " + average);
						MenuOptions(fleet);
					}
			}
			
			
			private void highestRated(FoodTruck[] fleet) {
				int rating = fleet[0].getRating();
				int highestRating = 0;
				
				for (int i = 0; i <fleet.length; i++) {
					if (fleet[i] != null) {
						if (fleet[i].getRating() > rating) {
							rating = fleet[i].getRating();
							highestRating = i;
						}
						
					}
				}
				System.out.println("The highest rated food truck is: " + fleet[highestRating].getName() + " with a rating of: " + fleet[highestRating].getRating());
				System.out.println(fleet[highestRating].toString());
				
				MenuOptions(fleet);
				
			}
			
			private void quitOption() {
				System.out.println("Goodbye");
				
	
			}
			
			
		
			
		
	}


