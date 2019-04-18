package com.code.cars.entity;

public class Car {

	private String carModel;
	private int quantityCarsOfModel;

	public Car() {
	}

	public Car(String carModel, int quantityCarsOfModel) {
		this.carModel = carModel;
		this.quantityCarsOfModel = quantityCarsOfModel;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public int getQuantityCarsOfModel() {
		return quantityCarsOfModel;
	}

	public void setQuantityCarsOfModel(int quantityCarsOfModel) {
		this.quantityCarsOfModel = quantityCarsOfModel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carModel == null) ? 0 : carModel.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		Car other = (Car) obj;
		other.setQuantityCarsOfModel(other.getQuantityCarsOfModel() + 1);

		return true;
	}

}
