package com.god.bo.jpaTest.repository; 


import com.god.bo.jpaTest.vo.MemberVo; 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import java.util.List; 

@Repository 

public interface MemberRepository extends JpaRepository<Book, Long> { 
    
    List<MemberVo> findById(String id); 
    
    public List<MemberVo> findByName(String name); 
    
    //like검색도 가능 public List<MemberVo> findByNameLike(String keyword); }
}
