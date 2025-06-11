package com.alura.Liter_Alura.service;

public interface IConverterDados {
    <T> T  obterDados(String json, Class<T> classe);
}
