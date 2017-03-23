package com.navent.realestate.examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.Query;
import org.springframework.data.solr.core.query.SimpleQuery;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Created by mkfuri on 3/16/17.
 */
@RestController
@RequestMapping("/avisos")
public class AvisoController {

    @Autowired
    private SolrTemplate solrTemplate;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<Aviso> avisos(){
        Query query = new SimpleQuery("idAviso:*");
        Page<Aviso> page = solrTemplate.query(query, Aviso.class);
        return page.getContent();
    }
}
