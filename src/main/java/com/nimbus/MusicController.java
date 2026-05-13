package com.nimbus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MusicController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the Nimbus Music API!";
    }

    @GetMapping("/test-song")
    public String getSongName() {
        String title = "Perfect";
        return title;
    }

}
