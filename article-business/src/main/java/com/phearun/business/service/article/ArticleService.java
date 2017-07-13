package com.phearun.business.service.article;

import java.util.List;

import com.phearun.persistence.model.Article;
import com.phearun.persistence.model.filter.ArticleFilter;
import com.phearun.persistence.utility.Paging;

public interface ArticleService {

	List<Article> findAll();

	Article findOne(int id);

	boolean remove(int id);

	boolean save(Article article);

	boolean update(Article article);
	
	List<Article> findAllFilter(ArticleFilter filter, Paging paging);
}
