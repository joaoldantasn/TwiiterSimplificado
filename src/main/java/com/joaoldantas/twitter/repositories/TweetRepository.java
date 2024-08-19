package com.joaoldantas.twitter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joaoldantas.twitter.entities.Tweet;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long>{

}
