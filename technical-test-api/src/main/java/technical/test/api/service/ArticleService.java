package technical.test.api.service;

import technical.test.api.entity.Article;

import java.util.List;

public interface ArticleService {

    Article save(Article article);

    List<Article> getAll();
}
