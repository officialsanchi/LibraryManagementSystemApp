package org.example.Model.Reponsitory;

import org.example.Model.Data.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByName(String name);

}
