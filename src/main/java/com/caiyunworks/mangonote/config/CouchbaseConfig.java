package com.caiyunworks.mangonote.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Tony Wang on 8/20/16.
 */
@Configuration
@EnableCouchbaseRepositories(basePackages = {"com.caiyunworks.mangonote.repo"})
public class CouchbaseConfig extends AbstractCouchbaseConfiguration {

    /**
     * The list of hostnames (or IP addresses) to bootstrap from.
     *
     * @return the list of bootstrap hosts.
     */
    @Override
    protected List<String> getBootstrapHosts() {
        return Arrays.asList("127.0.0.1");
    }

    /**
     * The name of the bucket to connect to.
     *
     * @return the name of the bucket.
     */
    @Override
    protected String getBucketName() {
        return "default";
    }

    /**
     * The password of the bucket (can be an empty string).
     *
     * @return the password of the bucket.
     */
    @Override
    protected String getBucketPassword() {
        return "";
    }
}
