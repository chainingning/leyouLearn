package com.leyou.upload.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName UploadService
 * @Description: xxx
 * @Author ningning.chai
 * @Date 2019/9/12
 * @Version V1.0
 **/
@Service
public class UploadService {

    private static final List<String> CONTENT_TYPES = Arrays.asList("image/gif","image/jpeg","image/png");

    private static final Logger LOGGER = LoggerFactory.getLogger(UploadService.class);

    public String uploadImage(MultipartFile file) {
        String originalFilename = file.getOriginalFilename();
        LOGGER.info("读取到文件：{}", originalFilename);
//        String s = StringUtils.substringAfterLast(originalFilename, ".");
        String contentType = file.getContentType();

        try {
            //校验文件类型
            if (!CONTENT_TYPES.contains(contentType)) {
                // 文件类型不合法，直接返回null
                LOGGER.info("文件类型不合法：{}", originalFilename);
                return null;
            }
            //校验文件内容
            BufferedImage bufferedImage = ImageIO.read(file.getInputStream());
            if (bufferedImage == null) {
                LOGGER.info("文件内容不合法：{}", originalFilename);
                return null;
            }

            //保存到服务器
            file.transferTo(new File("D:\\projectWorkspace\\idea\\leyou\\image\\"+originalFilename));

            //返回url，进行回显
            return "http://image.leyou.com/" + originalFilename;
        } catch (IOException e) {
            LOGGER.info("服务器内部错误：{}", originalFilename);
            e.printStackTrace();
        }
        return null;
    }
}
