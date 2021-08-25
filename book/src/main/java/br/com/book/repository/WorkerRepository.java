package br.com.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.book.entity.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
