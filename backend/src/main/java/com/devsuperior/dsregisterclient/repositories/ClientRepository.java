package com.devsuperior.dsregisterclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsregisterclient.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
