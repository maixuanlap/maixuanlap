package com.project.lpd.controller;


import com.project.lpd.entity.NewsEntity;
import com.project.lpd.entity.ProductEntity;
import com.project.lpd.entity.RoleEntity;
import com.project.lpd.entity.UserEntity;
import com.project.lpd.model.MapperDto;
import com.project.lpd.model.ProductDto;
import com.project.lpd.service.ProductService;
import com.project.lpd.ultils.FileUploadUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@Controller
public class ProductController {
    public static String uploadDir = System.getProperty("user.dir") + "/src/main/resources/static/images";

    @Autowired
    ProductService productService;

    @GetMapping("/createproduct")
    public String CreateProductForm(Model model) {
        ProductDto productDto = new ProductDto();
        model.addAttribute("productDto", productDto);
        return "create_product";
    }
    @PostMapping(value = "/createproduct")
    public String CreateProduct(@ModelAttribute("productDto") ProductDto productDto,
                                @RequestParam("filename") MultipartFile file,
                                @RequestParam("imgname") String imgname) throws IOException {
       ProductEntity product = new ProductEntity();
       product.setName(productDto.getName());
       product.setQuantity(productDto.getQuantity());
       product.setPrice(productDto.getPrice());
       product.setDescription(productDto.getDescription());
       String imageUUID;
       if(!file.isEmpty()){
           imageUUID = file.getOriginalFilename();
           Path filenamePath = Paths.get(uploadDir, imageUUID);
           Files.write(filenamePath,file.getBytes());
       } else {
           imageUUID = imgname;
       }
       product.setImage(imageUUID);
       productService.createProduct(product);
        return "redirect:/products";

    }


    @GetMapping({"/products"})
    public String ListProduct(Model model, @RequestParam(value = "page", defaultValue = "0") int page, @RequestParam(value = "size", defaultValue = "12") int size) {
        List<ProductEntity> product = productService.AllProduct(PageRequest.of(page, size));
        int totalPage  = productService.getTotalPage(PageRequest.of(page, size));
        model.addAttribute("totalPage", totalPage);
        model.addAttribute("size", size);
        model.addAttribute("page", page);
        model.addAttribute("products", product);
        return "products";
    }
    @GetMapping({"/index"})
    public String ListsProduct(Model model, @RequestParam(value = "page", defaultValue = "0") int page, @RequestParam(value = "size", defaultValue = "5") int size) {
        List<ProductEntity> product = productService.AllProduct(PageRequest.of(page, size));
        int totalPage  = productService.getTotalPage(PageRequest.of(page, size));
        model.addAttribute("totalPage", totalPage);
        model.addAttribute("size", size);
        model.addAttribute("page", page);
        model.addAttribute("products", product);
        return "index";
    }

    @GetMapping({"/listproduct"})
    public String AdminProduct(Model model, @RequestParam(value = "page", defaultValue = "0") int page, @RequestParam(value = "size", defaultValue = "12") int size) {
        List<ProductEntity> products = productService.AllProduct(PageRequest.of(page, size));
        int totalPage  = productService.getTotalPage(PageRequest.of(page, size));
        model.addAttribute("totalPage", totalPage);
        model.addAttribute("size", size);
        model.addAttribute("page", page);
        model.addAttribute("products", products);
        return "listproduct";
    }

    @GetMapping("/updateproduct")
    public String viewUpdateRole(Model model, @RequestParam(value = "id", defaultValue = "0") int id) {
        ProductEntity product = productService.getProductById(id);
        model.addAttribute("role", product);
        return "updateproduct";
    }

    @PostMapping("/updateproduct")
    public String updateRole(@ModelAttribute ProductEntity productEntity, Model model) {
        productService.updateProduct(productEntity);
        return "redirect:/listproduct";
    }
}