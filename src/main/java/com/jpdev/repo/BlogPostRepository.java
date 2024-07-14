package com.jpdev.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpdev.entities.BlogPost;

@Repository
public interface BlogPostRepository extends JpaRepository<BlogPost, Long>{

}
