package technical.test.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import technical.test.api.entity.Article;
import technical.test.api.repository.ArticleRepository;

import java.util.List;
import java.util.UUID;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleRepository articleRepository;

    @Override
    public Article save(Article article) {
        if (article.getId() == null) { //mongo cannot set uuid auto
            article.setId(UUID.randomUUID());
        }
        return articleRepository.save(article);
    }

    @Override
    public List<Article> getAll() {
        return articleRepository.findAll();
    }
}
