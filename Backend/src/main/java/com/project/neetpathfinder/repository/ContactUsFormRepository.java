package com.project.neetpathfinder.repository;



import com.project.neetpathfinder.model.ContactUsForm;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactUsFormRepository extends JpaRepository<ContactUsForm,Integer> {

    Optional<ContactUsForm> findByEmail(String email);
}
