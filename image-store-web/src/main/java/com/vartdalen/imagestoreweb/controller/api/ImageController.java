package com.vartdalen.imagestoreweb.controller.api;
import com.vartdalen.imagestoreweb.model.api.Image;
import org.springframework.web.bind.annotation.*;
import com.vartdalen.imagestoreweb.service.api.ImageService;

import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping("/images")
public class ImageController {

    private final ImageService imageService;

    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }

    @ResponseBody
    @GetMapping("/")
    public List<Image> getImages() {
        return imageService.get();
    }

    @ResponseBody
    @GetMapping("/{id}")
    public Image getImage(@PathVariable("id") String id) {
        return imageService.get(Long.parseLong(id));
    }

    @SuppressWarnings("OptionalGetWithoutIsPresent")
    @ResponseBody
    @GetMapping("/latest")
    public Image getImage() {
        return imageService
                .get()
                .stream()
                .min(Comparator.comparing(Image::getCreated))
                .get();
    }

    @PostMapping("/")
    public Image post(@ModelAttribute("image") Image image) {
        return imageService.post(image);
    }

    @PutMapping("/")
    public String put(@ModelAttribute("image") Image image) {
        imageService.put(image);
        return "redirect:/";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") String id) {
        imageService.delete(Long.parseLong(id));
        return "redirect:/";
    }
}