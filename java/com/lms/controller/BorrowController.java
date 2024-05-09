package com.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lms.entity.BorrowEntity;
import com.lms.sevice.BorrowService;

@RestController
@RequestMapping("/Borrowing")
public class BorrowController {

	@Autowired

	BorrowService brs;
	@PostMapping("/save")
	public String saveBorrowingDetails(@RequestBody BorrowEntity borrowEntity) {
		return brs.saveBorrowingDetails(borrowEntity);
	}
	
	@GetMapping("/retrieve")
	List<BorrowEntity> retrieveBorrrowed(){
		return brs.retrieveBorrowed();
	}

	@GetMapping("/retrieve/{id}")
	BorrowEntity retrieveOneBorrowedDetails(@PathVariable int id){
		return brs.retrieveOneBorrowedDetails(id);
	}

	@PutMapping("/update/{id}")
	public BorrowEntity updateBorrowedDetails(@PathVariable int id, @RequestBody BorrowEntity borrowEntity) {
	    return brs.updateBorrowedDetails(id, borrowEntity);
	}

	@DeleteMapping("/delete/{id}")
	String delete(@PathVariable int id){
		return brs.delete(id);
	}
}
