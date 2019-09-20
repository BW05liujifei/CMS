package com.liujifei.service;

import java.util.List;

import com.liujifei.entity.Article4Vote;
import com.liujifei.entity.VoteStatic;

/**
 * 
 * @author 刘吉飞
 *
 */
public interface Article4VoteService {
	
	int publish(Article4Vote av);
	
	List<Article4Vote>  list();
	
	Article4Vote  findById(Integer id);
	
	int vote(Integer userId, Integer articleId,Character option);
	
	List<VoteStatic> getVoteStatics(Integer articleId);
	
	
	

}
