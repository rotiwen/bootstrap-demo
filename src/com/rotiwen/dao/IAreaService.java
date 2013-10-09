package com.rotiwen.dao;

import java.util.List;

import com.rotiwen.model.Area;

public interface IAreaService {
	public Area getArea(String areaId);
	public List<Area> getAllAreas();
}
