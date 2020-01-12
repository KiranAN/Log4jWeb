package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import com.dao.Controllerdao;
import com.model.ControllerBook;

@Repository
public class ControllerdaoImpl implements Controllerdao{
	
	public List<ControllerBook> getAllBooks(){
		List<ControllerBook> books = new ArrayList<ControllerBook>();
		ControllerBook book = new ControllerBook();		
		books.add(book);
		return books;
	}
}
