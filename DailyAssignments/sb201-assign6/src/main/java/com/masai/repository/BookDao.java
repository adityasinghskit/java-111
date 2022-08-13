package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.entities.Book;
import com.masai.entities.BookDTO;
import com.masai.exception.BookException;
@Repository
public interface BookDao extends JpaRepository<Book, Integer> {
@Query("select new com.masai.entities.BookDTO(name,publication,Category,pages,price,author) from Book" )
public List<BookDTO> getAllBooksDTO();
@Query("select new com.masai.entities.BookDTO(name,publication,Category,pages,price,author) from Book where bookId=?1" )
public BookDTO getBooksByIdDTO(Integer id);
}
