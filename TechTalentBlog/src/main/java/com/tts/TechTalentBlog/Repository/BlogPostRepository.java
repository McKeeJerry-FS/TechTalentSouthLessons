package com.tts.TechTalentBlog.Repository;

import com.tts.TechTalentBlog.Model.BlogPost;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogPostRepository extends CrudRepository<BlogPost, Long> {

}
