package com.etiya.ecommerceDemo.dataAccess.contretes;

import com.etiya.ecommerceDemo.entities.concrete.Installment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstallmentDao extends JpaRepository<Installment, Long> {
}
