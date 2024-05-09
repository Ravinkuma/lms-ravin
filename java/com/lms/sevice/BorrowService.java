package com.lms.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.entity.BorrowEntity;
import com.lms.repo.BorrowRepo;

@Service
public class BorrowService {
	@Autowired
	 
	 BorrowRepo brr;
	 public String saveBorrowingDetails(BorrowEntity borrowEntity) {
	     brr.save(borrowEntity);
	     return "Borrowing Details saved successfully";
	 }
	 public List<BorrowEntity> retrieveBorrowed() {
			
			return brr.findAll();
		}
		public BorrowEntity retrieveOneBorrowedDetails(int id) {
			
			return brr.findById(id).get();
		}
		
		public BorrowEntity updateBorrowedDetails(int id, BorrowEntity borrowEntity) {
	        BorrowEntity bre1 = brr.findById(id).get();
	        bre1.setBookId(borrowEntity.getBookId());
	        bre1.setMemberId(borrowEntity.getMemberId());

	        return brr.save(bre1);
	    }
		
		public String delete(int id) {
			brr.deleteById(id);
			return "Borrowed with Id "+ id+ " is removed from table";
		}
}
