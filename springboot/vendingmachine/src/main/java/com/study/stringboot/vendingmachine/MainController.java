package com.study.stringboot.vendingmachine;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final ProductRepository productRepository;
    @GetMapping("/")
    public String home(Model model) {
        List<ProductEntity> products = productRepository.findAll();
        int total = products.size();
        model.addAttribute("productList", products );
        model.addAttribute("total", total);
        return "Main";
    }
    @GetMapping("/addProduct")
    public String addProduct() {
        return "addProductForm";
    }
    @PostMapping("/addProduct")
    public String addProduct(Product product) {
        String name = product.getName();
        int price = product.getPrice();
        LocalDate limit_date = product.getLimit_date();
        productRepository.save(new ProductEntity(null,name,price,limit_date));
        return "redirect:/";
    }
    @PostMapping("/deleteProduct")
    public String deleteProduct(@RequestParam int id) {
        productRepository.deleteById(id);
        return "redirect:/";
    }
}
