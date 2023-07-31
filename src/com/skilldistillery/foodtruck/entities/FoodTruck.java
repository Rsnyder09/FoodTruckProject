package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	
	private String name;
	private String foodType;
	private int id;
	private int rating;
	private static int nextFoodTruckId;
	

	public FoodTruck() {
		
	}
	public FoodTruck(String name , String foodType, int rating) {
		this(name, foodType, rating, nextFoodTruckId);
	}

	public FoodTruck(String name, String foodType, int rating, int id) {
		
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
		this.id = ++nextFoodTruckId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		 this.id = id;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public static int getNextFoodTruckId() {
		return nextFoodTruckId;
	}

	public static void setNextFoodTruckId(int nextFoodTruckId) {
		nextFoodTruckId++;
	}

	@Override
	public String toString() {
		return "FoodTruck [name=" + name + ", foodType=" + foodType + ", id=" + id + ", rating=" + rating + "]";
	}
	
	
		
	

}
