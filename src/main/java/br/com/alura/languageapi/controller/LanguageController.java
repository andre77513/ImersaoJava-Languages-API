package br.com.alura.languageapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.languageapi.entity.Language;
import br.com.alura.languageapi.repository.LanguageRepository;

@RestController
public class LanguageController {

    @Autowired
    private LanguageRepository repository;

    @GetMapping("/languages")
    public List<Language> getLanguages() {
        List<Language> languages = repository.findAll();
        return languages;
    }

    @PostMapping("/languages")
    public Language createLanguages(@RequestBody Language language) {
        var languageSave = repository.save(language);
        return languageSave;
    }

    // private List<Language> languages = List.of(new Language(
    // "Java",
    // "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/java/java.png",
    // 2));

    // @GetMapping("/languages")
    // public List<Language> getLanguages() {

    // return languages;
    // }

}
