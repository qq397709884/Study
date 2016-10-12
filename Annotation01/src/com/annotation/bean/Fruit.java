package com.annotation.bean;

import com.annotation.annotation.FruitColor;
import com.annotation.annotation.FruitColor.Color;
import com.annotation.annotation.FruitName;
import com.annotation.annotation.FruitProvider;

public class Fruit {

	@FruitName("Apple")
	private String name;

    @FruitColor(fruitColor=Color.RED)
    private String appleColor;
  
    @FruitProvider(id=1,name="X公司",address="A省B县")
    private String appleProvider;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAppleColor() {
		return appleColor;
	}

	public void setAppleColor(String appleColor) {
		this.appleColor = appleColor;
	}

	public String getAppleProvider() {
		return appleProvider;
	}

	public void setAppleProvider(String appleProvider) {
		this.appleProvider = appleProvider;
	}
}
