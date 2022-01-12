package br.com.pegasus.forum.service;

/**
 * Interface de implementação de service
 * @param <K> Entrada normalmente utilizada para identificação
 * @param <B> Entrada corpo de parametros de validação ou pesquisa
 * @param <R> Retorno
 */
public interface IGenericService<K, B, R>{
    /**
     * Método de execução de service
     * @param key Entrada normalmente utilizada para identificação
     * @param body Entrada corpo de parametros de validação ou pesquisa
     * @return Retorno
     */
    public R execute(K key, B body);
}
