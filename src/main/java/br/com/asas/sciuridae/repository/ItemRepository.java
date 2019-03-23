package br.com.asas.sciuridae.repository;

import br.com.asas.sciuridae.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {
}
