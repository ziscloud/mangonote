package com.caiyunworks.mangonote.repo;

import com.caiyunworks.mangonote.entity.Book;
import org.springframework.data.couchbase.repository.CouchbaseRepository;

/**
 * Created by Tony Wang on 8/20/16.
 */
public interface BookRepository extends CouchbaseRepository<Book, Long> {
}
