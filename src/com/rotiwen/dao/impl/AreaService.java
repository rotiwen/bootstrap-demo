package com.rotiwen.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.rotiwen.dao.IAreaService;
import com.rotiwen.model.Area;
import com.rotiwen.model.Table;

public class AreaService implements IAreaService {

	@Override
	public Area getArea(String areaId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Area> getAllAreas() {
		List<Area> areas = new ArrayList<Area>();
		
		Area area = new Area();
		area.setCode("1001");
		area.setDisplayName("一楼");
		
		List<Table> tables = new ArrayList<Table>();
		
		Table table = new Table();
		table.setStatus(1);
		table.setDisplayName("1号桌");
		tables.add(table);
		
		table = new Table();
		table.setStatus(0);
		table.setDisplayName("2号桌");
		tables.add(table);
		
		table = new Table();
		table.setStatus(1);
		table.setDisplayName("3号桌");
		tables.add(table);
		
		table = new Table();
		table.setStatus(1);
		table.setDisplayName("4号桌");
		tables.add(table);

		table = new Table();
		table.setStatus(0);
		table.setDisplayName("5号桌");
		tables.add(table);
		
		area.setTables(tables);
		
		areas.add(area);
		
		area = new Area();
		area.setCode("1002");
		area.setDisplayName("二楼");
		
		tables = new ArrayList<Table>();
		
		table = new Table();
		table.setStatus(1);
		tables.add(table);
		
		table = new Table();
		table.setStatus(0);
		tables.add(table);
		
		table = new Table();
		table.setStatus(0);
		tables.add(table);
		
		area.setTables(tables);
		
		areas.add(area);
		
		return areas;
	}

}
