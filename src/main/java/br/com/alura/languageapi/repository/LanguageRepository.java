package br.com.alura.languageapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.alura.languageapi.entity.Language;

public interface LanguageRepository extends MongoRepository<Language, String> {
    
}
