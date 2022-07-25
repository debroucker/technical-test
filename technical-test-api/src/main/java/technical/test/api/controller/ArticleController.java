package technical.test.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import technical.test.api.dto.ArticleDTO;
import technical.test.api.mapper.ArticleMapper;
import technical.test.api.service.ArticleService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @Autowired
    ArticleMapper articleMapper;

    @GetMapping
    List<ArticleDTO> getAll() {
      var entities = articleService.getAll();
      return entities.stream().map(articleMapper::convertEntityToDto).collect(Collectors.toList());
    }

    @PostMapping
    ArticleDTO save(@RequestBody ArticleDTO dto) {
        var entity = articleMapper.convertDtoToEntity(dto);
        entity = articleService.save(entity);
        return articleMapper.convertEntityToDto(entity);
    }


}
