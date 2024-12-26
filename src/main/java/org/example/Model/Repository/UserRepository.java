package org.example.Model.Reponsitory;

import org.example.Model.Data.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReponsitory  extends JpaRepository<User, Long> {
}
