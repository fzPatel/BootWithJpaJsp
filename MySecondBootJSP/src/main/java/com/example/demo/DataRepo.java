package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Data;

public interface DataRepo extends CrudRepository<Data, String>
{

}
