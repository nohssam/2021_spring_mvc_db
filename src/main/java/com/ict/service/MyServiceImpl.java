package com.ict.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ict.dao.MyDAO;
import com.ict.vo.VO;

@Service("myServiceImpl")
public class MyServiceImpl implements MyService{
	@Autowired
	private MyDAO myDAO;
	
	@Override
	public List<VO> getList() throws Exception {
		return myDAO.getList();
	}
	@Override
	public int getInsert(VO vo) throws Exception {
		
		return 0;
	}
	@Override
	public VO getOneList(String idx) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getDelete(String idx) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getUpdate(VO vo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
}
