package com.etiya.ecommerceDemo.dataAccess.contretes;

import com.etiya.ecommerceDemo.entities.concrete.ReviewReply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewReplyDao extends JpaRepository<ReviewReply, Long> {
}
