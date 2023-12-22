package com.xworkz.airpods.repo;

import com.xworkz.airpods.dto.AirpodsDto;

public interface AirpodsRepo {
	
	public boolean store(AirpodsDto dto);

	public boolean updateColorByName(String color, String name);

	public boolean deleteByPrice(int price);

	public AirpodsDto readAll();
	
}
