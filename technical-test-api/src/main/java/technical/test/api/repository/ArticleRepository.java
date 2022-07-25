package technical.test.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import technical.test.api.entity.Article;

import java.util.UUID;

@Repository
public interface ArticleRepository extends MongoRepository<Article, UUID> {



}
