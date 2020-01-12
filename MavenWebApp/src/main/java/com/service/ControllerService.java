package com.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.model.ControllerBook;
@Service("ControllerService")
public interface ControllerService 
{
	public List<ControllerBook> getAllBooks();
}