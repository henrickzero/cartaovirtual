package br.com.dataprev.cartaov.integration.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;

@RequiredArgsConstructor
@Configuration
public class RestTemplateConfiguration {

    private HttpComponentsClientHttpRequestFactory clientHttpRequestFactory() {
        return new HttpComponentsClientHttpRequestFactory();
    }


}
