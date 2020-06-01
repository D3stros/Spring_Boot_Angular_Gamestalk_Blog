package com.Gamestalk.springnggamestalk.repository;

import com.Gamestalk.springnggamestalk.model.Post;
import com.Gamestalk.springnggamestalk.model.Topic;
import com.Gamestalk.springnggamestalk.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllByTopic(Topic topic);

    List<Post> findByUser(User user);
}

