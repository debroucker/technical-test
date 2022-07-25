package technical.test.api.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import technical.test.api.dto.ArticleDTO;
import technical.test.api.entity.Article;

@Component
public class ArticleMapper {

    @Autowired
    ModelMapper modelMapper;

    public Article convertDtoToEntity(ArticleDTO dto) {
        return modelMapper.map(dto, Article.class);
    }

    public ArticleDTO convertEntityToDto(Article entity) {
        return modelMapper.map(entity, ArticleDTO.class);
    }

}
