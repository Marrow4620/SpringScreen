package br.com.spring.screenmatch.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public interface IConvertDados {
    <T> T obterDados(String json, Class<T> classe);
}
