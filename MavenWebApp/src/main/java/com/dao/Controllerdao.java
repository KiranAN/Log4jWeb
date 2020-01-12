package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.ControllerBook;

@Repository
public interface Controllerdao{
	public List<ControllerBook> getAllBooks();
}