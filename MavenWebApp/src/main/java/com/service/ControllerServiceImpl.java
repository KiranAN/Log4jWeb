package com.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.ControllerBook;
import com.dao.Controllerdao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class ControllerServiceImpl implements ControllerService 
{
	@Autowired
	Controllerdao dao;
	
	public List<ControllerBook> getAllBooks(){
		Logger logger = LoggerFactory.getLogger("ControllerServiceImpl.class");
		logger.info("This is an information message");
        logger.error("this is a error message");
        logger.warn("this is a warning message");
		return dao.getAllBooks();
	}
}