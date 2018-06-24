package com.example.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DataRepo;
import com.example.model.Data;


@Service
public class DataService 
{
	@Autowired
	private DataRepo rd;


public 	List<Data> getAlldata()
{
	List<Data> data=new ArrayList<Data>();
	rd.findAll().forEach(data::add);
	return data;
	
}
public 	Optional<Data> getAlldataById(String name)
{
return rd.findById(name);
}
public 	void addData(Data d)
{
	rd.save(d);
}

public 	void updateData(String name,Data da)
{		rd.save(da);
}

public 	void deleteData(String name)
{	
	rd.deleteById(name);
}
}
