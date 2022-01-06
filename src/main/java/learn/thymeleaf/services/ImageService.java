package learn.thymeleaf.services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author stefan
 *
 */
@Service
public interface ImageService {

    void saveImageFile(Long recipeId, MultipartFile file);


}
