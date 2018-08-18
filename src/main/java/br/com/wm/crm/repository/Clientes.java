package br.com.wm.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wm.crm.model.Cliente;

public interface Clientes extends JpaRepository<Cliente, Long>{

}
