package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LibraryController {
	//http://localhost:8080/show
	@Autowired
	BookDAO1 bookDAO;
	
	@RequestMapping("show")
	public ModelAndView getBook() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("BookStall.jsp");
		return mv;
	}
	
	@RequestMapping("ArrivalBooks")
	public ModelAndView addBooks(Book1 bb) {
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("BookDetails",bb);
		mv.setViewName("Arrival.jsp");
		
		bookDAO.save(bb);
		return mv;
	}
	
	@RequestMapping("Books in display")
	public ModelAndView viewBooks(Book1 bb1) {
		ModelAndView mv = new ModelAndView();
		
		Optional<Book1> op = bookDAO.findById(bb1.getId());
		Book1 book = op.get();
		mv.addObject("BookDetails",book);
		mv.setViewName("ViewBooks.jsp");
		return mv;
	}
	
	@RequestMapping("Books in trash")
	public ModelAndView deleteBooks(Book1 bb2) {
		ModelAndView mv = new ModelAndView();
		
		bookDAO.deleteById(bb2.getId());
		
		mv.addObject("BookDetails",bb2);
		mv.setViewName("DeletedBooks.jsp");
		return mv;
	}
	
	@RequestMapping("New Books")
	public ModelAndView updateBooks(Book1 bb3) {
		ModelAndView mv = new ModelAndView();
		
		bookDAO.deleteById(bb3.getId());
		
		mv.addObject("BookDetails",bb3);
		mv.setViewName("UpdatedBooks.jsp");
		return mv;
	}

}
