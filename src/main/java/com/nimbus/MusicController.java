package com.nimbus;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MusicController {

    private List<Song> library = new ArrayList<>();

    public MusicController() {
        library.add(new Song("Sparkle", "Radwimps", 400, 320));
        library.add(new Song("Ko Cha Ra", "John Rai", 449, 320));
        library.add(new Song("Fantasy", "Mariah Carey", 409, 320));
        library.add(new Song("Bairan", "Banjaare", 231, 320));
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the Nimbus Music API!";
    }

    @GetMapping("/test-song")
    public String getSongName() {
        String title = "Perfect";
        return title;
    }

    @GetMapping("/current-song")
    public Song getCurrentSong() {
        return new Song("Badal Sari", "Swar", 610, 320);
    }

     //Library
    @GetMapping("/library")
    public List<Song> getLibrary() {
        return library;
    }

    @GetMapping("/library/{index}")
    public ResponseEntity<?> getSongByIndex(@PathVariable("index") int index) {

        try {
            Song foundSong = library.get(index);
            return ResponseEntity.ok(foundSong);
        } catch (IndexOutOfBoundsException e) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Error: Song index " + index + " does not exit in the library.");
        }
    }
}
