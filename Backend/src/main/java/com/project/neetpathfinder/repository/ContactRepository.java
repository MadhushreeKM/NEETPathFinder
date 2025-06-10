package com.project.neetpathfinder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.neetpathfinder.model.ContactModel;


@Repository
public interface ContactRepository extends JpaRepository<ContactModel,Long> {

}
