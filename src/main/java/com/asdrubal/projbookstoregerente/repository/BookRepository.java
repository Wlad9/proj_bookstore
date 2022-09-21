package com.asdrubal.projbookstoregerente.repository;

import com.asdrubal.projbookstoregerente.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
