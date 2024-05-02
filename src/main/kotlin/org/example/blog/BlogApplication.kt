package org.example.blog

import org.springframework.ui.Model
import org.springframework.ui.set

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
@SpringBootApplication
class BlogApplication

@Controller
class HtmlController {

    @GetMapping("/")
    fun blog(model: Model): String {
        model["title"] = "Blog"
        return "blog"
    }
}


fun main(args: Array<String>) {
    runApplication<BlogApplication>(*args) {
        setBannerMode(Banner.Mode.OFF)
    }
}
