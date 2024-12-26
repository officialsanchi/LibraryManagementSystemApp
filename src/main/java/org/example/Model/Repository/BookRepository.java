package org.example.Model.Reponsitory;

import org.example.Model.Data.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository  extends JpaRepository<Book, Long> {
}
