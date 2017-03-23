package com.navent.realestate.examples;

import lombok.Getter;
import lombok.Setter;
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.solr.core.mapping.SolrDocument;

/**
 * Created by mkfuri on 3/23/17.
 */
@Getter
@Setter
@SolrDocument(solrCoreName = "default_core")
public class Aviso {

    @Field
    private Long idAviso;

    @Field
    private String titulo;
}
