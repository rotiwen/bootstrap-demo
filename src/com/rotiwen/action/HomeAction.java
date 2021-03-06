package com.rotiwen.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.rotiwen.dao.IAreaService;
import com.rotiwen.dao.impl.AreaService;
import com.rotiwen.model.Area;

public class HomeAction extends ActionSupport {
	/**
	 * 
	 */
//	private static final long serialVersionUID = 7374681017146609920L;

	private List<Area> areas;

	public List<Area> getAreas() {
		return areas;
	}

	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}


	private IAreaService areaService;
	
	public IAreaService getAreaService() {
		return areaService;
	}

	public void setAreaService(IAreaService areaService) {
		this.areaService = areaService;
	}

	@Override
	public String execute() throws Exception {
//		this.areaService = new AreaService();
		this.areas = this.areaService.getAllAreas();
		return SUCCESS;
	}
	
//	@Override
//	public String execute() throws Exception {
//		this.areas = new ArrayList<Area>();
//		
//		Area area = new Area();
//		area.setCode("1001");
//		area.setDisplayName("一楼");
//		
//		List<Table> tables = new ArrayList<Table>();
//		
//		Table table = new Table();
//		table.setStatus(1);
//		table.setDisplayName("1号桌");
//		tables.add(table);
//		
//		table = new Table();
//		table.setStatus(0);
//		table.setDisplayName("2号桌");
//		tables.add(table);
//		
//		table = new Table();
//		table.setStatus(1);
//		table.setDisplayName("3号桌");
//		tables.add(table);
//		
//		area.setTables(tables);
//		
//		this.areas.add(area);
//		
//		area = new Area();
//		area.setCode("1002");
//		area.setDisplayName("二楼");
//		
//		tables = new ArrayList<Table>();
//		
//		table = new Table();
//		table.setStatus(1);
//		tables.add(table);
//		
//		table = new Table();
//		table.setStatus(0);
//		tables.add(table);
//		
//		table = new Table();
//		table.setStatus(0);
//		tables.add(table);
//		
//		area.setTables(tables);
//		
//		this.areas.add(area);
//		areas.get(0).getTables();
//		return SUCCESS;
//	}
	
}
